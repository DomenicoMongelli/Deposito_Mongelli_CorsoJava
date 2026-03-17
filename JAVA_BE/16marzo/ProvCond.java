public class ProvCond {
    public static void main(String[] args) {
        // Condizioni IF e ELSE

        // Es 1
        if(20 > 18) {
            System.out.println("20 is greater than 18");
        }
 
        // Es 2
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("X is greater than y");
        }

        // Es 3
        int time = 20;
        if (time < 18) {
            System.out.println("Good day");
        } else {
            // Outputs "Good Evening"
            System.out.println("Good evening"); 
        }

        // Condizioni Switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
