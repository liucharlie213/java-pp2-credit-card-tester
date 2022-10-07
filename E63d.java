// Charlie Liu CRL2157
// program reads a line of input as a string and 
// prints the number of vowels in the string

import java.util.Scanner;

public class E63d{
    public static void main(String[] args){

        System.out.println("Please enter a string of characters: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String lowerVowels = "aeiou";
        String upperVowels = "AEIOU";
        int count = 0;

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

                count++;
                
            }            
        }
        System.out.println("Number of vowels in the string: " + count );
    }
}