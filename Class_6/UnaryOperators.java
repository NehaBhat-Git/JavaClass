// Class declaration for UnaryOperators.
class UnaryOperators {
    // Main method which is the entry point of any Java application.
    public static void main(String[] args) {
        // Declares an integer variable 'Incvalue' and initializes it to 10.
        int Incvalue = 10;

        // Outputs the current value of 'Incvalue' (which is 10).
        System.out.println(Incvalue); // Output will be 10
        // Post-increment operator on 'Incvalue'; the value is incremented after this line.
        Incvalue++;  //store the increment value in the variable 'Incvalue + 1 --> 11    

        // Outputs the incremented value of 'Incvalue'. After the previous line, 'Incvalue' becomes 11.
        System.out.println(Incvalue); // Output will be 11

        // Declares another integer variable 'Incvalue2' and initializes it to 20.
        int Incvalue2 = 20;
        // Outputs the current value of 'Incvalue2' (which is 20).
        System.out.println(Incvalue2); // Output will be 20
        // Pre-increment operator on 'Incvalue2'; the value is incremented before the next use.
        ++Incvalue2; 

        // Outputs the incremented value of 'Incvalue2'. 'Incvalue2' is incremented to 21 before being printed.
        System.out.println(Incvalue2); // Output will be 21
    }
}
