package Capitolul_1_Java_Building_Blocks.I_Ordering_Elements_in_a_Class;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Ordering Elements in a Class<br/>
 * page 35
 */

public class A1Meerkat {  // apoi vine clasa care este singurul element necesar
    double weight;  // câmpurile și metodele merg în orice ordine
    public double getWeight() {
        return weight;
    }
    double height;  // un alt câmp, nu trebuie să fie grupate
}