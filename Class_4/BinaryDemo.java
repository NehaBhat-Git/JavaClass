// Class declaration for BinaryDemo
class BinaryDemo {
    // Main method - the entry point of the application
    public static void main(String[] args) {
        // Declares an integer variable 'a' and initializes it with a binary literal.
        // The binary value 0b111 represents the decimal value 7.
        // '0b' is the prefix used in Java to indicate a binary literal.
        int a = 0b111; 
        
        // Prints the value of 'a' to the console.
        // Although 'a' is defined using a binary literal, it is printed as a decimal value.
        System.out.println("a: " + a); // Output will be "a: 7"
    }
}