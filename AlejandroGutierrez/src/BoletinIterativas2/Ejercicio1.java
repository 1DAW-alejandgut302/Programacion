package BoletinIterativas2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Inserta un número en segundos: ");
        int insercion = sn.nextInt();
        int segundos = 0;
        int segundosTotales =0;
        int minutos;
        int horas =0;
        for (minutos = 0; segundosTotales < insercion; minutos++) {
            if (minutos == 60) {
                horas ++;
                minutos = 0;
            }
            for (int i=1; i <= insercion && i<= 60; i++) {
                if (i == 60) {
                    segundos = 0;
                } else {
                    segundosTotales ++;
                    segundos ++;
                }
            }

        }
        System.out.println("Horas = " + horas);
        System.out.println("Minutos = " + minutos);
        System.out.println("Segundos = " + segundos);
    }
}
