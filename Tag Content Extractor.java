// Import necessary libraries
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Define the Solution class
public class Solution {
    // Define the main method
    public static void main(String[] args) {
        // Create a new scanner object to read input from standard input
        Scanner in = new Scanner(System.in);
        // Read in the number of test cases
        int t = Integer.parseInt(in.nextLine());
        // Loop over each test case
        while (t-- > 0) {
            // Read in the current line of text
            String line = in.nextLine();
            // Define a regular expression pattern to match against
            Matcher m = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);
            // If no matches were found, print "None" and move on to the next test case
            if (!m.find()) {
                System.out.println("None");
                continue;
            }
            // If matches were found, reset the matcher and loop over each match
            m.reset();
            while (m.find()) {
                // Print out the text within the matching angle brackets
                System.out.println(m.group(2));
            }
        }
    }
}
