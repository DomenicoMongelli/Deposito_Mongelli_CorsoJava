import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) {
        
    // Verifica del segno di un numero:
    Scanner scanner = new Scanner(System.in);

    System.out.print("Inserisci numero intero");
    int num = scanner.nextInt();

    if (num > 0) {
        System.out.println("Il numero è positivo");
    } else if (num < 0) {
        System.out.println("Il numero è negativo");
    } else {
        System.out.println("Il numero è zero");
    }

    // Confronto tra due numeri:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci il primo numero");
    int num1 = scanner.nextInt();
    System.out.println("Inserisci il secondo numero");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
        System.out.println("Il primo numero è maggiore");
    } else if (num1 < num2) {
        System.out.println("Il secondo numero è maggiore");
    } else {
        System.out.println("I numeri sono uguali");
    }

    // Controllo di età:
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci la tua età");
    int age = scanner.nextInt();

    if (age < 18) {
        System.out.println("Sei minorenne");
    } else {
        System.out.println("Sei maggiorenne");
    }

    // Verifica dell'anno bisestile
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci anno");
    int year = scanner.nextInt();

    if (year % 400 == 0) {
        System.out.println("L'anno è bisestile");
    } else {
        System.out.println("L'anno non è bisestile");
    }
}
