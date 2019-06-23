package ch05pc08;
import java.util.Scanner;
import java.io.*;
        
/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose: convert meters into kilometers, inches, or feet.
 */
public class Ch05pc08 {

    public static void main(String[] args) {
        //variables
        double meters;
        int selection;
                
        //create the input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Enter the number of meters: ");
        meters = keyboard.nextDouble();
        
        if (meters <= 0)
        {
            System.out.println("You entered a non-positive number.");
            System.exit(0);
        }
        
        //display the menu and get the result
        displayMenu();
        selection = keyboard.nextInt();
        
        switch (selection)
        {
            case 1:
                showKilometers(meters);
                break;
            case 2:
                showInches(meters);
                break;
            case 3:
                showFeet(meters);
                break;
            case 4:
                System.exit(0);
            default:
                System.err.println("Error.  That selection does not exist.");
                break; 
        }
    }
    
    public static void showKilometers (double meters)
    {
        //variables
        double km;
        km = meters * .001;
        //Display the results
        System.out.println(meters + " is " + km + " kilometers.");
    }
    
    public static void showInches (double meters)
    {
        //variables
        double inches;
        inches = meters * 39.37;
        //Display the results
        System.out.println(meters + " is " + inches + " inches.");
    }
    
    public static void showFeet (double meters)
    {
        //variables
        double feet;
        feet = meters * 3.281;
        //Display the results
        System.out.println(meters + " is " + feet + " feet.");
    }
    
    public static void displayMenu ()
    {
        
        System.out.println("Please select from the following: ");
        System.out.println("1. Convert to kilometers. ");
        System.out.println("2. Convert to inches. ");
        System.out.println("3. Convert to feet. ");
        System.out.println("4. Close the program.");
        
    }
            
}
