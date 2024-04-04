class LocalVar {
    public static void main(String[] args) {
        // Declare a local variable inside the main method
        int localNumber = 5;

        // Use the local variable
        System.out.println("The local variable value is: " + localNumber);

        // Trying to use localNumber outside its block (like outside of main) would result in an error
    }

    public void anotherMethod() {
        // localNumber is not accessible here, uncommenting the following line would cause a compilation error
        //System.out.println(localNumber);
    }
}
