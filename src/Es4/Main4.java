package Es4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Inserisci un numero intero per avviare un conto alla rovescia");
        Scanner scanner = new Scanner(System.in);
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Il numero inserito è:" + numero);
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
