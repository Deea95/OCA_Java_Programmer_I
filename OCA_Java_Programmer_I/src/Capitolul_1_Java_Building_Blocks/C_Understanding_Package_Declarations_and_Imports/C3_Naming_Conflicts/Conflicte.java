package Capitolul_1_Java_Building_Blocks.C_Understanding_Package_Declarations_and_Imports.C3_Naming_Conflicts;

/*
        * Când clasa se găsește în mai multe pachete, Java vă oferă eroarea de compilare:
        * Tipul Data este ambiguu
        *
        * importă java.util. *;
        * import java.sql. *; // NU SE COMPILĂ
  */

import java.util.Date; // această dată are prioritate, deoarece este importată în mod explicit

/**
 * Chapter 1: Java Building Blocks
 * Understanding Package Declarations and Imports
 * Naming Conflicts - pages 12-13
 * Unul dintre motivele utilizării pachetelor este acela că numele claselor
 * nu trebuie să fie unice în toată Java. Clasa Date există atât în pachetele java.util,
 * cât și în java.sql. Cel din java.util este ales pentru această clasă, deoarece este importat explicit.
 */

public class Conflicte {
    Date date;
    // alt cod..
    java.sql.Date sqlDate;
    // Uneori chiar doriți să utilizați Date din două pachete diferite.
    // Când se întâmplă acest lucru, puteți alege unul pentru a fi utilizat în import și
    // puteți utiliza numele clasei complet calificate a celuilalt
    // (numele pachetului, un punct și numele clasei) pentru a specifica că este special.

    /*
    Sau nu ați putea avea niciunul cu un import și folosiți întotdeauna numele clasei complet calificate:
    */

    class Conflicte2 {
        java.util.Date date;
        java.sql.Date sqlDate;
    }
}
