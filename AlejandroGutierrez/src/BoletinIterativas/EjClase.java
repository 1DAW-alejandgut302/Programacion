package BoletinIterativas;

public class EjClase {
    public static void main (String[] args) {
        int suma = 0;
        int mult = 1;
        int contsuma = 0;
        int contmult = 0;
        int i;
        for (i = 1; i <= 20; i++) {
            if (i > 5) {
                suma += i;
                contsuma ++;
            } else {
                mult *= i;
                contmult ++;
            }
        }
        System.out.println("Valor de i = " + i);
        System.out.println("Suma de los mayores de 5: " + suma);
        System.out.println("Multiplicación de los menores o iguales de 5: " + mult);
        System.out.println("Cuenta de los mayores de 5: " + contsuma);
        System.out.println("Cuenta de los menores o iguales de 5: " + contmult);
    }
}
