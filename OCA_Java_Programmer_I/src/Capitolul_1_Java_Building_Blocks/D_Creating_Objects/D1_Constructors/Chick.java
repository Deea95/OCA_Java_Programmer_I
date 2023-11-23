package Capitolul_1_Java_Building_Blocks.D_Creating_Objects.D1_Constructors;

//* Chapter 1: Java Building Blocks
// * Creating Objects
// * Constructors - page 17
// Există două puncte cheie de remarcat despre constructor:
// numele constructorului se potrivește cu numele clasei și nu există niciun tip de returnare.

// Când vedeți un nume de metodă care începe cu o majusculă și are un tip de
// returnare, acordați-i o atenție specială. Nu este un constructor, deoarece există
// un tip de returnare. Este o metodă obișnuită care nu va fi apelată atunci când scrieți un nou Chick ()
//  public void Chick () {} // NU este un CONSTRUCTOR
public class Chick {
    public Chick() {
        System.out.println("in constructor");
    }
}
