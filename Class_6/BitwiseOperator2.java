// Class definition for BitwiseOperator2
class BitwiseOperator2 {
    // Main method, which is the entry point for any Java application
    public static void main(String[] args) {
        // Declare an integer variable 'no1' and initialize it with the value 14
        int no1 = 14;  // Binary representation of 14 is 1110

        // Apply right shift operator which shifts the bits of 'no1' two positions to the right
        // This divides the number by 2^2 (i.e., 4), so 14 / 4 = 3.5, which is truncated to 3
        int no2 = no1 >> 2;  // Binary result is 0011 which is 3 in decimal

        // Apply left shift operator which shifts the bits of 'no1' two positions to the left
        // This multiplies the number by 2^2 (i.e., 4), so 14 * 4 = 56
        int no3 = no1 << 2;  // Binary result is 111000 which is 56 in decimal

        // Output the results of the bitwise shift operations
        System.out.println(no2);  // Prints 3
        System.out.println(no3);  // Prints 56
    }
}
