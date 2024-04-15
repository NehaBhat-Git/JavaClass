// Define the class named BitwiseOperator
class BitwiseOperator {
    // The main method where the program execution begins
    public static void main(String[] args) {
        // Declare an integer variable 'no1' and initialize it to 10
        // Binary representation of 10 is 1010
        int no1 = 10; 

        // Declare another integer variable 'no2' and initialize it to 2
        // Binary representation of 2 is 0010
        int no2 = 2;  

        // Perform bitwise AND on no1 and no2, and print the result
        // Bitwise AND of 1010 (10) & 0010 (2) is 0010 (2)
        System.out.println(no1 & no2);

        // Perform bitwise OR on no1 and no2, and print the result
        // Bitwise OR of 1010 (10) | 0010 (2) is 1010 (10)
        System.out.println(no1 | no2);

        // Perform bitwise XOR on no1 and no2, and print the result
        // Bitwise XOR of 1010 (10) ^ 0010 (2) is 1000 (8)
        System.out.println(no1 ^ no2);
    }
}
