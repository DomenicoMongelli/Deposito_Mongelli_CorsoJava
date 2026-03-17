public class ProStr {
    public static void main(String[] args) {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());

        String txt = "Please locate where 'locate' occurs!";
        System.out.println();

        // + può essere utilizzato anche per la concatenazione
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " +lastName);

        // Si può utilizzare anche il metodo concat()
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        // Le stringhe devono essere scritte tra virgolette quindi java ha bisogno del carattere escape barra rovesciata che trasforma i caratteri rovesciati in caratteri stringa
        String txt = "We are the so called \'Vikings\' from the north";
        String txt = "It\'s alright";
        String txt = "The character \\ is called backlash";

        // Il metodo standard per dividere una stringa è split()
        String str = "Hello World";
        String[] words = str.split("//s");
        System.out.println(Arrays.toString(words));

        // Il metodo string ritorna il numero di caratteri in un oggetto
        String descrizione = "Articolo sulle stringhe...";
        int length = descrizione.length();
        System.out.println("Lunghezza: " + length);
    }
}
