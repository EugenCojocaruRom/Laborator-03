import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create the text file
        File textFile = new File("Lab03_ex10.txt");
        try {
            if (textFile.createNewFile()) {
                System.out.print("The file " + textFile.getName() + " was created successfully.\n");
            } else {
                System.out.print("The file already exists.\n");
            }
        } catch (IOException e) {
            System.out.print("An unexpected error has occurred.");
        }

        //Write in the text file
        try {
            FileWriter textWriter = new FileWriter("Lab03_ex10.txt");
            textWriter.write("Some random text I added here just to have something written.\n");
            textWriter.write("Additional line to have extra words for comparison.\n");
            textWriter.write("This is the third line, which contains the word 'supercalifragilisticexpialidocious'.");
            textWriter.close();
            System.out.print("Successfully written to file.\n");
        } catch (IOException e) {
            System.out.print("An unexpected error has occurred.");
        }

        //Read from the text file and display the lines from the file
        try {
            Scanner sc = new Scanner(textFile);
            while (sc.hasNextLine()) {
                String info = sc.nextLine();
                System.out.print(info + "\n");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.print("An unexpected error has occurred.");
        }

        //Declare variable of type string for storing the longest word found
        String longestWord = "";
        //Declare array of type int and give it the value of the numbers of letters in the English alphabet
        int[] letterFrequency = new int[26];

        try {
            //Find the longest word and the frequency of the characters
            File textFile2 = new File("Lab03_ex10.txt");
            Scanner sc = new Scanner(textFile2);
            while (sc.hasNext()) {
                String word = sc.next();
                //Clean each word of all punctuation marks
                String cleanWord = word.replaceAll("[^a-zA-Z]", "");
                //Set condition for checking the length of each word
                if (cleanWord.length() > longestWord.length()) {
                    longestWord = cleanWord;
                }
                //Loop through the characters of each word to count the frequency of the characters
                for (char c : cleanWord.toLowerCase().toCharArray()) {
                    //Set the condition for checking the frequency of each character
                    if (c >= 'a' && c <= 'z') {
                        //Increment the frequency of the character at each iteration
                        letterFrequency[c - 'a']++;
                    }
                }
            }
            //Close the scanner
            sc.close();
            //Method for displaying the results (longest word, letter frequency)
            displayResults(longestWord, letterFrequency);
        }
        catch (FileNotFoundException e) {
            System.out.print("An unexpected error has occurred.");
        }
    }

    //Define method for displaying the results (longest word, letter frequency)
    static void displayResults(String word, int[] frequency) {
        //Declare variable of type char to hold the "winning" letter and initialize it as an empty space
        char maxLetter = ' ';
        //Declare variable of type int as a counter and initialize it
        int maxFrequency = 0;
        //Loop through the 'letterFrequency' array from i = 0 to 26, incrementing i by 1
        for (int i = 0; i < 26; i++) {
            //Set the condition for comparing the frequency of each letter to the maxFrequency variable
            if (frequency[i] > maxFrequency) {
                //Update the counter to the current frequency
                maxFrequency = frequency[i];
                //Convert the numeric index into a letter by casting it to char
                maxLetter = (char) ('a' + i);
            }
        }
        //Display the results
        System.out.println("\n-----RESULTS-----");
        System.out.println("The longest word is: " + word);
        System.out.println("The most used letter is: " + maxLetter + " (" + maxFrequency + " times)");
    }
}