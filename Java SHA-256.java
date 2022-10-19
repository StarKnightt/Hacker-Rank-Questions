import java.io.*;
import java.util.*;
import java.security.*;
// Java 15
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(input.nextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
    }
}

// This is the last question and here it's completed. 
// Thank you. Have a sweet day. 
