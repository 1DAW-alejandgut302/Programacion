package IntroJava2;

import java.util.Scanner;

public class TablasMultiplicar2 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserta el número de la tabla de multiplicar que quieres: ");
        int num = sc.nextInt();
        System.out.print("Inserta el número hasta el cual quieres multiplicar el anterior: ");
        int limite = sc.nextInt();
        System.out.println("Tabla del " + num + " hasta el " + limite + ":");
        for (int i=1; i<=limite; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
