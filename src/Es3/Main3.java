package Es3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Inzerisci una stringa (':q' per uscire): ");
            String stringaInserita = scanner.nextLine();
            if (stringaInserita.equals(":q")) {
                System.out.println("Cia!");
                break;
            }
            String[] lettere = stringaInserita.split("");
            String finalResult = String.join(",", lettere);
            System.out.println("Caratteri separati da virgola: " + finalResult);
        }
        scanner.close();
    }
}
