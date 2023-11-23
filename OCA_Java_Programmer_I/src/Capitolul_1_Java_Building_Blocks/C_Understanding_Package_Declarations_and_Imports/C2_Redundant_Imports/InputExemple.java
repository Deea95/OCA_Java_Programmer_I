package Capitolul_1_Java_Building_Blocks.C_Understanding_Package_Declarations_and_Imports.C2_Redundant_Imports;

// Java caută automat în pachetul curent alte clase.
// Cu alte cuvinte, nu trebuie să importați o clasă care se află în același pachet cu clasa care o importă.

import java.nio.file.Files;
import java.nio.file.Paths;

//s-ar fi putut folosi și:
//import java.nio.file. *;

public class InputExemple {
    public void read(Files file){
        Paths.get("nume");
    }
}
