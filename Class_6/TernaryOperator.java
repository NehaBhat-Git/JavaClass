// Class definition for TernaryOperator
class TernaryOperator {
    // Main method, which is the entry point for any Java application
    public static void main(String[] args) {
        // Declare two integer variables and initialize them
        int no1 = 10;
        int no2 = 20;

        // Use the ternary operator to evaluate a condition and assign a value to 'result'
        // If no1 is greater than no2 (false), assign 5, otherwise assign 10
        int result = (no1 > no2) ? 5 : 10;  // Since 10 is not greater than 20, result is 10

        // Use the ternary operator to evaluate a condition and assign a value to 'result1'
        // If no1 is less than no2 (true), assign 5, otherwise assign 10
        int result1 = (no1 < no2) ? 5 : 10;  // Since 10 is less than 20, result1 is 5

        // Print the results of the ternary operations
        System.out.println(result);  // Outputs 10
        System.out.println(result1); // Outputs 5
    }
}
