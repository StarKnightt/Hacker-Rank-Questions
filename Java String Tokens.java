import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Java 7
public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);  // Scanner library 
         String S = sc.nextLine();
         String[] tokens = S.split("[^a-zA-Z]");
         int numTokens = 0;
        
         for (int i=0; i<tokens.length; ++i)     //Just using for loop
             if (tokens[i].length() > 0) 
                 numTokens++;
        
         System.out.println(numTokens);
         for (int i=0; i<tokens.length;++i)
             if (tokens[i].length() > 0)
                 System.out.println(tokens[i]);
    }
}
// Have a best day.
