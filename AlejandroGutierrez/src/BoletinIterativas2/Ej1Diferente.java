package BoletinIterativas2;

import java.util.Scanner;

public class Ej1Diferente {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Inserta un número en segundos: ");
        int segundos = sn.nextInt();
        System.out.println("Horas = " + (segundos/3600));
        System.out.println("Minutos = " + (segundos/60));
        System.out.println("Segundos = " + segundos);
    }
}
