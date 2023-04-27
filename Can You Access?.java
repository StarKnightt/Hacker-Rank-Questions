import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

//Java 15
public class Solution {
    //Main method of the program
    public static void main(String[] args) throws Exception {
        //Prevent program from terminating
        DoNotTerminate.forbidExit();    
        try{
            //Create BufferedReader object to read input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //Read and parse integer input
            int num = Integer.parseInt(br.readLine().trim());
            //Create an instance of the Private class within the Inner class and assign to an object 'o'
            Object o;
            Inner inner = new Inner();
            o = inner.new Private();
            Inner.Private innerPrivate = (Inner.Private) o;
            //Call the powerof2 method with 'num' as input and store resulting string in 'response'
            String response = innerPrivate.powerof2(num);
            //Print the input and result along with the canonical name of the 'o' object's class
            System.out.println(num + " is " + response);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        }//end of try
        //Catch any ExitTrappedException thrown by the forbidExit method
        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    
    //Nested class within the Solution class
    static class Inner{
        //Nested class within the Inner class
        private class Private{
            //Method that checks if input number is a power of 2 and returns a string indicating the result
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner
}//end of Solution

//Class that prevents program from exiting
class DoNotTerminate { 
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1L;
    }
    //Method to forbid program from exiting
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}   
//End of program
