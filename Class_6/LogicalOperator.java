// Class definition for LogicalOperator
class LogicalOperator {
    // Main method, which is the entry point for any Java application
    public static void main(String[] args) {
        // Declare three integer variables and initialize them
        int no1 = 10;
        int no2 = 20;
        int no3 = 30;

        // Check if no1 is greater than no2 and print the result (false)
        System.out.println(no1 > no2);  // This evaluates to false because 10 is not greater than 20

        // Check if no1 is less than no2 and print the result (true)
        System.out.println(no1 < no2);  // This evaluates to true because 10 is less than 20

        // Check if no1 is greater than no2 AND no2 is less than no3 and print the result (false)
        // Uses the logical AND operator (&&); both conditions must be true for the result to be true
        System.out.println(no1 > no2 && no2 < no3);  // This evaluates to false && true, which results in false

        // Check if no1 is less than no2 AND no2 is less than no3 and print the result (true)
        // Both conditions are true, so the result is true
        System.out.println(no1 < no2 && no2 < no3);  // This evaluates to true && true, which results in true
    }
}
