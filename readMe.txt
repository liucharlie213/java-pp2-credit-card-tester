1. E6.3a-e
a) For this problem I took a String input from the user,
   then iterated through the String using a for loop. Using the 
   charAt() method I found on W3School's Java page, I converted
   each character into a char type. Then I checked if each character 
   was an uppercase letter using the isUpperCase() method which 
   I found on tutorialspoint's Java page. I also used a flag to determine 
   if there were any uppercase letters at all.

   I named my flag, found, because it was a representation of whether
   any uppercase letters in the inputed String. I initialized it to false
   so that when one was found it's value would change to true, and if
   there wasn't any, a message would print found 
   
b) For this problem I took a String input from the user, then used a for
   loop to iterate through the characters of the String using the charAt() 
   method again. I started the iterating at the character at index = 1 which 
   means it starts at the second letter. 

c) For this problem I took a Sting input from the user, and then I created
   new String variables newMessage, lowerVowels, and upperVowels. I initialized 
   newMessage as an empty string so that I could add to it later, and I 
   initialized lowerVowels and upperVowels to the vowels in lowercase and 
   uppercase respectively so that later I could compare the characters of 
   the inputed String to them. 

    Next I iterated through the inputed String by using the charAt() method,
    but then I had to convert each character back to the String class using the
    valueOf() method which I found on stackoverflow. The value of each String 
    was then stored in a new variable letterStr. Next I used the contains() method 
    which I found on geeksforgeeks to check if letterStr is contained in 
    either lowerVowels or upperVowels (meaning it is a vowel). If it is contained 
    in either, the newMessage variable gets a "-" added to it, if not then the 
    String itself is added to newMessage. This makes sure that things like 
    capitalization doesn't change when outputting the new String

    I named newMessage that because it was the updated/changed version of the 
    original String. I named lowerVowels that because it was a string of the 
    lowercase vowels and the same reason for upperVowels and uppercase vowels. 
    I named letterStr that because it is a String type that only holds one letter 
    at a time 

d) For this problem I take an input from the user then I create new variables
   lowerVowels and upperVowels. I initialized lowerVowels and upperVowels to the 
   vowels in lowercase and uppercase respectively so that later I could compare 
   the characters of the inputed String to them. I also create a new int variable 
   count so that I can keep track of the number of vowels in the String.
   Next I run a for loop that iterates through the String and using the same methods
   in E6.3c I check if there are any vowels in the inputed String. If there are, the
   count variable increases by 1 every single time a vowel is present. The count 
   is then printed afterwords

   I named lowerVowels and upperVowels for the same reasons as I did in E6.3c. 
   I named count becuase that's its function in this code

e) For this probelm I take an input from the user then I create new variables
   lowerVowels and upperVowels. I initialized lowerVowels and upperVowels to the 
   vowels in lowercase and uppercase respectively so that later I could compare 
   the characters of the inputed String to them. I also created a flag variable called 
   found to keep track of if there were any vowels to begin with
   
   Then using a for loop, I iterate through the String and check if there are 
   any vowels using the same methods from E6.3c and E6.3d. In the for loop I create 
   a new integer variable index so that it can keep track of the position of which 
   character in the String is being compared. Then I use an if statement to check 
   if that character is a vowel, if it is then the position is printed. 

    I name lowerVowel and upperVowel using the same reasoning from before, 
    as well as naming the flag found.

2. Credit Card Number Tester
   
   For this problem, I focused on maximizing efficiency by creating individual 
   methods to check each requirement/rule. Because I use some specific digits
   many times in different rules (and thus different methods) I created instance 
   variables for those digits so I could use them freely throughout the methods 
   and not have to keep creating variables unique to the individual methods. When 
   initializing the digit variables, I used the parseInt() method which converts
   a String to an integer value

   For my rule4() method, I use a for loop to compute the sum of all of the digits
   (using the same methods I used in problem E6.3 like charAt() and valueOf()). To 
   deal with the "-"s in the CC number, I have an if statement that uses the equals()
   method which compares the value of two Strings, and adds the integer value of the digit
   if it is not equal to "-". To test if the sum of all the digits is evenly divisible by 4
   I use an if statement

   For my rule5() method I use a for loop to compute the sum of the first 4 digits 
   and then another for loop to compute the sum of the last 4 digits using the
   same method and processes from my rule4() method. After getting those sums 
   I check if the sum of the last four digits is one less than the sum of the first 
   four digits

   In my check() method that runs all of the individual rule methods I've created,
   I rely on the value of the variable valid (which is initiated to true). Because
   I only want the next tests to run if the CC number is still valid, I use an if statement
   to verify that valid = true before proceeding to the next test. This way, the first time
   a rule is broken, the tests stop and the errorCode is printed.

   All of my method names correspond to which number check they are. The variable
   digitStr is of the type String and represents the digit of the CC number 


