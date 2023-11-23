package Capitolul_1_Java_Building_Blocks.F_Declaring_and_Initializing_Variables.F2_Identifiers;

// * Chapter 1: Java Building Blocks
// * Declaring and Initializing Variables
// * Declaring Multiple Variables - page 28

// Există doar trei reguli de reținut pentru identificatorii legali:
// 1. Numele trebuie să înceapă cu o literă sau simbolul $ sau _.
// 2. Caracterele ulterioare pot fi, de asemenea, numere.
// 3. Nu puteți utiliza același nume ca un cuvânt rezervat Java.

// După cum ți-ai putea imagina, un cuvânt rezervat este un cuvânt cheie rezervat de Java,
// astfel încât să nu ai voie să îl folosești.
//  Amintiți-vă că Java este sensibil la majuscule și minuscule, astfel încât să puteți
//  utiliza versiuni ale cuvintelor cheie care diferă numai în majuscule. Vă rog, totuși, nu.

public class Identificatori {
    // identificatori buni
    int okidentifier;
    int $OK2Identifier;
    int _alsoOK1d3ntifi3r;
    int __SStillOkbutKnotsonice$;

	/* identificatori incorecti
	int 3DPointClass   // identificatorii nu pot începe cu un număr
	int hollywood@vine // @ nu este o literă, cifră, $ sau _
	int *$coffee       // * nu este o literă, cifră, $ sau _
	int public         // public este un cuvânt rezervat
	 */
}
