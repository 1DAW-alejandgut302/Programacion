package IntroJava2;

import java.util.Scanner;

public class BuclesAnidadosI {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserta un número: ");
        int num = sc.nextInt();
        for (int i=0; i<num; num --) {
            for (int j=1; j<=num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
