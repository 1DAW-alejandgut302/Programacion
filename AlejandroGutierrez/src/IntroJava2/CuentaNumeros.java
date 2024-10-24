package IntroJava2;

public class CuentaNumeros {
    public static void main (String[] args) {
        int suma = 0;
        int contNum = 0;
        for (int i = 2; i <= 30; i +=2) {
            if (i == 30) {
                System.out.println(i);
                suma += i;
                contNum ++;
            } else if (i < 10 || i > 20) {
                System.out.print(i + ", ");
                suma += i;
                contNum ++;
            }

        }
        System.out.println("Hay un total de " + contNum + " números.");
        System.out.println("La suma total es de " + suma);
    }
}
