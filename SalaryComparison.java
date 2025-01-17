/* Program Name: Salary Comparison
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program takes two, pre-tax annual salaries and compares their monthly take-home pay as well as how to budget for their salaries.
 */

import java.util.Scanner;

class SalaryComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int salaryInput1, salaryInput2;
        
        // Ask the user to input their salary from the first job
        System.out.print("Enter the salary for the first job (no commas): $");
        salaryInput1 = s.nextInt();
        // Ask the user to input their salary from the second job
        System.out.print("Enter the salary for the second job (no commas): $");
        salaryInput2 = s.nextInt();
        s.close();

        // Create new instance of Budget objects for each salary to be used
        Budget job1 = new Budget(salaryInput1); // Create an object called job1 of the class Budget
        Budget job2 = new Budget(salaryInput2); // Create an object called job2 of the class Budget
        // Calculate the take home pay for the salaries
        job1.calculateTHP(); // Call the calculate Take Home Pay on job1 
        job2.calculateTHP(); // Call the calculate Take Home Pay on job2

        // Calculate the budget for job 1 based on the 50/30/20 rule
        double needs, wants, savings;
        needs = job1.calculateBudgetCategory(50);
        wants = job1.calculateBudgetCategory(30);
        savings = job1.calculateBudgetCategory(20);
        System.out.format("Monthly Take Home Salary for Job 1: $%.2f\n", job1.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);

        // Calculate the budget for job 2 based on the 50/30/20 rule
        needs = job2.calculateBudgetCategory(50);
        wants = job2.calculateBudgetCategory(30);
        savings = job2.calculateBudgetCategory(20);
        System.out.format("Monthly Take Home Salary for Job 2: $%.2f\n", job2.getMonthlyTakeHomePay());
        System.out.format("By the 50/30/20 Budget, spend up to $%.2f on needs (Food, shelter, etc)\n", needs);
        System.out.format("                        spend up to $%.2f on wants (Hobbies, travel, etc)\n", wants);
        System.out.format("                        and up to   $%.2f on savings (retirement, emergency fund)\n", savings);
    }
}