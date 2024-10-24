package BoletinIterativas2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Inserta un número en segundos: ");
        int insercion = sn.nextInt();
        int segundos = 0;
        int segundosTotales =0;
        int minutos=0;
        int horas =0;
        while (segundosTotales < insercion) {
            for (int i=1; i <= insercion && i<= 60; i++) {
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                segundos++;
                segundosTotales ++;
            }
            if (minutos == 60) {
                horas ++;
                minutos = 0;
            }
        }
        System.out.println("Horas = " + horas);
        System.out.println("Minutos = " + minutos);
        System.out.println("Segundos = " + segundos);
    }
}
