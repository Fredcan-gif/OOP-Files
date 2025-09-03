import java.util.Scanner;


class a{
    private static final double PI = 3.14;
}



public class Main {

    static final double PI = 3.14;

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

                /* System.out.println("Enter number 1:");
                int number1 = input.nextInt();

                System.out.println("Enter number 2:");
                int number2 = input.nextInt();

                int resultFi = number1 + number2;
                System.out.println("The result is" + " " + resultFi);

                System.out.println("Input your name:");
                String text = input.nextLine();

                System.out.println("Input your age:");
                int age = input.nextInt();

                System.out.println("Input your desired grade:");
                double desired = input.nextDouble();

                System.out.println("Input your midterm grade:");
                double midterm = input.nextDouble();

                System.out.println("Input your final grade:");
                double finals = input.nextDouble();

                double equals = midterm + finals;
                double average = equals / 2;

                System.out.println("The string is:" + " " + text);
                System.out.println("Your age is" + " " + age);
                System.out.println("Your desired grade is" + " " + desired);

                System.out.println("Your average grade is" + " " + average);
                System.out.println("Your rounded average grade is" + " " + Math.round(average)); */

                int counter = 3;
                System.out.println("Input Customer's Name:");
                String customer = input.nextLine();

                System.out.println("Items remaining to process:" + " " + counter);

                System.out.println("Input price of first item:");
                double price1 = input.nextDouble();

                System.out.println("Items remaining to process:" + " " + (--counter));

                System.out.println("Input price of second item:");
                double price2 = input.nextDouble();

                System.out.println("Items remaining to process:" + " " + (--counter));

                System.out.println("Input price of third item:");
                double price3 = input.nextDouble();

                System.out.println("Items remaining to process:" + " " + (--counter));

                System.out.println("==================================");
                System.out.println("RECEIPT");
                System.out.println("Customer Name:" + " " + customer);
                System.out.println("Items in Cart:" + " " + (counter += 3));
                System.out.println("1st Item Price:" + " " + price1);
                System.out.println("2nd Item Price:" + " " + price2);
                System.out.println("3rd Item Price:" + " " + price3);
                System.out.println("==================================");

                input.close();

                    /* double value = Math.PI;
                    int test = 4;
                    String strNum = "100";
                    String strNum2 = "50";

                    int num1 = 300;
                    int num2 = 400;
                    int a = 5;
                    int b = 4;
                    boolean x = true;
                    boolean y = false;




                    int convertInt = Integer.parseInt(strNum);
                    double convertDouble = Double.parseDouble(strNum);
                    int result = convertInt + num1;
                    double result2 = convertDouble + num1;

                    System.out.println("a + 3 =" + " " + (a += 3));
                    System.out.println("PostIncrement" + " " + (b++));
                    System.out.println("PreIncrement" + " " + (+b));
                    System.out.println("The double is" + " " + result2);
                    System.out.println("The sum in double is" + " " + convertInt + num1);
                    System.out.println("The sum is" + " " + result);
                    System.out.println("The value is" + " " + test);
                    System.out.println("Help me");
                    System.out.println("User Defined Constant" + " " + PI);
                    System.out.println("Getting PI from Math Class" + " " + value); */

        }
}