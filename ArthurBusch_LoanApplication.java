/* Arthur Busch
 * August 31, 2024
 * Loan Application (Logical Operator)
 * A program for determining whether or not an applicant qualifies for a loan.
 * The requirements are a minimum income of $30,000, and the applicant must be
 * currently employed for two years. This program uses logical operators and
 * includes idiot, job-hopper and poor detection algorithms.
 */

package com.mycompany.arthurbusch_loanapplication;

import java.util.InputMismatchException;    // Validates user input
import java.util.Scanner;   // Import scanner module for user input
import java.lang.Math;      // Import math module

/**
 * 
 * @author Arthur
 */
public class ArthurBusch_LoanApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Scanner object for user input
        
        float yearlyIncome = 0;     // Self-explanatory
        double yearsEmployed = 0;   // Has to be a double for Math.floor method
        
        // Prompt for yearly income if not entered
        do {
            System.out.print("Enter your yearly income: $");
        
            try {   // Validate input
                yearlyIncome = in.nextFloat();  // Take user input
            } catch (InputMismatchException ex) {   // If input is invalid
                System.out.printf("We don't lend money to idiots."
                                + "%nHave a good day.%n");
            in = new Scanner(System.in);    // Initialize scanner
            }
        } while (yearlyIncome == 0);
        
        // Prompt for years employed if not entered
        do {
            // User prompt
            System.out.print("Enter the number of years at your current employer: ");
        
            try {
                yearsEmployed = in.nextFloat();  // Take user input
                yearsEmployed = Math.floor(yearsEmployed); // Round down
            } catch (InputMismatchException ex) {   // If input is invalid
            System.out.printf("We don't lend money to idiots."
                            + "%nHave a good day.%n");
            in = new Scanner(System.in);    // Initialize scanner
            }
        } while (yearsEmployed == 0);
        
        // Check if applicant meets minimum requirements for loan
        if (yearlyIncome >= 30000 && yearsEmployed >= 2) {    // Income
            System.out.printf(" *****   *****  **   **  *****  ******    ***   ******  *****  ** **%n"
                            + "**   ** **   ** ***  ** **   ** **   **  ** **    **   **   ** ** **%n"
                            + "**      **   ** **** ** **      **   ** **   **   **   **      ** **%n"
                            + "**      **   ** ** **** ** **** *****   *******   **    *****  ** **%n"
                            + "**      **   ** **  *** **   ** **  **  **   **   **        **%n"
                            + "**   ** **   ** **   ** **   ** **   ** **   **   **   **   ** ** **%n"
                            + " *****   *****  **   **  *****  **   ** **   **   **    *****  ** **%n"
                            + "You qualify for a loan!%nEnjoy more debt!");
                
        } else if (yearlyIncome >= 30000 && yearsEmployed < 2){    // Years currently employed
                System.out.printf("We don't lend money to job hoppers like you."
                                + "%nHave a good day.%n");
                
        } else {
            System.out.printf("We don't do business with the poors."
                            + "%nHave a good day.%n");
        }
    }
}
