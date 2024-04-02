// Defines a class named AsciiDemo.
class AsciiDemo {
    // The main method - the entry point of the program.
    public static void main(String[] args) {
        // Loops from 0 to 300 inclusive.
        for (int i = 0; i <= 300; i++) {
            // Casts 'i' to a char and prints it alongside its integer value.
            // This line demonstrates the ASCII character for each integer value from 0 to 300.
            // Note: ASCII officially only goes up to 127. Beyond that, characters are part of extended ASCII sets or Unicode, which Java uses.
            System.out.println((char)i + " : " + i);
        }
    }
}
