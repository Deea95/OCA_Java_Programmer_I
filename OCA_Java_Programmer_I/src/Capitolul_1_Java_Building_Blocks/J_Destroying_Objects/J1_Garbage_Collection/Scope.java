package Capitolul_1_Java_Building_Blocks.J_Destroying_Objects.J1_Garbage_Collection;

/**
 * Chapter 1: Java Building Blocks
 * Destroying Objects
 * Garbage Collection - page 37
 */

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;  // obiectul care deține șirul „a” este acum eligibil pentru colectarea gunoiului
        System.gc();  // sugerați JVM că acum este un moment bun pentru a rula colectarea gunoiului - nu este garantat!
        String three = one;
        one = null;
    }
}