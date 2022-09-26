import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Java 15
class Arithmetic {
    int add (int a, int b) {
        return a + b;
    }
}
class Adder extends Arithmetic {}

public class Solution {
    public static void main(String []args) {
        // Createing  a new Adder object
        Adder a = new Adder();
        
        // Printing the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
        
        // Printing the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}

// Keep Hustling and You are a good person. 
