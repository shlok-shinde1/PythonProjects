/* Program Name: Loops
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program calculates e^(exponent) and prints it to the screen with four decimal digits of precision.
 */

 import java.util.Scanner; // Import java scanner

 class Loops {
     public static void main(String[] args) {
         double exponent; // Stores exponent entered by the user
         Scanner s = new Scanner(System.in); 
 
         while (true) {
             System.out.print("Enter exponent: "); // Asks the user to input exponent
             
             if (s.hasNextDouble()) { // Check if the input is a double
                 exponent = s.nextDouble();
                 double result = Math.exp(exponent); // Calculate e to the exponent
                 System.out.printf("Result = %.4f%n", result); // Print the result up to 4 decimals
             } else {
                 String input = s.next(); // Extract input as a string
                 if (input.equals("quit")) { // Stop the loop if the user types 'quit'
                     break; 
                 } else {
                     System.out.println("Invalid input."); // Print invalid input message
                 }
             }
         }
         s.close(); // Close the scanner
     }
 }
