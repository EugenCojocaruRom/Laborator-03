import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for string
        System.out.println("The string is: ");
        //Declare variable 'Str' of type String and read it from the keyboard
        String Str = sc.nextLine();

        int counter = vowelCount(Str);
        System.out.print("\nThere are " + counter + " vowels in this string.\n");
    }

    //Define method for counting the vowels in the given string
    static int vowelCount(String Str) {
        //Declare variable 'counter' of type int for counting the number of vowels, and initialize it
        int counter = 0;
        //Loop through the string from i = 0 to the length of the string, incrementing i by 1
        for (int i = 0; i < Str.length(); ++i) {
            //Declare variable 'c' of type char, which takes the value of the character index
            char c = Str.charAt(i);
            //Set the rules for identifying the vowels in the string
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                //Increment the counter
                counter++;
            }
        }
        return counter;
    }
}