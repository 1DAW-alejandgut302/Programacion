package IntroJava;

import java.util.Scanner;

public class Mayor_Y_Menor {
    public static void main (String[] args) {
        Scanner sn = new Scanner(System.in);
        int suma = 0;
        int contPares = 0;
        int contNegativos = 0;
        int mayor = 0;
        int menor = 0;
        System.out.println("Inserta un número. Tienes 5 inserciones.");
        System.out.print("Se va a realizar una suma de los números introducidos y se contarán... ");
        System.out.println("Pares, negativos, y se mostrará el mayor y el menor de los introducidos.");
        for (int i = 0; i <5; i++) {
            System.out.print("Número: ");
            int insercion = sn.nextInt();
            suma += insercion;
            if (insercion % 2 == 0) {
                contPares ++;
            }
            if (insercion < 0) {
                contNegativos ++;
            }
            if (insercion > mayor) {
                mayor = insercion;
            }
            if (insercion < menor) {
                menor = insercion;
            }
        }
        System.out.println("La suma total es igual a " + suma);
        System.out.println("La cuenta de números pares es " + contPares);
        System.out.println("La cuenta de números negativos es " + contNegativos);
        System.out.println("El número más grande introducido es " + mayor);
        System.out.println("El número más pequeño introducido es " + menor);
    }
}
