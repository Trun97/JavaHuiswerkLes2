
public class JavaOpdracht1 {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Michiel";

        hello();
        positiveOrNegative(7);
        positiveOrZeroOrNegative(-9);
        bartender(name);
        System.out.println(sum(input1, input2));

    }

    public static void hello () {
        System.out.println("Hello World");
    }

    public static void positiveOrNegative(int number){
        if (number > 0) {
            System.out.println("This number is positive");
        } else System.out.println("This number is Negative");
    }

    public static void positiveOrZeroOrNegative (int number) {
        if (number > 0) {
            System.out.println("This number is positive");
        } else if (number < 0) {
            System.out.println("This number is negative");
        } else System.out.println("This number is zero");
    }
    public  static void bartender(String customer) {
        switch (customer) {
            case "Henk":
                System.out.println("Espresso Martini");
                break;
            case "Ben":
                System.out.println("Gin Martini");
                break;
            default:
                System.out.println("Niet gevonden");

        }
    }
    public static int sum (int input1, int input2) {
        return input1 + input2;
    }




}
