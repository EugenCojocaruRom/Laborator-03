import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display label for string
        System.out.println("The sentence is: ");
        //Declare variable 'Str' of type String and read it from the keyboard
        String Str = sc.nextLine();

        //Call the method for converting the first letter of each element to uppercase
        wordsToUpperCase(Str);

    }

    //Define method for reading the string
    static void wordsToUpperCase(String Str) {
        //Display the first part of the message for the modified sentence
        System.out.println("The modified sentence is: ");
        //Declare regex for extracting the spaces from the sentence using the 'split' method
        String regex = "\\s";
        //Declare 'sentence' array, which stores the parts of the sentence after the split
        String[] sentence = Str.split(regex);
        //Loop through each element (s) of the sentence
        for (String s : sentence) {
            //Identify the first character of every element of the sentence
            String c = String.valueOf(s.charAt(0));
            //Convert the first character of every element of the sentence
            String upC = c.toUpperCase();
            //Extract substrings from every element of the sentence, omitting the first character (start at index 1)
            String s1 = s.substring(1);
            //Declare variable 'result', where the first character (uppercase) is concatenated with the substring
            String result = upC.concat(s1);
            //Display the sentence with each first letter of each element in uppercase
            System.out.print(result + " ");
        }
    }
}