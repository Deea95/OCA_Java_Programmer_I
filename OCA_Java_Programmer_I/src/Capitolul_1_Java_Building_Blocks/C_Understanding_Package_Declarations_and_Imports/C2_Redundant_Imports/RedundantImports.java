package Capitolul_1_Java_Building_Blocks.C_Understanding_Package_Declarations_and_Imports.C2_Redundant_Imports;

//* Chapter 1: Java Building Blocks<br/>
// * Understanding Package Declarations and Imports<br/>
// * Redundant Import - pages 11-12

// Pachetul java.lang este special prin faptul că este importat automat.
// Puteți utiliza clase specifice în importuri sau metacaractere, dar nu trebuie să le utilizați simultan.


import java.lang.System;  // redundant import
import java.lang.*;       // redundant import
import java.util.Random;

public class RedundantImports {
    public static void main(String[] args) {
            Random r = new Random();
            System.out.println(r.nextInt(10));
    }
}

