class OctalDemo{
    public static void main(String [] args){
        // Initialize an octal number. 015 in octal is equivalent to 13 in decimal.
        int octNum = 015;
        
        // The octNum variable holds the decimal equivalent of the octal number 015.
        // To display the original octal number, you can convert it back to a string in octal format.
        // Using Integer.toOctalString to convert the decimal value back to an octal string.
        String octalString = Integer.toOctalString(octNum);
        
        System.out.println("Original octal number: " + octalString);
        System.out.println("Conversion of Octal number " + octalString + " into decimal representation: " + octNum);
    }
}
