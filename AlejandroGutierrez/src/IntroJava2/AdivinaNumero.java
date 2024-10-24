package IntroJava2;

import java.util.Scanner;

public class AdivinaNumero {
    public static void main (String[] args) {
        Scanner sn = new Scanner(System.in);
        int numAleatorio = (int) (Math.random()*(50) +1);
        boolean adivinar = false;
        while (!adivinar) {
            System.out.print("Inserta un número del 1 al 50 a ver si adivinas el número secreto: ");
            int insercion = sn.nextInt();
            if (insercion == numAleatorio) {
                adivinar = true;
                System.out.println("¡Enhorabuena! Has adivinado el número secreto");
            } else if (insercion > numAleatorio) {
                System.out.println("El número insertado es MAYOR que el número secreto. Prueba otra vez.");
            } else {
                System.out.println("El número insertado es MENOR que el número secreto. Prueba otra vez.");
            }
        }
    }
}
