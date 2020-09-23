/*
 * Programmer:Ella Powers
 * Date:September 23, 2020
 * Purpose:Learning about me
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
         String myName = "Ella Powers.";
    	 int myAge = 16;
    	 double myHeightInMetres = 154.94;
    	
    	// Print the values
        System.out.println("Hi, my name is " + myName);
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 17;
        myHeightInMetres = 157.23;
       
        // Print the new values
        System.out.println("Some time passes...");
        System.out.println(" I am now " + myAge + " years old.");
        System.out.println(" I have grown and am " + myHeightInMetres + " m tall.");
    }
}
