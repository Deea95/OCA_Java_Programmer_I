package Capitolul_1_Java_Building_Blocks.J_Destroying_Objects.J2_finalize;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Destroying Objects<br/>
 * finalize() - pages 38-39
 *
 * Nu se produce nicio ieșire.
 * Acest lucru se datorează faptului că programul iese înainte de a fi nevoie să rulați colectorul de gunoi.
 * Principalul lucru pe care trebuie să îl înțelegeți despre
 * metoda finalize () este că poate fi numită 0 sau 1 dată, dar niciodată de două ori.
 */

public class Finalizer {
    protected void finalize() {
        System.out.println("Calling finalize");
    }
    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}