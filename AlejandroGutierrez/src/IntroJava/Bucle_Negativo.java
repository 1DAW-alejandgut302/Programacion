package IntroJava;

import java.util.Scanner;

public class Bucle_Negativo {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        int bandera =0;
        int contIntroducidos = 0;
        int contImpares = 0;
        int sumaImpares = 0;
        int mayorPares = Integer.MIN_VALUE;
        while (bandera >=0) {
            System.out.print("Introduce un número. Ingresa un negativo para detener la ejecución: ");
            bandera = sn.nextInt();
            if (bandera >= 0) {
                contIntroducidos++;
                if (bandera % 2 != 0) {
                    contImpares++;
                    sumaImpares += bandera;
                } else {
                    if (bandera > mayorPares) {
                        mayorPares = bandera;
                    }
                }
            }
        }
        System.out.println("Los resultados son...");
        System.out.println("Números introducidos: " + contIntroducidos);
        System.out.println("Media de los impares: " + (sumaImpares/contImpares));
        System.out.println("Mayor número par introducido: " + mayorPares);
    }
}
