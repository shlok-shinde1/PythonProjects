/* Program Name: AdvancedCalc
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program does basic arithmetic functions given the inputted integers and operators.
 */

import java.util.Scanner; // Import the Scanner class.
class AdvancedCalc {
   public static void main(String[] args) {
      int left, right; // Initialize variables for the left and right operands.
      int result; // Initialize a variable for result.
      String operator; // Initialize a variable to hold the operator as a string.
      Scanner s = new Scanner(System.in);

      // Prompt the user to enter the calculation in the form of "<left> <op> <right>".
      System.out.print("Enter <left> <op> <right>: ");
      left = s.nextInt();  
      operator = s.next();
      right = s.nextInt();
      s.close();

      // Use a switch statement to perform the operation based on the operator
      switch (operator) {
        case "+": // Case for addition
        result = left + right; // Do addition
        System.out.println(left + " + " + right + " = " + result); // Print result
        break; // Exit the switch statement
        case "-": // Case for subtraction
        result = left - right; // Do subtraction
        System.out.println(left + " - " + right + " = " + result); // Print result
        break; // Exit the switch statement
        case "*": // Case for multiplication
        result = left * right; // Do multiplication
        System.out.println(left + " * " + right + " = " + result); // Print result
        break; // Exit the switch statement
        case "/": // Case for division
        if (right != 0) { // Checks to see if the right operand isn't 0
        result = left / right; // Do division
        System.out.println(left + " / " + right + " = " + result); // Print result
        } else {
            System.out.println("Error: Division by zero."); // Output an error message if user tries to divide by 0
        }
        break; // Exit switch statement
        default: // Case for default (unsupported operators)
        System.out.println("Invalid Operator!"); // Output an error message if the user tries to input a wrong operator
        break; // Exit switch statement
    }
   }
}