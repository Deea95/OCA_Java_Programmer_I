package Capitolul_1_Java_Building_Blocks.G_Understanding_Default_Initialization_of_Variables.G1_Local_Variables;

// Chapter 1: Java Building Blocks<br/>
// Understanding Default Initialization of Variables<br/>
// Local Variables - pages 29-31

// O variabilă locală este o variabilă definită în cadrul unei metode.
// Variabilele locale trebuie inițializate înainte de utilizare. Nu au o valoare implicită și conțin date
// despre gunoi până la inițializare. Compilatorul nu vă va permite să citiți o valoare neinițializată.

// Variabilele care nu sunt variabile locale sunt cunoscute ca variabile de instanță sau variabile de clasă.
// Variabilele de instanță sunt, de asemenea, numite câmpuri.
// Variabilele de clasă sunt partajate între mai multe obiecte.
// Puteți spune că o variabilă este o variabilă de clasă, deoarece are în față cuvântul cheie static.

public class VariabileleLocale {

    // exemplu de inițializare a variabilei locale (sau lipsa acesteia)
    public int valid() {
        int y = 10;
        int x;  // x e declarat aici
        // int reply = x + y;  // NU se compileaza - x nu a fost declarat
        x = 3;  // x este initializat aici
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch);  // NU SE COMPILEAZA - s-ar putea să nu fie inițializat
    }

    // inițializare variabilă de instanță și clasă (statică) - aceleași reguli se aplică ambelor
    boolean b;  // defaults to false
    byte aByte; // defaults to 0
    short s;    // defaults to 0
    int i;      // defaults to 0
    long l;     // defaults to 0
    float f;    // defaults to 0.0
    double d;   // defaults to 0.0
    char c;     // defaults to '\u0000'
    Object o;   // defaults to null - goes for any/all object reference vars

    public static void main(String[] args) {
        VariabileleLocale vl = new VariabileleLocale();
        System.out.println(vl.c);
    }
}
