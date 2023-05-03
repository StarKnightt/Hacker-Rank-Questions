import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        // Create a new scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read an integer from the user and store it in variable n
        int n = sc.nextInt();
        
        // Create a string variable to store the answer
        String ans = "";
        
        // Check if n is odd
        if (n % 2 == 1) {
            ans = "Weird"; // if n is odd, the answer is "Weird"
        } else {
            // if n is even, check if it's within the range [6, 20]
            if (n >= 6 && n <= 20) {
                ans = "Weird"; // if n is even and within the range [6, 20], the answer is "Weird"
            } else {
                ans = "Not Weird"; // if n is even and outside the range [6, 20], the answer is "Not Weird"
            }                                    
        }
        
        // Print the answer to the console
        System.out.println(ans);
        
        // Close the scanner object to free up resources
        sc.close();
    }
}
