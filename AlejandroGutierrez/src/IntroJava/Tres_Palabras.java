package IntroJava;

import java.util.Scanner;

public class Tres_Palabras {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        String acumpalabras = "";
        System.out.print("¿Cuántas palabras vas a insertar?: ");
        int palabras = sn.nextInt();
        for (int i=0;i<=palabras; i++) {
            System.out.print("Inserta una palabra: ");
            String insercion = sn.nextLine();
            acumpalabras = insercion + " " + acumpalabras;
        }
        System.out.println("El resultado final es...");
        System.out.println(acumpalabras);
    }
}
