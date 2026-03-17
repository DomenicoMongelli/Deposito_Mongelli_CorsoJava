// Casting
public class Main {
    public static void main(String[] args) {
        // Widening casting
        int myint = 9;
        double myDouble = myInt; // Casting automatico: int to double

        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        //Casting restringente
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Casting manuale: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt); // Outputs 9
    }
}