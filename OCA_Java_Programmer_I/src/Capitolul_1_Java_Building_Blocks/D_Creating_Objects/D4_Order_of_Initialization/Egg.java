package Capitolul_1_Java_Building_Blocks.D_Creating_Objects.D4_Order_of_Initialization;

// Chapter 1: Java Building Blocks
// Creating Objects
// Order of Initialization - page 20

// Câmpurile și blocurile sunt executate mai întâi în ordine, setând numărul la 3 și apoi la 4.
// Apoi constructorul rulează, setând numărul la 5.

public class Egg {
    public Egg() {

        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3;
    { number = 4; }
}
