package Capitolul_1_Java_Building_Blocks.F_Declaring_and_Initializing_Variables.F1_Declaring_Multiple_Variables;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Declaring and Initializing Variables<br/>
 * Declaring Multiple Variables - pages 26
 */

public class Multiple_Variables {
    // declarați mai multe variabile într-o singură linie dacă sunt de același tip
    String s1, s2;
    String s3 = "yes", s4 = "no";

    // numai i3 este inițializat în mod explicit, deși i1 și i2 sunt, de asemenea,
    // zero, deoarece aceasta este valoarea implicită
    // valoare pentru int vars
    int i1, i2, i3 = 0;

    // exemple valide
    boolean b1, b2;
    String s5 = "1", s6;
    int i4; int i5;

	/* exemple invalide
	 int num, String value;  // NU COMPILEAZA - nu același tip
	 int i6; i7;  // NU COMPILEAZA - niciun tip specificat pentru i7
	 */

    public static void main(String[] args) {
        Multiple_Variables mv = new Multiple_Variables();
        System.out.println(mv.i1);
        System.out.println(mv.i2);
        System.out.println(mv.i3);
    }
}
