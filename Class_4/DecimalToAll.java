// Define a class named DecimalToAll
class DecimalToAll {
    // Main method - serves as the entry point of the program
    public static void main(String[] args) {
        // Convert the decimal number 5 into a binary number and print the result
        // The Integer.toBinaryString method is used to convert a decimal number into its binary string representation
        System.out.println("Convert this decimal number into BinaryNumber : " + (Integer.toBinaryString(5))); //output: 101
        
        // Convert the decimal number 15 into an octal number and print the result
        // The Integer.toOctalString method converts a decimal number into its octal string representation
        System.out.println("Convert this decimal number into OctalNumber : " + (Integer.toOctalString(15))); //output: 70
    
        // Convert the decimal number 5 into a hexadecimal number and print the result
        // The Integer.toHexString method converts a decimal number into its hexadecimal string representation
        System.out.println("Convert this decimal number into HexadecimalNumber : " + (Integer.toHexString(5))); //output: b
    }
}
