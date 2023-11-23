package Capitolul_1_Java_Building_Blocks.C_Understanding_Package_Declarations_and_Imports.C1_Wildcards;

// * Chapter 1: Java Building Blocks<br/>
// * Understanding Package Declarations and Imports<br/>
// * Simple import - pages 9-10

// Declarația de import îi spune compilatorului ce pachet trebuie să caute pentru a găsi o clasă.
// Regula pentru numele pachetelor este că acestea sunt în mare parte
// litere sau numere separate prin puncte. Regulile sunt aceleași ca și pentru numele variabilelor.


import java.util.Random; // importul ne spune unde să găsim clasa Random
// sau import java.util.* -> Clasele din același pachet sunt adesea importate împreună.
// -> Puteți utiliza o comandă rapidă pentru a importa toate clasele dintr-un pachet.
// -> * Este un wildcard care se potrivește cu toate clasele din pachet.
// -> Fiecare clasă din pachetul java.util este disponibilă pentru acest program când Java îl compilează.
// -> Nu importă pachete, câmpuri sau metode copil; importă numai clase.

public class Wildcards {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));  // tipăriți un număr între 0 și 9
    }
}
