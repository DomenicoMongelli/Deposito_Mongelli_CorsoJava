public class VarJava {
    public static void main(String[] args) {

        // Questo è un intero
        int provaNumero = 12;
        // Questa è una stringa
        String provaTesto = "Ciao Mondo";
        // Questa è un booleano
        boolean provaBool = true;

        // Si può dichiarare e inizializzare una variabile in momenti diversi
        boolean provaBool;
        provaBool = false;
        provaBool = true;
        
        // Final rende la variabile costante
        final int provaNumero = 15;
        provaNumero = 20;

        // Println permette di stampare a schermo la variabile
        String testo = "Prova";
        System.out.println(testo);

        // Il testo si può combinare con il carattere +
        testo = "Mondo";
        System.out.println("Ciao" + testo);
        
        // Si possono combinare direttamente le varibiali tra di loro
        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println(fullPart);
        
        String spazio = "Mondo";
        System.out.println(.charAt(0));

        // Per i numeri il + funziona da addizione
        int x = 5;
        int y = 6;
        System.out.println(x + y);

        // Separando con la virgola si possono dichiarare variabili dello stesso tipo
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        
        // Si può assegnare lo stesso valore a diverse varibili in riga
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);
    }
}