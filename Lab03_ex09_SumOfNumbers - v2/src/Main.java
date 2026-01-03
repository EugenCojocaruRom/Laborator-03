import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File textFile = new File("Lab03_ex09_v2.txt");
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
            //Open the keyboard
            Scanner sc = new Scanner(System.in);
            //Display value 'n' for the number of elements in the array
            System.out.print("n = ");
            //Declare variable 'n' of type int and read it from the keyboard
            int n = sc.nextInt();
            //Declare array 'numbers' of type int and set the number of its elements to n
            int[] numbers = new int[n];
            //Loop through the array from i = 0 to n, incrementing i by 1
            for (int i = 0; i < n; i++) {
                //Display prompt to enter a number
                System.out.print("Enter number " + i + ": ");
                //Read the number from the keyboard
                numbers[i] = sc.nextInt();
            }

            //Write to the file
            FileWriter textWriter = new FileWriter("Lab03_ex09_v2.txt");
            //Write the number of elements on the first line in the file
            textWriter.write(n + "\n");
            //Loop through the array from i = 0 to the length of the array, incrementing i by 1
            for (int i = 0; i < numbers.length; i++) {
                //Write each element separated by spaces
                textWriter.write(numbers[i] + " ");
            }
            textWriter.close();
            System.out.println("The following values have been written to file: " + Arrays.toString(numbers));

        } catch (IOException e) {
            System.out.print("An unexpected error has occurred.");
        }

        //Read from the text file and calculate the sum of the numbers from the second line
        try {
        Scanner sc = new Scanner(new File("Lab03_ex09_v2.txt"));
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        sc.close();
        System.out.println("Sum: " + sum);
        }
        catch (FileNotFoundException e) {
            System.out.print("An unexpected error has occurred.");
        }
    }
}