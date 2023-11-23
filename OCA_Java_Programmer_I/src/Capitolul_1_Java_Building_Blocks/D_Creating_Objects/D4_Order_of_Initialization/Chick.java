package Capitolul_1_Java_Building_Blocks.D_Creating_Objects.D4_Order_of_Initialization;

//  * Chapter 1: Java Building Blocks
// Creating Objects
// Order of Initialization - page 19/20

// Câmpurile și blocurile de inițializare a instanțelor sunt rulate în ordinea în care apar în fișier.
// Constructorul rulează după ce au rulat toate câmpurile și blocurile de inițializare a instanțelor.

//  * Începem cu metoda main () pentru că de acolo începe Java executarea.
//  Pe linia 26, numim constructorul lui Chick. Java creează un obiect nou.
//  Mai întâi inițializează numele la „Fluffy” pe linia 19.
//  Apoi execută instrucțiunea de imprimare în inițializatorul de instanță de pe linia 20.
//  Odată ce toate câmpurile și inițializatoarele de instanță au rulat, Java revine la constructor.
//  Linia 22 schimbă valoarea numelui în „Mic” și linia 23 imprimă o altă afirmație.
// În acest moment, constructorul este executat și revine la declarația de imprimare de pe linia 27.

public class Chick {
    private String name = "Fluffy";
    { System.out.println("setting field"); }
    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
