import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declare big array n of type char
        char[] n = {'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'a', 'b', 'd', 'e', 'a', 'b', 'c', 'd', 'a', 'b'};
        //Declare small array m of type char
        char[] m = {'a', 'b'};

        //Call the method for calculating the number of occurrences of array m in array n
        int result  = charArrayOccurences(n, m);
        //Display the message with the result of how many occurrences of array m have been found in array n
        System.out.print("The number of occurrences of array 'm' in array 'n' is " + result);
    }

    static int charArrayOccurences(char[] n, char[] m) {
        //Declare variable of type int and initialize it
        int timesFound = 0;

        //Loop through char array n from i = 0 to length of n-1 incrementing i by 1
        for (int i = 0; i < n.length-1; ++i) {
            //Declare boolean for finding a matching sequence of array m in array n and set it to 'true' as default
            boolean matchFound = true;
            //Inside this loop --> char array n from j = 0 to length of m-1 incrementing j by 1
            for (int j = 0; j < m.length-1; ++j) {
                //Set condition to compare the elements of array m with the elements of array n
                if (n[i] != m[j] && n[i+1] != m[j+1]) {
                    //Return 'false' when the values are different
                    matchFound = false;
                    //Exit the loop
                    break;
                }
                //Set the condition for returning 'true' --> the values of array m match the values of array n
                else if (matchFound = true) {
                    //Increment the value of the 'timesFound' variable
                    timesFound++;
                }
            }
        }
        return timesFound;
    }
}