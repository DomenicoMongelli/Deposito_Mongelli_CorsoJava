import java.util.Scanner;

public class EsElseIf {
    public static void main(String [] args) {
        // Primo esercizio
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username");
        String username = scanner.nextLine();
        if (username.length() == 0) {
            System.out.println("Username non valido");
        } else if (username.length() < 5) {
            System.out.println("Username troppo corto");
        } else {
          System.out.println("Username valido");
        }

        // Secondo esercizio
        String usernameCorretto = "admin";
        int passwordCorretta = "1234";

        System.out.println("Enter username");
        String username = scanner.nextLine();
        
        System.out.println("Enter password");
        int password = scanner.nextLine();
         
        if (username == usernameCorretto && password == passwordCorretta) {
            System.out.println("Accesso consentito");
        } else if (username != usernameCorretto || password != passwordCorretta) {
            System.out.println("Accesso errato");
        } else {
            System.out.println("Accesso negato");
        }
        scanner.close();

        // Terzo esercizio non sono riuscito a farlo
        
        // Esercizio switch
        System.out.println("Scegli un opzione");
        System.out.println("1 - Visualizza profilo");
        System.out.println("2 - Modifia nome");
        System.out.println("3 - Logout");
        System.out.print("Scelta: ");

        int scelta = scanner.nextInt();
        String username = "";

        switch (scelta) {
            case 1:
                System.out.println("Profilo utente visualizzato"); 
                break;
            case 2:
                System.out.println("Inserire nuovo nome"); 
                Scanner scannerName = new Scanner(System.in);
                username = scannerName.nextLine();
                System.out.println("Nome aggiornato: " + username);
                break;
            case 3:
                System.out.println("Logout effettuato");
                break;
            default:
                System.out.println("Scelta non valida");
            
        }   
        scanner.close();
    }
}
