// Charlie Liu CRL2157
// program reads a line of input as a string and
// prints the string, with all vowels replaced by an underscore 

import java.util.Scanner;

public class E63c{
    public static void main(String[] args) {
        
        System.out.println("Please enter a string of characters: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String newMessage = "";
        String lowerVowels = "aeiou";
        String upperVowels = "AEIOU";
        // Strings of vowels to check the characters against

        for (int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            // charAt() method returns the character 
            // at a specific index of a string

            String letterStr = String.valueOf(letter);
            // valueOf() method converts different value types to a string
            // converts char variable to String variable

            if (lowerVowels.contains(letterStr) || 
                upperVowels.contains(letterStr)){
            // contains() method searches for a String in a given String
            
                newMessage += "_";
            }
            else{
                newMessage += letter;
            }
        }
        System.out.println(newMessage);
    }
}