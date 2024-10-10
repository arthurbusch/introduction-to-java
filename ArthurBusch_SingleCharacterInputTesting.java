/* Arthur Busch
 * August 31, 2024
 * Single Character Input Testing
 * This program helps the user understand their ABCs. First, the user is
 * prompted to enter *one* letter. It then tells the user if the letter entered
 * is a vowel or consonant. Includes error and y-detection algorithms.
 */

package com.mycompany.arthurbusch_singlecharacterinputtesting;

import java.util.Scanner;   // Import scanner module for user input

/**
 *
 * @author Arthur
 */
public class ArthurBusch_SingleCharacterInputTesting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Scanner object for user input
        // Waste 38 bytes on a single character
        String singleChar = ""; // because Java had to deprecate Char class
        
        do {
            // User prompt
            System.out.print("Enter one letter: ");
            singleChar = in.nextLine();  // Take user input
            
            // Capitalize singleChar if lower case
            if (singleChar.length() > 1) {  // User inputs more than one letter
                System.out.printf("%nI said ONE letter, not " + singleChar.length()
                                  + ".%nLet's just take the first letter, ");
                singleChar = singleChar.toUpperCase();
                System.out.print(singleChar.charAt(0) + ".");
            } else {
                singleChar = singleChar.toUpperCase();
            }
        
            // Check if input is a letter
            if ((singleChar.charAt(0) >= 'A') && (singleChar.charAt(0) <= 'Z')) {
                // Check if input is a vowel, consonant, or neither
                if ((singleChar.charAt(0) == 'A') ||
                    (singleChar.charAt(0) == 'E') ||
                    (singleChar.charAt(0) == 'I') ||
                    (singleChar.charAt(0) == 'O') ||
                    (singleChar.charAt(0) == 'U')) {
                    System.out.printf("%n" + singleChar.toUpperCase().charAt(0) + " is a vowel.%n");
                } else if (singleChar.charAt(0) == 'Y') {
                    System.out.printf("%n" + singleChar.toUpperCase().charAt(0) + " is sometimes a vowel.%n");
                } else {
                    System.out.printf("%n" + singleChar.toUpperCase().charAt(0) + " is a consonant.%n");
                }
            } else {
                System.out.printf("%nI said enter ONE letter. ONE. SINGLE. LETTER.%n"
                                + "Let's try this again.%n");
            }
            singleChar = "";
            
        } while (singleChar == "");
    }
}
