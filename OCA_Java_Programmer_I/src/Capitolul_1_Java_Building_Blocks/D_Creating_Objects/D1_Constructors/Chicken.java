package Capitolul_1_Java_Building_Blocks.D_Creating_Objects.D1_Constructors;

//Chapter 1: Java Building Blocks
// Creating Objects
// Constructors - page 17

//  Scopul unui constructor este de a inițializa câmpuri, deși puteți introduce orice cod acolo.
//  O altă modalitate de inițializare a câmpurilor este de a face acest lucru direct pe linia
//  pe care sunt declarate. Acest exemplu prezintă ambele abordări:

// Pentru majoritatea claselor, nu trebuie să codificați un constructor, deoarece compilatorul
// vă va furniza un constructor implicit „nu faceți nimic”.

public class Chicken {
    int numEggs = 0;  // initialize on line
    String name;
    public Chicken() {
        name = "Duke";  // initialize in constructor
    }
}
