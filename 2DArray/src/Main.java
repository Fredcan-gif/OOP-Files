import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter table size: ");
        int size = in.nextInt();

        int[][] table = new int[size][size];

        for(int rows = 0; rows < size; rows++){
            for(int cols = 0; cols < size; cols++){
                table[rows][cols] = (rows + 1) * (cols + 1);
            }
        }

        System.out.println("Multiplication Table of " + size + ":");
        for(int rows = 0; rows < size; rows++){
            for(int cols = 0; cols < size; cols++){
                System.out.printf("%4d", table[rows][cols]);
            }
            System.out.println();
        }

        in.close();


    }
}