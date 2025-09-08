import java.util.Scanner;

public class Main {

    public static int calcSum(int x, int y){

        int result = x + y;
        System.out.println(x + " + " + y + " = " + result);
        return result;
    }

    public static int calcMultiply(int x, int y){

        int product = x * y;
        System.out.println(x + " * " + y + " = " + product);
        return product;
    }

    public static int calcMultTable(int x, int y){
        int prod = x * y;
        return prod;
    }

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

        /* int number = 10;
        for(int i = 0; i < number; i++){
            if(i == 6)
                System.out.println(i);
                continue;
        }

        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();

        System.out.println("Sum is" + " " + calcSum(num1, num2));
        System.out.println("Product is" + " " + calcMultiply(num1, num2));

        System.out.println("Input a number:");
        int numFin = in.nextInt();
        for(int mult = 1 ; mult <= 10; mult++){
            System.out.println(numFin + "x" + mult + "=" + calcMultTable(numFin, mult));
        } */

        int secret = 7;
        int guess;

        do{
            System.out.println("Guess a number between 1 and 10: ");
            guess = in.nextInt();

            if(guess < secret){
                System.out.println("Too low! Try again.");
            }else if (guess > secret) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != secret);

        System.out.println("Correct! You guessed the number.");
        in.close();

        /* int customer = 0;
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
        } while (customer >= 5); */


    }
}