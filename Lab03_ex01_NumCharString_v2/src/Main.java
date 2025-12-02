public class Main {
    public static void main(String[] args) {

        //Declare big string of characters
        String A  = "a2bcxwa2cdeaa3aa1afcdabcdefa2vghstha4c";
        //Declare small string of characters
        String B = "a2";

        int result = numTimes(A, B);
        System.out.print("Found " + result + " occurrences of " + B);
    }

    //Define method for finding the number of occurrences of 'small' in 'large'
    static int numTimes (String A, String B) {
        //Declare variable of type int and initialize it --> counts the number of occurrences
        int timesFound = 0;
        //Declare boolean for finding a matching occurrence of 'small' in 'large' and set it to 'true' as default
        boolean matchFound = true;
        //Loop through string 'large' from i = 0 to length of 'large' incrementing i by 1
        for (int i = 0; i < A.length()-1; ++i) {
            //Declare variable substring equal to a substring of A, with the limits set to the value of i and i + B.length-1
            String substring = A.substring(i, i + B.length());
            //Set condition for comparing the obtained substring to string B
            if (!substring.equals(B)) {
                //Return 'false' and exit the loop when the substring is not a match
                matchFound = false;
            //Increment the counter when a match is found
            } else {
                timesFound++;
            }
        }
        return timesFound;
    }
}