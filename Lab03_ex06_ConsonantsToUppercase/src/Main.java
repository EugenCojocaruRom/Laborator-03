import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for string
        System.out.println("The string is: ");
        //Declare variable 'Str' of type String and read it from the keyboard
        String Str = sc.nextLine();

        //Call the method for converting the consonants to uppercase
        consUpperCase(Str);
    }

    //Define method for converting the consonants to uppercase
    static void consUpperCase(String Str) {
        //Declare string 'cons' (container) for consonant
        String cons = "";
        //Loop through string
        for (int i = 0; i < Str.length(); ++i) {
            //Declare and initialize char c
            char c = Str.charAt(i);
            //Define condition for identifying the consonants
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                //Continue the loop while skipping the vowels
                continue;
            }
            //Add consonant character to cons container
            cons += c;
        }
        //Convert the characters from container 'cons' to uppercase
        String uppCase = cons.toUpperCase();
        //Display the message for the modified string and the consonants in uppercase
        System.out.print("\nThe modified string is: \n" + uppCase);
    }
}