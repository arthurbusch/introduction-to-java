/* Arthur Busch
 * August 29, 2024
 * Math Question
 * This program performs simple mathematical calculations given two
 * user-provided integer values.
 */

package com.mycompany.arthurbusch_mathquestion;

//Import Classes
import java.util.Scanner;   // Import scanner module for user input
import java.lang.Math;      // Import math module for calculations
import java.util.InputMismatchException;    // Validates user input

/**
 *
 * @author Arthur
 */
public class ArthurBusch_MathQuestion {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);    // Scanner object for user input
        
        // Declare variables
        int intOne = 0;     // The first integer
        int intTwo = 0;     // The second integer
        boolean intOneOK = false;   // Check for first integer
        boolean intTwoOK = false;   // Check for second integer
        
        // User prompt for first integer if not already entered
        do {
            System.out.print("Enter the first integer: ");
            
            try {
                intOne = in.nextInt();  // Take user input
                intOneOK = true;    // Set intOne entered status
            } catch (InputMismatchException ex) {   // If input is invalid
                System.out.println("Input must be an integer.");
                in = new Scanner(System.in);    // Initialize scanner
            }
        } while (intOneOK == false);
        
        // User prompt for second integer if not already entered
        do {
            System.out.print("Enter the second integer: ");
            
            try {
                intTwo = in.nextInt();  // Take user input
                intTwoOK = true;    // Set intTwo entered status
            } catch (InputMismatchException ex) {   // If input is invalid
                System.out.println("Input must be an integer.");
                in = new Scanner(System.in);    // Initialize scanner
            }
        } while (intTwoOK == false);
        
        // Perform calculations after both integers entered
        if (intOneOK == true && intTwoOK == true) {
            System.out.print("Sum: ");
            System.out.println(intOne + intTwo);
            
            System.out.print("Difference: ");
            System.out.println(intOne - intTwo);
            
            System.out.print("Product: ");
            System.out.println(intOne * intTwo);
            
            System.out.print("Average: ");
            System.out.println((intOne / intTwo) / 2);
            
            System.out.print("Distance: ");
            System.out.println(Math.abs(intOne - intTwo));
            
            System.out.print("Maximum: ");
            System.out.println(Math.max(intOne, intTwo));
            
            System.out.print("Minimum: ");
            System.out.println(Math.min(intOne, intTwo));
        }
    }
}