/* Arthur Busch
 * August 31, 2024
 * Integer Print Out
 * This program demonstrates how the mighty if-else statement can identify a
 * user-provided integer as being positive, negative or neither.
 * Includes an algorithm for error detection.
 */

package com.mycompany.arthurbusch_integerprintout;

import java.util.Scanner;   // Import scanner module for user input
import java.util.InputMismatchException;    // Validates user input

/**
 *
 * @author Arthur
 */
public class ArthurBusch_IntegerPrintOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Scanner object for user input
        byte intValue = 0;  // I didn't see a length stipulation for this one
        
        // Prompt user for input as long as integer equals zero
        do {
            System.out.print("Enter an integer value: ");   // User prompt
            
            // Validate user input
            try {
                intValue = in.nextByte();  // Take user input
            
                // Check if input is positive, negative or neither
                if (intValue > 0) {
                    System.out.print("The integer you entered is positive.");
                } else if (intValue < 0) {
                    System.out.print("The integer you entered is negative.");
                } else {
                    System.out.println("Zero is a neutral number, neither positive nor negative.");
                }
            } catch (InputMismatchException ex) {   // If input is invalid
                System.out.printf("The prompt asked for an INTEGER, dumbass. %n"
                                + "And I don't remember integer LENGTH being in the rubric. %n");
                in = new Scanner(System.in);    // Initialize scanner
            }
        } while (intValue == 0);
    }
}
