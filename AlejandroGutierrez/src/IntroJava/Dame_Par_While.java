package IntroJava;

import java.util.Scanner;

public class Dame_Par_While {
    public static void main (String[] args) {
        Scanner sn=new Scanner(System.in);
        int insercion = 1;
        while (insercion %2!=0) {
            System.out.print("Inserta un número par para acabar la ejecución: ");
            insercion = sn.nextInt();
        }
    }
}
