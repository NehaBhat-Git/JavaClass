class UnaryOperator2 {
    public static void main(String[] args) {
        // Initialize the variable 'num' with value 10
        int num = 10;
        
        // Print the current value of 'num', which is 10
        System.out.println(num); // Outputs: 10
        
        // Post-increment: Print 'num' then increase its value by 1
        // The current value is printed first before incrementing
        System.out.println(num++); // Outputs: 10, then 'num' becomes 11
        
        // Pre-increment: Increase 'num' by 1 then print its value
        // 'num' was 11 and now becomes 12 before printing
        System.out.println(++num); // Outputs: 12
        
        // Print the current value of 'num' after increments, which is 12
        System.out.println(num); // Outputs: 12

        // Separator for clarity in output
        System.out.println("------------------------------------");

        // Print the current value of 'num', which is still 12
        System.out.println(num); // Outputs: 12
        
        // Post-decrement: Print 'num' then decrease its value by 1
        // The current value is printed first before decrementing
        System.out.println(num--); // Outputs: 12, then 'num' becomes 11
        
        // Pre-decrement: Decrease 'num' by 1 then print its value
        // 'num' was 11 and now becomes 10 before printing
        System.out.println(--num); // Outputs: 10
        
        // Print the current value of 'num' after decrements, which is 10
        System.out.println(num); // Outputs: 10
    }
}
