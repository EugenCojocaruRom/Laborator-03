import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create the text file
        File textFile = new File("Lab03_ex11.txt");
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
            FileWriter textWriter = new FileWriter("Lab03_ex11.txt");
            textWriter.write("This is some random text. I added it here just to have something written.\n");
            textWriter.write("I thought appropriate to have an extra line. It does not say much, rEAlLy!\n");
            textWriter.write("Of course, this is the third line. yAY!!! It contains the word 'sUPERcALIfRAGILISTICeXPIALIdOCIOUS'.");
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

        //Create the new text file that will contain the converted letters
        File newTextFile = new File("Lab03_ex11_converted.txt");
        try (Scanner sc = new Scanner(textFile);
        FileWriter fw = new FileWriter(newTextFile)) {
//            System.out.println("\n-----Converting the letters as requested...-----");
            //Read and convert the case of the letters in the new file
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String convertedLine = convertCase(line); //This line will call a helper method that converts upperCase to lowerCase and vice-versa
                //Write in the new file
                fw.write(convertedLine + "\n");
                //Display the original line
//                System.out.println("Original line: " + line);
                //Display the converted line
//                System.out.println("Converted line: " + convertedLine);
            }
            System.out.println("Operation finished successfully. Please check " + newTextFile.getName());
        }
        catch (IOException e) {
            System.out.print("An unexpected error has occurred during conversion.");
        }
    }

    //Define helper method for converting upperCase to lowerCase and vice-versa
    static String convertCase(String text) {
        //Declare new empty StringBuilder to collect the converted characters from the file
        StringBuilder convText = new StringBuilder();
        //Loop through the text one character at a time
        for (char c : text.toCharArray()) {
            //Set the condition for converting a character from upperCase to lowerCase
            if (Character.isUpperCase(c)) {
                convText.append(Character.toLowerCase(c));
            }
            //Set the condition for converting a character from lowerCase to upperCase
            else if (Character.isLowerCase(c)) {
                convText.append(Character.toUpperCase(c));
            }
            //If the character is a space or a punctuation mark, leave it as it is
            else {
                convText.append(c);
            }
        }
        //Return the converted text as a string
        return convText.toString();
    }
}