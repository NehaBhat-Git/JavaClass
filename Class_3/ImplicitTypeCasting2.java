// Class definition: ImplicitTypeCasting2
class ImplicitTypeCasting2 {
    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Declare an int variable 'a' and initialize it with the value 10
        // 'int' is a 32-bit signed data type
        int a = 10;
        // Attempting to assign the 'int' value directly to a 'byte' variable without explicit casting
        // This will cause a compilation error because 'byte' is an 8-bit signed data type,
        // and direct assignment could lead to loss of precision or data.
        byte b = a; // Compilation error: "Type mismatch: cannot convert from int to byte"
        // The correct approach requires explicit casting, like: byte b = (byte) a;
        
        // Attempting to print the values of 'a' and 'b'
        // This line would print correctly if the above assignment didn't cause a compilation error.
        System.out.println("a = " + a + "\nb   = " + b);
    }
}
