import java.util.Scanner;
//java 15
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start  = sc.nextInt();
        int end    = sc.nextInt();
        sc.close();
        System.out.println(str.substring(start, end));
    }
    
}
// Have a sweet day
