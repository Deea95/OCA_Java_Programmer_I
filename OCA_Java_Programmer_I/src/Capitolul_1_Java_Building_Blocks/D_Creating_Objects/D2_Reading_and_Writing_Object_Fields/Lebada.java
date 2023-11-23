package Capitolul_1_Java_Building_Blocks.D_Creating_Objects.D2_Reading_and_Writing_Object_Fields;

//  * Chapter 1: Java Building Blocks
// * Creating Objects
// * Reading and Writing Object Fields - page 18

// Este posibil să citiți și să scrieți variabile de instanță direct de la apelant.
// În acest exemplu, o lebădă mamă depune ouă.

// Citirea unei variabile este cunoscută sub numele de a o obține.
// Clasa primește (GET) numarOua direct pentru a o imprima.
// Scrierea pe o variabilă este cunoscută sub numele de setare (SET). Această clasă setează numarOua la 1.

public class Lebada {
    int numarOua;

    public static void main(String[] args) {
        Lebada mama = new Lebada();
        mama.numarOua = 1;
        System.out.println(mama.numarOua);
    }
}
