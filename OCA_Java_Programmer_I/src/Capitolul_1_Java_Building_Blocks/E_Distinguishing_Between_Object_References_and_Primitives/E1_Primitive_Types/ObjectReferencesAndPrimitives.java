package Capitolul_1_Java_Building_Blocks.E_Distinguishing_Between_Object_References_and_Primitives.E1_Primitive_Types;

//  Chapter 1: Java Building Blocks<br/>
//  Distinguishing Between Object References and Primitives<br/>
//  Primitives and Object References - pages 20-24

public class ObjectReferencesAndPrimitives {
    // Java are opt tipuri de date primitive încorporate
    boolean bool = true;
    byte b = 123;        // Valoare integrală pe 8 biți
    short s = 123;       // Valoare integrală pe 16 biți
    int i = 123;         // Valoare integrală pe 32 biți
    long l = 123;        // Valoare integrală pe 64 biți
    float f = 123.45f;   // Valoare în virgulă mobilă pe 32 de biți
    double d = 123.45;   // Valoare în virgulă mobilă pe 64 de biți
    char c = 'a';        // Valoare Unicode pe 16 biți

    // long max = 3123456789;  // NU SE COMPILEAZA - valoare prea mare
    long max = 3123456789L;  // acum Java știe că este mult

    int decimal = 56;        // 56
    int binary = 0b11;       // 3
    int octal = 017;         // 15
    int hexadecimal = 0x1F;  // 31

    // sublinierile ( _ ) sunt permise pentru a ușura citirea numerelor
    int million1 = 1000000;
    int million2 = 1_000_000;

    /* exemple gresite !!!
    double = notAtStart = _1000.00;  // NU COMPILEAZA
    double notAtEnd = 1000.00_;      // NU COMPILEAZA
    double notByDecimal = 1000_.00   // NU COMPILEAZA
     */
    double annoyingButLegal = 1_00_0.0_0;  // acesta compilează


    public static void main(String[] args) {
        // declarați tipul de referință
        java.util.Date today;
        String greeting;

        // atribuiți referințele la obiecte noi
        today = new java.util.Date();
        greeting = "Ce mai faci?";

        // valoarea nulă poate fi atribuită numai referințelor obiectelor
        String s = null;
        // int value = null;  // Nu compileaza

        // metodele pot fi apelate la referințe de obiect care nu sunt nule
        String reference = "hello";
        int len = reference.length();
        // int bad = len.length(); // Nu compileaza
    }
}
