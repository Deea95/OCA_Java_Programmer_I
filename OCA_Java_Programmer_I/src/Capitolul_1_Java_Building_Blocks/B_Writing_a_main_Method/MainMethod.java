package Capitolul_1_Java_Building_Blocks.B_Writing_a_main_Method;

//Chapter 1: Java Building Blocks
// * Understanding the Java Class Structure
// * Writing a main() Method with parameters - page 6-7-8

// Această clasă ilustrează o clasă cu o metodă main () care folosește argumentele
// care i-au fost transmise. Toate argumentele sunt tratate ca Strings


public class MainMethod {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
