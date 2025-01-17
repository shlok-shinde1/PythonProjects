/* Program Name: Elapsed Seconds
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program converts the elapsed time given 
 * in seconds into hours, minutes, and seconds.
 */
import java.util.Scanner;
class ElapsedSeconds {
   public static void main(String[] args) {
      int dataInSeconds, hours, minutes, seconds;

      // Initializes the scanner for the user to input an int
      Scanner s = new Scanner(System.in);

      /* Asks the user to input the elapsed time in seconds */
      System.out.print("Enter the elapsed time in seconds: ");
      /* TODO: Use the Scanner to store the data entry in dataInSeconds */
      // Use the Scanner to store the data entry in dataInSeconds
      dataInSeconds = s.nextInt();
      s.close();

      /* Calculate the number of hours by dividing by 3600 (seconds in an hour) */
      hours =  dataInSeconds / 3600; /* TODO: Calculate. Must use mod and/or integer division only. */
      /* Calculate the number of minutes by getting the remainder of hours (mod 3600) and dividing by 60 */
      minutes = (dataInSeconds % 3600) / 60; /* TODO: Calculate. Must use mod and/or integer division only. */
      /* Calculate the remaining seconds by taking the mod of the total seconds with 60 */
      seconds = dataInSeconds % 60; /* TODO: Calculate. Must use mod and/or integer division only.*/

      /* TODO: Output the data as "___ seconds is ___ hours, ___ minutes, ___ seconds."
         Use System.out.format OR System.out.println. See example for output.
      */
      System.out.format("%d seconds is %d hours, %d minutes, %d seconds.", dataInSeconds, hours, minutes, seconds);
   }
}