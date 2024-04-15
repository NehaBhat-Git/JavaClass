class unaryOperator3 {
    public static void main(String[] args) {
        // Initialize the variable 'no' with the value 10
        int no = 10;
        
        // Post-increment 'no' and add to 'no' then print
        // The expression evaluates as follows: (no++) + no
        // First, 'no' is used in the expression as 10, then it is incremented to 11
        // Next, the new value of 'no' (11) is added to the previous 'no' (10)
        System.out.println(no+++no); // Outputs: 21 (10 + 11)

        // Here's a commented out line with an intended expression that would cause an error
        // because it is ambiguous without proper parentheses
        // System.out.println(++no+no); // Error if uncommented

        // Pre-increment 'no' and add to 'no' then print
        // First increment 'no' (now 12), then use the new value twice in the addition
        System.out.println(++no+no); // Outputs: 24 (12 + 12)

        // Pre-increment 'no' both times before subtracting and print
        // First increment 'no' (now 13), then again increment 'no' (now 14),
        // and subtract the second incremented value from the first
        System.out.println(++no-++no); // Outputs: -1 (13 - 14)

    }
}
