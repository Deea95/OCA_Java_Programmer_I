package Capitolul_1_Java_Building_Blocks.D_Creating_Objects.D3_Instance_Initializer_Blocks;

// * Chapter 1: Java Building Blocks
// * Creating Objects
// * Instance Initializer Blocks - page 18

// Codul dintre acolade se numește bloc de cod.
//   În această clasă există trei blocuri de cod și un inițializator de instanță.
//   Numărarea blocurilor de cod este ușoară: numărați doar numărul de perechi de bretele.
//  Dacă nu există același număr de paranteze deschise ({) și închise (}), codul nu se compilează.
//  Nu contează că un set de aparate dentare se află în metoda main (), tot contează.

//  Când se numără inițializatoarele de instanță, rețineți că nu contează
//  dacă parantezele se află în interiorul unei metode. Există o singură
//  pereche de aparate dentare în afara unei metode. Linia 21 este un inițializator de instanță.

public class InstanceInitializerBlocks {
    public static void main(String[] args) {
        { System.out.println("ceva1"); }
    }
    { System.out.println("ceva2"); }
}
