package IntroJava2;

import java.util.Scanner;

public class BucleNumerosSumando {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserta un número: ");
        int num = sc.nextInt();
        int j;
        for (int i=1; i<=num; i++) {
            for (j=1; j<=num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
