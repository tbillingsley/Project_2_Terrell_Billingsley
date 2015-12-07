/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_2_terrell_billingsley;

/**
 *
 * @author Terrell
 */
import java.util.*;
public class Project_2_Terrell_Billingsley {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        // declare variables
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
        int cents, quarters, dimes, nickels, pennies;
        //create scanner obj
        Scanner sc = new Scanner(System.in);
        //prompt user to enter input
        
        cents = getIntWithinRange(sc, "Enter cents: (0-99): ", 0, 99);
        //calc quarters
        quarters=cents/25;
        //calc remainder
        cents %= 25;
        //calc dimes
        dimes = cents/10;
        //calc remainder
        cents %=10;
        //calc nickels
        nickels = cents/5;
        //calc remainder
        cents %=5;
        //calc pennies
        pennies = cents/1;
        //calc remainder
        pennies = cents;
        
        //display results
        System.out.println("Quarters: \t" +quarters);
        System.out.println("Dimes: \t\t" +dimes);
        System.out.println("Nickels: \t" +nickels);
        System.out.println("pennies: \t" +pennies); 
        //ask user to continue
        System.out.print("\nContinue? (y/n): ");
        choice = sc.next();
        System.out.println(); //print a blank line
        }
    } //end of main method
    public static int getValidInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false; //assign isValid to false
        while (isValid == false) //compare isValid is false?
        { //start of while loop
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
               i=sc.nextInt(); //if input is an integer, assign the integer to i
               isValid = true;
            }
            else
            {
                System.out.println("Invalid input. Cents must be numeric. Try again. \n");
            }
            //clear user input from memory
            sc.nextLine(); //discard invalid input
        }
        
        return i;
    } //end of isValidInt method
    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid==false)
        {
         //call getValidInt method
            i=getValidInt(sc, prompt);
            if (i<min)
                System.out.println("Error!! Cents must be greater than or equal to " + min + "\n");
            else if (i>max)
                System.out.println("Error!! Cents must be less than or equal to " + max + "\n");
            else
            isValid = true;
        }
            return i;
        }
}   //end of class
