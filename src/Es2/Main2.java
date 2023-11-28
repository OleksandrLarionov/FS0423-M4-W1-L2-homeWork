package Es2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("inserisci un valore da 0 a 3 :");
        Scanner scanner = new Scanner(System.in);
        int numero = Integer.parseInt(scanner.nextLine());
        numeroIntero(numero);
        scanner.close();


    }

    public static void numeroIntero(int numero) {
        switch (numero) {
            case 0: {
                System.out.println("Zero");
                break;
            }
            case 1: {
                System.out.println("Uno");
                break;
            }
            case 2: {
                System.out.println("Due");
                break;
            }
            case 3: {
                System.out.println("Tre");
                break;
            }
            default: {
                System.out.println("ERROR Il numero inserito non è corretto");
            }
        }
    }
}
