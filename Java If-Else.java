// Hackerrank Question 3

import java.util.Scanner;
public class Solution {
public static void main(String[] args) {   
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }                                    
        }
        System.out.println(ans);
        sc.close();
    }
}

//Have a nice day
