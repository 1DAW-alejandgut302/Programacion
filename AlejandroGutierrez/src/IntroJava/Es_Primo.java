package IntroJava;

import java.util.Scanner;

public class Es_Primo {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Introduce un número para saber si es primo: ");
        int num = sn.nextInt();
        boolean divisible = false;
        for (int i = 2; (i < num); i++) {
            if (num % i == 0) {
                divisible = true;
            }
        }
        if (divisible) {
            System.out.println(num + " no es un número primo.");
        } else {
            System.out.println(num + " es un número primo.");
        }
    }
}
