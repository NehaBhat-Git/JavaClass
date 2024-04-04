public class StringOperations {
    public static void main(String[] args) {
        // Creating string variables
        String firstName = "Neha";
        String lastName = "Bhat";

        // Concatenating strings to create a full name
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName); // Prints: Full Name:Neha Bhat

        // Finding the length of the fullName string
        int nameLength = fullName.length();
        System.out.println("Length of Full Name: " + nameLength); // Prints the length of fullName

        // Converting fullName to uppercase
        String upperCaseName = fullName.toUpperCase();
        System.out.println("Full Name in Upper Case: " + upperCaseName);
    }
}
