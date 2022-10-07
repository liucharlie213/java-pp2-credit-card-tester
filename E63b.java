// Charlie Liu CRL2157
// program reads a line of input as a string and 
// prints every second letter of the string.

import java.util.Scanner;

public class E63b{

    public static void main(String[] args) {
        
        System.out.println("Please enter a string of characters: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        for(int i = 1; i < str.length(); i = i+2){
            System.out.print(str.charAt(i));
            // charAt() method returns the character 
            // at a specific index of a string
        }
        System.out.println("\n");
    }
}