// Charlie Liu CRL2157
// this program is a bunch of methods used to check
// if a credit card number is valid

public class CreditCard{

    private String number;
    private boolean valid;
    private int errorCode;
    private int digit1;
    private int digit4;
    private int digit5;
    private int digit9;
    // declare instance variables
    
    public CreditCard(String creditCardNumber){
    // constructor initializes instance variables

        number = creditCardNumber;
        valid = true;
        errorCode = 0;
        digit1 = Integer.parseInt(number.substring(0,1));
        digit4 = Integer.parseInt(number.substring(3,4));
        digit5 = Integer.parseInt(number.substring(5,6));
        digit9 = Integer.parseInt(number.substring(10,11));
        // parseInt() method converts String to int value
    }

    public void check(){
    //determines if credit card is valid or not
        rule1();
        // doesn't need if statement since valid is initialized to true

        if(valid){
            rule2();
        }
        if(valid){
            rule3();
        }
        if(valid){
            rule4();
        }
        if(valid){
            rule5();
        }
        if(valid){
            rule6();
        }
    }

    private void rule1(){
        if (digit1 != 4){
            valid = false;
            errorCode = 1;
        }
    }

    private void rule2( ){
        if(digit4-digit5 != 1){
            valid = false;
            errorCode = 2;
        }   
    }

    private void rule3(){
        int product = digit1*digit5*digit9;
        if (product != 24){
            valid = false;
            errorCode = 3;
        }
    } 

    private void rule4(){
        int sum = 0;
        for (int i = 0; i < number.length(); i++){
            char digit = number.charAt(i);
            // charAt() method returns the character 
            // at a specific index of a string

            String digitStr = String.valueOf(digit);
            // valueOf() method converts different value types to a string
            // converts char variable to String variable

            if(!digitStr.equals("-")){
            // .equals() method compares the value of two Strings 

                sum += Integer.parseInt(digitStr);
            }
        }
        if (sum%4 != 0){
            valid = false;
            errorCode = 4;
        }
    }
    
    private void rule5(){
        int sumFirst = 0;
        int sumLast = 0;
        for (int i = 0; i < 4; i++){
        // iterates through the first 4 digits of the cc number
            char digit = number.charAt(i);
            String digitStr = String.valueOf(digit);
            sumFirst += Integer.parseInt(digitStr);
            }
        for (int i = 13; i > 9; i--){
        // iteratres through the last 4 digits of the cc number
            char digit = number.charAt(i);
            String digitStr = String.valueOf(digit);
            sumLast += Integer.parseInt(digitStr); 
        } 
        if (sumLast - sumFirst != 1){
            valid = false;
            errorCode = 5;
        }
    }

    private void rule6(){
        int twoDigits1 = Integer.parseInt(number.substring(0,2));
        int twoDigits2 = Integer.parseInt(number.substring(7,9));
        if (twoDigits1 + twoDigits2 != 100){
            valid = false;
            errorCode = 6;
        }
    }

    public boolean isValid(){
    //returns the value of boolean if true or false
        return valid;
    }

    public int getErrorCode(){
    //return value for variable errorCode
        return errorCode;
    }
}
