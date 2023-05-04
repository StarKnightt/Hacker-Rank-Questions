// Import statements for classes that are used in the code
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.util.Scanner;

// Define the public class that contains the main method
public class Solution {

    // Main method that is executed when the program is run
    public static void main(String[] args) {

        // Create a new Scanner object to read input from standard input (keyboard)
        Scanner sc = new Scanner(System.in);

        // Read a single string from the user and store it in the 'str' variable
        String str = sc.next();

        // Close the scanner to free up system resources
        sc.close();

        // Use a try-catch block to handle any exceptions that might be thrown
        try {

            // Create a new MessageDigest object that uses the MD5 algorithm
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Update the MessageDigest object with the bytes of the input string
            md.update(str.getBytes());

            // Get the resulting digest as a byte array
            byte[] digest = md.digest();

            // Loop through the byte array and print each byte as a hexadecimal string
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }

        // Catch any exceptions that might be thrown and re-throw them as a RuntimeException
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}

