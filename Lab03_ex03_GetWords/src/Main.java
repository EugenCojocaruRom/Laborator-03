import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for string
        System.out.print("The string is: ");
        //Declare variable 'Str' of type String
        String Str;
        //Read the string from the keyboard
        Str = sc.nextLine();

        int counter = whiteSpace(Str);
        System.out.println("Number of spaces: " + counter);
        wordsInString(Str);
    }

    //Define method to check for white spaces
    static int whiteSpace(String Str){
        //Declare variable for counter and initialize it
        int counter = 0;
        //Loop through the string from i = 0 to length of string, incrementing i by 1
        for( int i=0; i<Str.length(); i++ ) {
            //Set condition for incrementing the counter when a character is identified as a space
            if(Str.charAt(i) == ' ' ) {
                counter++;
            }
        }
        return counter;
    }

    //Define method to identify and extract the words from the string
    static void wordsInString(String Str) {
        //Display the first part of the message
        System.out.print("The words are: \n");
        //Declare variable 'word' of type String (as a container) and set it to empty
        String word = "";
        //Loop through the string from i = 0 to the length of the string, incrementing i by 1
        for( int i=0; i<Str.length(); i++ ) {
            //Inside the loop, declare variable 'c' of type char and set its value as the index of the characters in the string
            char c = Str.charAt(i);
            //Set condition for adding a character to the word when it is identified as a letter, not a space
            if(c != ' ') {
                //The character is added to the word container
                word += c;
            }
            /*Set the condition in case the character is identified as a space
            and the length of the word is greater than 0 (container 'word' not empty)*/
            else if (c == ' ' && word.length() > 0) {
                //The word is displayed
                System.out.println(word);
                //The variable (container) is reset for the next word
                word = "";
            }
        }
        /* Outside the 'for' loop, set the condition for displaying the last word
        (all the words except the last one were added, so word.length() > 0) */
        if (word.length() > 0) {
            //The word is displayed
            System.out.println(word);
        }
    }
}