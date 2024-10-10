/* Arthur Busch
 * August 30, 2024
 * Miles-Per-Gallon
 * This program calculates miles per gallon. The user first provides the number
 * of miles driven and gallons of gas used. The result is then calculated.
 * Includes an advanced bullshit detection algorithm.
 */

package com.mycompany.arthurbusch_milespergallon;

//Import Classes
import java.util.Scanner;   // Import scanner module for user input
import java.util.InputMismatchException;    // Validates user input

/**
 *
 * @author Arthur
 */
public class ArthurBusch_MilesPerGallon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Scanner object for user input
        
        // Declare and initialize variables
        float milesDriven = 0;
        float gasUsed = 0;
        float mpg = 0;
        boolean milesDrivenOK = false;   // Check for miles driven entry
        boolean gasUsedOK = false;   // Check for gas used entry
        
        // User prompt for miles driven if not already entered
        do {
            System.out.print("Enter number of miles driven: ");
            
            try {
                milesDriven = in.nextFloat();  // Take user input
                milesDrivenOK = true;    // Set milesDriven entered status
            } catch (InputMismatchException ex) {   // If input is invalid
                System.out.println("I asked for a NUMBER of miles. Are you blind or just really stupid?");
                in = new Scanner(System.in);    // Initialize scanner
            }
        } while (milesDrivenOK == false);
        
        // User prompt for gas used if not already entered
        do {
            System.out.print("Enter gallons of gas used: ");
            
            try {
                gasUsed = in.nextFloat();  // Take user input
                gasUsedOK = true;    // Set gasUsed entered status
            } catch (InputMismatchException ex) {   // If input is invalid
                System.out.println("That's not a number of gallons, dumbass.");
                in = new Scanner(System.in);    // Initialize scanner
            }
        } while (gasUsedOK == false);
        
        // Calculate MPG after both values entered
        if (milesDrivenOK == true && gasUsedOK == true) {
            mpg = milesDriven / gasUsed;
            
            // Check if user is an idiot
            if (mpg > 70) { // or maybe they're just European
                System.out.println("Demonstrating that it's possible to produce really high mileage cars,");
                System.out.println("Volkswagen has produced a diesel-electric plug-in hybrid that gets 261");
                System.out.println("miles per gallon - the most effecient car ever made!");
                System.out.println("Too bad you don't have one.");
            } else if (mpg < 6) {   // and forgot we use freedom units
                System.out.println("Get real kid. Even my Land Cruiser gets better gas mileage than you.");
            } else {    // 'Murica! Fuck yeah!
                System.out.print("Miles per gallon: ");
            System.out.println(mpg);
            }
        }
    }
}
