import java.util.*;

// Parent Sports class
class Sports{
    // Method to return the name of the sport
    String getName(){
        return "Generic Sports";
    }
  
    // Method to print the number of players in a team for the sport
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}

// Child Soccer class, inherits from Sports
class Soccer extends Sports{
    // Override the getName() method of the parent class
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Override the getNumberOfTeamMembers() method of the parent class
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in " + getName());
    }
}

// Main class
public class Solution{
    public static void main(String []args){
        // Create an instance of the parent class
        Sports c1 = new Sports();
        // Create an instance of the child class
        Soccer c2 = new Soccer();

        // Print the name of the sport for the parent instance
        System.out.println(c1.getName());
        // Print the number of players in a team for the parent instance
        c1.getNumberOfTeamMembers();

        // Print the name of the sport for the child instance
        System.out.println(c2.getName());
        // Print the number of players in a team for the child instance
        c2.getNumberOfTeamMembers();
    }
}

// Output: 
// Generic Sports
// Each team has n players in Generic Sports
// Soccer Class
// Each team has 11 players in Soccer Class
// Have a sweet day.
