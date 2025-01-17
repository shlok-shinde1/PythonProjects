/* Program Name: Coin Change
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program converts the amount of money
 * in change, in cents, between 0-99 to calculate the correct amount of change 
 */

import java.util.Scanner;
class Coins {
    public static void main(String[] args) {
        final int totalCoins, qValue, dValue, nValue, pValue;

        Scanner s = new Scanner(System.in);

        // The amount of change to then be used for converting and sorting into respective coin amounts.
        System.out.print("Enter the amount of change (0-99): ");
        totalCoins = s.nextInt();
        s.close();

        // Calculate the amount of quarters, dimes, and nickles
        qValue = totalCoins / 25; // Calculate the amount of quarters in change
        dValue = (totalCoins % 25) / 10; // Calculate the amount of dimes in change
        nValue = totalCoins % 25 % 10 / 5; // Calculate the amount of nickles in change
        pValue = totalCoins % 25 % 10 % 5; // Calculate the amount of pennies in change

        System.out.format("Number of quarters: %d\nNumber of dimes %d\nNumber of nickles: %d\nNumber of pennies %d\n",  qValue, dValue, nValue, pValue);
    } 
}
