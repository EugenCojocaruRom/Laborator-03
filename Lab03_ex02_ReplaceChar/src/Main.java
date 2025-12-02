import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Open keyboard
        Scanner sc = new Scanner(System.in);
        //Display value 'The string is'
        System.out.print("The string is: ");
        //Declare array n of type int and set the number of its values
        int[] n = new int[100];
        //Declare string 'Str' and set the number of its characters to n
        String Str = new String(Arrays.toString(n));
        //Read the string from the keyboard
        Str = sc.nextLine();
        //After pressing 'Enter', all the occurrences of 'C' are replaced with '*' and the new string is displayed
        System.out.print("The new string is " + Str.replace('C', '*'));

    }
}