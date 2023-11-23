package Capitolul_1_Java_Building_Blocks.H_Understanding_Variable_Scope;

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Variable Scope<br/>
 * pages 31-33
 */

public class A1VariableScope {

    // două variabile locale declarate - ambele au un domeniu de aplicare local pentru metodă
    public void eat(int piecesOfCheese) {  // method parameter
        int bitesOfCheese = 1;  // local variable
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        }  // bitesOfCheese goes out of scope here
        // System.out.println(bitesOfCheese);  // DOES NOT COMPILE - out of scope
    }

    /* blocurile pot conține alte blocuri. Aceste blocuri mai mici conținute pot face referință
    la variabilele definite în blocurile cu scop mai mare, dar nu și invers.
    */
    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        // System.out.println(teenyBit); // DOES NOT COMPILE - teenyBit out of scope
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            boolean timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}
