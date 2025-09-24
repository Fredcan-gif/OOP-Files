import java.io.*;
import java.util.*;

class Geeks{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter text:");
        String str = in.next();

        System.out.print("Enter character to count:");
        char letter = in.next().charAt(0);

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == Character.toLowerCase(letter) || str.charAt(i) == Character.toUpperCase(letter)){
                count++;
            }
        }

        System.out.println("Count the occurence of  " + letter + ": " + count);
    }
}