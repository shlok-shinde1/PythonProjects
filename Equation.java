/* Program Name: Equation
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program simply
 * uses the scanner class to recieve user input
 * of doubles and uses them to solve an equation.
 */
/* In this program, we will put comments in your code too. */
import java.util.Scanner;
class Equation {
   public static void main(String[] args) {
      double a;
      double b;
      double c;
      double d;
      
      /* Intializes the scanner to read user input */
      Scanner s = new Scanner(System.in);
      System.out.print("Enter four doubles (a * b - c + d): ");
      a = s.nextDouble();
      b = s.nextDouble();
      /* TODO: Get the next double and put it into c */
      c = s.nextDouble();
      /* TODO: Get the next double and put it into d */
      d = s.nextDouble();
      /* Closes the scanner */
      s.close();

      /* Calculates the result of the equation (a * b - c + d) */
      /* TODO: Calculate a * b - c + d */      
      double result = (a * b - c + d);
      /* TODO: Output the data as "a * b - c + d = result".
         See example for output.
      */
      // Formats the output values so that they have 2 decimal digits of precision 
    System.out.format("%.2f * %.2f - %.2f + %.2f = %.2f", a, b, c, d, result);
   }
}