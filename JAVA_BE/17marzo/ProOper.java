public class ProOper {
    public static void main(String[] args) {
        int x = 100 + 50;

        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 +sum2;

        // Operatori di assegnazione
        int numero = 10;
        numero +=1;
        numero -=2;
        numero *=3;
        System.out.println(numero);

        numero = 10;
        System.out.println(numero++);
        System.out.println(++numero);

        // Operatori di confronto
        int x = 5;
        int y = 3;
        System.out.println(x > y); // return true

        System.out.println(numero < 10 && numero > 5);
        System.out.println(numero < 10 || numero > 5);
        System.out.println(|(numero < 10));
    }
}
