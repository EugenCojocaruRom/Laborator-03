import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File textFile = new File("Lab03_ex08.txt");
        //Create the text file
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
            FileWriter textWriter = new FileWriter("Lab03_ex08.txt");
            textWriter.write("Some random text I added here just to have something written.");
            textWriter.close();
            System.out.print("Successfully written to file.\n");
        } catch (IOException e) {
            System.out.print("An unexpected error has occurred.");
        }

        //Read from the text file
        try {
            Scanner sc = new Scanner(textFile);
            while (sc.hasNextLine()) {
                String info = sc.nextLine();
                System.out.print(info);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.print("An unexpected error has occurred.");
        }
    }
}