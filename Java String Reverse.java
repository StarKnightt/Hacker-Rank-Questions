import java.util.Scanner;
/* Java 15/*
/* If a String is equivalent to itself when reversed, it's a palindrome */
public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        /* Reverse string and compare to original */
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Yes" : "No");
    }
}
// Have a amazing day.
