import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create the text file
        File textFile = new File("Lab03_ex12.txt");
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
            FileWriter textWriter = new FileWriter("Lab03_ex12.txt");
            textWriter.write("\nThis is some random text. I added it here just to have something written.\n" +
                    "I thought appropriate to have more than 10-15 words. It's not that much, really!\n" +
                    "Of course, this is additional text right here. It contains the word 'supercalifragilisticexpialidocious'.\n" +
                    "This is good! Or is it?!");
            textWriter.close();
            System.out.print("Successfully written to file.\n");
        } catch (IOException e) {
            System.out.print("An unexpected error has occurred.");
        }

        //Read from the text file and display the lines from the file
        try {
            Scanner sc = new Scanner(textFile);
            while (sc.hasNextLine()) {
                String textLine = sc.nextLine();
                System.out.print(textLine + "\n");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.print("An unexpected error has occurred.");
        }

        //Declare array of type int and set the number of its elements to 5 (the number of vowels in the English alphabet)
        int[] vowelCount = new int[5];
        //Declare array of type char and set its values (the vowels in the English alphabet)
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        //Find and count the vowels
        try {
            File textFile1 = new File("Lab03_ex12.txt");
            Scanner sc = new Scanner(textFile1);
            while (sc.hasNextLine()) {
                //Convert the text to lowercase, since 'A' is considered the same as 'a'
                String textLine = sc.nextLine().toLowerCase();
                //Loop through each character of the text after converting it to an array of chars
                for (char c : textLine.toCharArray()) {
                    //Check which character is a vowel and increment its corresponding counter
                    if (c == 'a') {
                        vowelCount[0]++;
                    }
                    else if (c == 'e') {
                        vowelCount[1]++;
                    }
                    else if (c == 'i') {
                        vowelCount[2]++;
                    }
                    else if (c == 'o') {
                        vowelCount[3]++;
                    }
                    else if (c == 'u') {
                        vowelCount[4]++;
                    }
                }
            }
            //Close the scanner
            sc.close();

            //Find the maximum value in the counters array
            //Declare variable of type int and initialize it; it is a counter for the number of occurrences of the vowel
            int maxCount = 0;
            //Declare variable of type char for storing the vowel with the max number of occurrences; initialize it as an empty space
            char maxVowel = ' ';
            //Loop through the vowelCount array from i = 0 to the length of the array, incrementing i by 1
            for (int i = 0; i < vowelCount.length; i++) {
                //Set the condition for comparing each value of the array to maxCount
                if (vowelCount[i] > maxCount) {
                    //Assign the value of the array to maxCount if the condition is met
                    maxCount = vowelCount[i];
                    //Update the 'maxVowel' with the corresponding value at index i from the 'vowels' array
                    maxVowel = vowels[i];
                }
            }
            //Display the number of occurrences for each vowel
            System.out.println("\nThe number of occurrences is as follows:");
            //Loop through the vowelCount array from i = 0 to the length of the array, incrementing i by 1
            for (int i = 0; i < vowelCount.length; i++) {
                //Display each vowel and the number of its occurrences
                System.out.println(vowels[i] + " - " + vowelCount[i]);
            }
            //Display the result - the vowel with max number of occurrences + the number of occurrences
            System.out.println("The most frequently used vowel is " + maxVowel + " (" + maxCount + " occurrences).");

        }
        catch (Exception e) {
            System.out.print("An error has occurred. Error: " + e);
        }
    }
}