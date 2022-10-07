// Charlie Liu CRL2157
// program reads a line of input as a string and
// prints the positions of all vowels in the string

import java.util.Scanner;

public class E63e{
    public static void main(String[] args){

        System.out.println("Please enter a string of characters: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        boolean found = false;
        String lowerVowels = "aeiou";
        String upperVowels = "AEIOU";

        for (int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);
            // charAt() method returns the character 
            // at a specific index of a string

            String letterStr = String.valueOf(letter);
            // valueOf() method converts different value types to a string
            // converts char variable to String variable

            int index = i; 

            if (lowerVowels.contains(letterStr) || 
                upperVowels.contains(letterStr)){
            // contains() method searches for a String in a given String
                found = true;
                System.out.println(letterStr + " at position " + index);
            }       
        }
        if (found == false){
            System.out.print("No vowels found!");
        }
        System.out.println("\n");
    }
}