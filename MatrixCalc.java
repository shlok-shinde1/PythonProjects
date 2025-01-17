/* Program Name: MatrixCalc
 * Student Name: Shlok Shinde
 * Student ID: 000-72-5885
 * NetID: sshinde5
 * Description: This program performs the multiplication of a 3x3 matrix and a 3x1 vector, input by the user, to produce and 
 * display a resulting vector with formatted output.
 */

import java.util.Scanner;

class MatrixCalc {
    private final static int VECTOR_SIZE = 3;
    private final static int MATRIX_SIZE = VECTOR_SIZE * VECTOR_SIZE;

    public static void main(String[] args) {
        // Arrays for matrix and vector
        double[] matrix = new double[MATRIX_SIZE];
        double[] vector = new double[VECTOR_SIZE];

        Scanner s = new Scanner(System.in);

        // Input for matrix values
        System.out.format("Enter %d matrix values: ", MATRIX_SIZE);
        for (int i = 0; i < MATRIX_SIZE; i++) {
            matrix[i] = s.nextDouble();
        }

        // Input for vector values
        System.out.format("Enter %d vector values: ", VECTOR_SIZE);
        for (int i = 0; i < VECTOR_SIZE; i++) {
            vector[i] = s.nextDouble();
        }

        // Close the scanner as input is complete
        s.close();

        // Call the multiply method to compute the result and store it in 'result'
        double[] result = multiply(matrix, vector);

        // Print the result
        System.out.print("Result = [");
        printVector(result);
        System.out.println("]");
    }

    /* This method prints the contents of an array with specific formatting.
     * Each value is printed with three decimal places and separated by spaces.
     * There is no trailing space after the last value.
     */

    private static void printVector(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) { // Add a space between values (but not before the first value)
                System.out.print(" ");
            }
            // Print each value with three decimal precision
            System.out.printf("%.3f", arr[i]);
        }
    }

    /* This method multiplies a 3x3 matrix with a 3x1 vector.
     * The matrix is stored in a 1D array in row-major order.
     * The result is a new vector (array) which is returned.
     */

    private static double[] multiply(double[] matrix, double[] vector) {
        // Create an array to store the resulting vector
        double[] result = new double[VECTOR_SIZE];

        // Outer loop iterates over each row of the matrix
        for (int row = 0; row < VECTOR_SIZE; row++) {
            result[row] = 0.0; // Initialize the result for this row
            // Inner loop computes the dot product for this row
            for (int col = 0; col < VECTOR_SIZE; col++) {
                 // Multiply and store the value for the current row of the result
                result[row] += matrix[row * VECTOR_SIZE + col] * vector[col];
            }
        }

        // Returns the calculated result
        return result;
    }
}