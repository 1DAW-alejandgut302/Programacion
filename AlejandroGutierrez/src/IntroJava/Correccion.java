package IntroJava;

import java.util.Scanner;

public class Correccion {
    public static void main(String[] args) {
        int num;
        boolean primo = true;
        System.out.println("Dime un número y te digo si es primo o no");
        Scanner nume = new Scanner(System.in);
        num = nume.nextInt();
        int cont = 2;
       if (num > 1) {
           while (primo && cont < num) {
               if (num % cont == 0) {
                   primo = false;
               } else {
                   cont++;
               }
           }
           if (primo) {
               System.out.println("Tu número es primo");
           } else {
               System.out.println("No es primo");
           }
       } else {
           System.out.println("Debes insertar un número mayor que 1.");
       }
    }
}