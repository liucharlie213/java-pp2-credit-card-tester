// Charlie Liu CRL2157
// program reads a line of input as a string and
// prints only the uppercase letters in the string

import java.util.Scanner;

public class E63a{

    public static void main(String[] args) {
        
        System.out.println("Please enter a string of characters: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // takes in an input as a String
        boolean found = false;
        // found is a flag to determine if an uppercase letter 
        // has been found
        
        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            // charAt() method returns the character 
            // at a specific index of a string
            
            if (Character.isUpperCase(letter) == true){
            // isUpperCase() method determines whether the specified 
            // char value is uppercase
                found = true;
                System.out.print(letter);
            }
        }
        
        if (found == false){
            System.out.println("No uppercase letters found");
        }
        System.out.println("\n");
    }
}