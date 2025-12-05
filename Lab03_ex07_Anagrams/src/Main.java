import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display the label for the first word
        System.out.print("The first word is: ");
        //Declare variable 'word1' of type String and read it from the keyboard
        String word1 = sc.nextLine();
        //Display the label for the second word
        System.out.print("The second word is: ");
        //Declare variable 'word2' of type string and read if from the keyboard
        String word2 = sc.nextLine();

        checkWordLength(word1, word2);
        anagramWords(word1, word2);

    }

    //Define method for checking the length of the 2 words
    static void checkWordLength(String word1, String word2) {
        //Declare variable (counter) for word1 and initialize it
        int countWord1 = 0;
        //Loop through word1 from i = 0 to the length of word1, incrementing i by 1
        for (int i = 0; i < word1.length(); ++i) {
            //Set condition to ignore whitespaces in word1
            if (word1.charAt(0) != ' ') {
                //Increment counter of word1 for each character found
                countWord1++;
            }
        }
        //Declare variable (counter) for word2 and initialize it
        int countWord2 = 0;
        //Loop through word2 from j = 0 to the length of word2, incrementing j by 1
        for (int j = 0; j < word2.length(); ++j) {
            //Set condition to ignore whitespaces in word1
            if (word2.charAt(0) != ' ') {
                //Increment counter of word2 for each character found
                countWord2++;
            }
        }
        //Set condition of equality between the 2 counters
        if (countWord1 == countWord2) {
            //Display empty line when the 2 counters have equal values
        System.out.print("");
            //Set condition for the case when the 2 counters have different values
        } else {
            //Display message when the 2 counters have different values
            System.out.print("\nThe two words are not anagrams. Please check and try again.");
        }
    }

    //Define condition for checking if the two words are anagrams
    static void anagramWords(String word1, String word2) {
        //Convert word1 to a char array
        char[] word1Array = word1.toCharArray();
        //Convert word2 to a char array
        char[] word2Array = word2.toCharArray();
        //Apply the sort method to the array of word1
        Arrays.sort(word1Array);
        //Apply the sort method to the array of word2
        Arrays.sort(word2Array);
        //Set the condition for comparing the 2 sorted arrays of word1 and word2
        if (Arrays.equals(word1Array, word2Array)) {
            //Display message to confirm that the 2 words are anagrams
            System.out.print("\nThe two words are anagrams.\n");
        }
    }
}