import java.io.*;
import java.util.*;

public class Main {

    public static int[] generateEvenNumbers(int n){
        int[] numbers = new int[n];

        int currentEven = 2;
        for(int i = 0; i < n; i++){
            numbers[i] = currentEven;
            currentEven += 2;
        }
        return numbers;
    }

    public static int[] generateSquares(int n){
        int[] numbers = new int[n];

        int currentNumber = 1;
        for(int i = 0; i < n; i++){
            numbers[i] = currentNumber * currentNumber;
            currentNumber++;
        }
        return numbers;
    }

    public static int[] reverseArray(int[] arr){
        int[] reverse = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            reverse[i] = arr[arr.length - 1 - i];
        }
        return reverse;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number input: ");
        int num = in.nextInt();

        int[] evens = generateEvenNumbers(num);
        System.out.print("The Even Numbers are: ");
        for(int i = 0; i < num; i++){
            System.out.print(evens[i] + " ");
        }

        System.out.print("\n");
        int[] squares = generateSquares(num);
        System.out.print("The Square Numbers are: ");
        for(int i = 0;i < num; i++){
            System.out.print(squares[i] + " ");
        }

        System.out.print("\n");
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("Enter element for index " + i + ": ");
            arr[i] = in.nextInt();
        }

        int[] reverse = reverseArray(arr);
        System.out.print("The Reverse Array is: ");
        for(int i = 0; i < num; i++){
            System.out.print(reverse[i] + " ");
        }

    }
}