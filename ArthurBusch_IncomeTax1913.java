/* Arthur Busch
 * September 10, 2024
 * Income Tax 1913 Adventure v1.1
 * The year is 1913 and it's that time of year again for the first time,  The
 * time has unfortunately come to pay old Uncle Sam his cut. The good news is
 * that the 1913 tax code is far simpler than the eldritch horror us over 25s
 * have become familiar with.
 *
 * The rules are as follows. Let m = income:
 *         Under $50,000 : 1 percent (m × 0.01)
 *    $50,000 to $75,000 : 2 percent (m × 0.02)
 *    $75,000 to $100,000: 3 percent (m × 0.03)
 *   $100,000 to $250,000: 4 percent (m × 0.04)
 *   $250,000 to $500,000: 5 percent (m × 0.05)
 *   $500,000 and over   : 6 percent (m × 0.06)
 */

package com.mycompany.arthurbusch_incometax1913;

// Import modules
import java.util.Scanner;                   // To take user input
import java.util.InputMismatchException;    // Validates user input
import java.text.DecimalFormat;             // To show two decimal places

/**
 *
 * @author Arthur
 */
public class ArthurBusch_IncomeTax1913 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Scanner object for user input
        
        DecimalFormat df=new DecimalFormat("#.##");   // Show two decimal places
        df.setMaximumFractionDigits(2);      // Maximum number of decimal places
        df.setMinimumFractionDigits(2);      // Minimum number of decimal places
        
        float dollars = 0;  // input in units of $10 and output in $1s
        
        System.out.println("Knock knock! It's the newly formed IRS!");
        System.out.print("How many Hamiltons did you make last year? $");
        
        // Prompt user for income
        do {    // While no income entered
            try {   // Income is a valid float
                dollars = in.nextFloat();  // Take user input
                
                // Multiply income by appropriate tax rate
                if (dollars >= 25000) {   // Income entered is at least $250,000
                    dollars *= 0.5;       // ([m / 10] * 50%)
                    System.out.println("You owe $" + df.format(dollars) + " in taxes. Have a nice day.");
                } else if (dollars >= 10000) {  // Income entered between $100,000 and $249,999.99
                    dollars *= 0.4;             // ([m / 10] * 40%)
                    System.out.println("You owe $" + df.format(dollars) + " in taxes. Have a nice day.");
                } else if (dollars >= 7500) {  // Income entered between $75,000 and $99,999.99
                    dollars *= 0.3;            // ([m / 10] * 30%)
                    System.out.println("You owe $" + df.format(dollars) + " in taxes. Have a nice day.");
                } else if (dollars >= 5000) {  //  Income entered between $50,000 and $74,999.99
                    dollars *= 0.2;            // ([m / 10] * 20%)
                    System.out.println("You owe $" + df.format(dollars) + " in taxes. Have a nice day.");
                } else {                 //  Income entered is under $50,000
                    dollars *= 0.1;      // ([m / 10] * 10%)
                    System.out.println("You owe $" + df.format(dollars) + " in taxes. Have a nice day.");
                }   // Fun fact: "percent" literally means the number divided by 100
                    // (Latin: "per centum" meaning "for every hundred")
                
            } catch (InputMismatchException ex) {   // Income is invalid
                System.out.printf("You think this is some kinda joke?%n"
                                + "They're gonna love you in the pen, city boy.%n"
                                + "How much did you REALLY make last year? $");
                in = new Scanner(System.in);    // Initialize scanner
            }
        } while (dollars == 0);
    }
}
