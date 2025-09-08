import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* System.out.println("Input number:");
        int num1 = in.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Burger");
                break;
            case 2:
                System.out.println("Sandwich");
                break;
            case 3:
            case 4:
                System.out.println("Fries");
                break;

            default:
                System.out.println("Input not found");
                break;
        }

        System.out.println("Input string:");
        String tennis = in.next();

        switch (tennis) {
            case "Dog":
                System.out.println("Bark");
                break;
            case "Cat":
                System.out.println("Meow");
                break;

            default:
                System.out.println("Item not found");
                break;
        } */

        int customer = 0;
        do {
            System.out.println("MENU:");
            System.out.println("1. Burger - ₱80.00");
            System.out.println("2. Fries - ₱90.00");
            System.out.println("3. Salad - ₱110.00");
            System.out.println("4. Soda - ₱75.00");

            System.out.println("Enter your order:");
            customer = in.nextInt();

            switch (customer) {
                case 1:
                    System.out.println("1. Burger - ₱80.00");
                    break;
                case 2:
                    System.out.println("2. Fries - ₱90.00");
                    break;
                case 3:
                    System.out.println("3. Salad - ₱110.00");
                    break;
                case 4:
                    System.out.println("4. Soda - ₱75.00");
                    break;
                case 5:
                    System.out.println("Thank You! Visit again!\n");
                    break;
                default:
                    System.out.println("Invalid options, enter again.\n");
                    break;
            }
        } while (customer >= 5);


    }
}