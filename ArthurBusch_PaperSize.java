/* Arthur Busch
 * August 30, 2024
 * Paper Size
 * This program computes the perimeter and diagonal length of a given size of paper.
 * Diagonal length is given by the Pythagorean theorem:
 *
 *           ----------------------------------
 *          /         **           *        **
 *         /            *          *          *
 *        /    ****    *     *     * ****    *
 * \     /    *    *  ***    *     **    *  ***
 *  \   /    *     *       *****  *      *
 *   \ /     *    *          *    **    *
 *    /       **** *         *    * ****
 *
 * The catch is that it only does one size (8½ × 11, Letter size).
 */

package com.mycompany.arthurbusch_papersize;

import java.util.Scanner;   // Import scanner module for user input
import java.lang.Math;      // Import math module for Pythagoras'

/**
 *
 * @author Arthur
 */
public class ArthurBusch_PaperSize {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // Scanner object for user input
        
        // Declare variables
        // Byte type used to save memory
        byte length = 0;    // I remember floppy disks and dial-up
        byte width = 0; // We should be grateful for every byte of memory we have
        String paperSize = "";
        
        // Prompt user to enter paper size, if not already entered
        do {
            System.out.print("Enter paper size: ");
            paperSize = in.nextLine();
            
            // Check if Letter (8½ × 11) size has been entered
            if  (paperSize.toUpperCase().equals("LETTER")) {
                length = 85;    // Length in tenths of an inch
                width = 110;    // Width in tenths of an inch
                
                System.out.println("Paper size: Letter " + "(" + "8½ × 11" + ")");
                
                // Calculate perimeter
                System.out.print("Perimeter: ");
                System.out.println((2 * length + 2 * width) / 10);
                
                // Calculate diagonal
                System.out.print("Diagonal: ");
                System.out.println(Math.sqrt(((length * length) / 100 + (width * width) / 100)));
            } else{
                System.out.printf("This program is for finding the measurements of a LETTER size sheet of paper only. %n"
                                + "If you wanted another size, you shoulda got someone who actually knows Java.");
            }
        } while (paperSize == "");
        
    }
}
