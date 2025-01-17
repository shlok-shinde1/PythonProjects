/* Program Name: Conditions
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program asks the user for a username and a password. The program will print "Welcome!" if the username and password are entered correctly.
 */

 import java.util.Scanner;
 class conditions {
    public static void main(String[] args) {
       String user, pass;
       Scanner s = new Scanner(System.in);
       System.out.print("Enter username: ");
       user = s.nextLine();

       // Checks to see if the username entered isn't "orange".
       if (!user.equals("orange")) {
          System.out.println("Unknown user, '" + user + "'.");
          s.close();
          return; // Quits the program.
       }
       System.out.print("Enter password: ");
       pass = s.nextLine();
       s.close();

       // Checks to see if the username entered isn't "white".
       if (!pass.equals("white")) {
       System.out.println("Incorrect password.");
       s.close();
       return; // Quits the program.
       }
    System.out.println("Welcome!"); // Prints "Welcome!" if both username and password are entered correctly.
    }
}