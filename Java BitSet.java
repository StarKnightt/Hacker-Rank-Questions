import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Main class
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        int n = sc.nextInt();
        
        // Create two BitSets of size n
        BitSet[] a = new BitSet[] {null, new BitSet(n), new BitSet(n)};
        
        // Read number of operations to be performed
        int m = sc.nextInt();
        
        // Loop through all operations
        for (int k = 0; k < m; k++) {
            // Read operation type and BitSet indexes
            String cmd = sc.next();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            
            // Perform corresponding operation based on the given command
            if (cmd.equals("AND")) {
                a[k1].and(a[k2]);
            } else if (cmd.equals("OR")) {
                a[k1].or(a[k2]);
            } else if (cmd.equals("XOR")) {
                a[k1].xor(a[k2]);
            } else if (cmd.equals("FLIP")) {
                a[k1].flip(k2);
            } else if (cmd.equals("SET")) {
                a[k1].set(k2);
            }
            
            // Print the cardinality (number of set bits) of BitSets 1 and 2 after the operation
            System.out.println(a[1].cardinality() + " " + a[2].cardinality());
        }
    }
}

// End of program. Keep Hustling!
