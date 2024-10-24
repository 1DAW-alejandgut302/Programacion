package IntroJava2;

import java.util.Scanner;

public class InvitarAmigos {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean invitarAmigo = true;
        int contAmigos = 0;
        System.out.print("¿Cuánto dinero tienes hoy?: ");
        float dinero = sc.nextFloat();
        System.out.print("¿Cuál es el precio de los refrescos hoy?: ");
        float precioRefrescos = sc.nextFloat();
        while (invitarAmigo && ((dinero - precioRefrescos) >= 0)) {
            System.out.print("¿Quieres invitar a un amigo? (1:Invitar; 2:No Invitar): ");
            int insercion = sc.nextInt();
            if (insercion == 1) {
                dinero -= precioRefrescos;
                contAmigos ++;
            } else if (insercion == 2) {
                invitarAmigo = false;
            } else {
                System.out.println("Por favor, inserta 1 o 2.");
            }
        }
        System.out.println("Los resultados son...");
        System.out.println("Te queda(n) " + dinero + " euro(s) para mañana.");
        System.out.println("Has invitado a " + contAmigos + " amigos.");
        System.out.println("Hoy te has gastado " + (precioRefrescos*contAmigos) + " euros.");
    }
}
