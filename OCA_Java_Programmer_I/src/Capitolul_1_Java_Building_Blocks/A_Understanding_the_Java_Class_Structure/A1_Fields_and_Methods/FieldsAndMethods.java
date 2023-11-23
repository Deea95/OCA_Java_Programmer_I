package Capitolul_1_Java_Building_Blocks.A_Understanding_the_Java_Class_Structure.A1_Fields_and_Methods;

//Capitolul 1: Java Building Blocks
//   Understanding the Java Class Structure
//  Fields and Methods - page 3

public class FieldsAndMethods { // cea mai simpla clasa Java

    String nume ; //  o clasa simpla cu un camp

    // se genereaza getter si setter
    public String getNume() { // metoda getNume
        return nume;
    }

    public void setNume(String nume) {  // metoda setNume
        this.nume = nume;
    }

    //
}
