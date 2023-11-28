package Es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("inserisci una parola e premi invio");
        Scanner scanner = new Scanner(System.in);
        String parola = scanner.nextLine();
        System.out.println(stringaDispari(parola));
        System.out.println("Inserisci un anno");
        String year = scanner.nextLine();
        System.out.println(stringaDispari(year));
    }

    public static Boolean stringaDispari(String parolaDaInserir) {
        String[] newArr = parolaDaInserir.split("");
        if (newArr.length % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean annoBisestile(int year) {
        if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}