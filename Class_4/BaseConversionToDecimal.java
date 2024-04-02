// Define a class named Binary2DecimalConversion
class BaseConversionToDecimal{
    // Main method - the entry point of the Java program
    public static void main(String[] args) {
        String input = "101";
        int ValueBinToDec = Integer.parseInt(input,2);
        int ValueOctToDec = Integer.parseInt(input,8);
        int ValueHexToDec = Integer.parseInt(input,16);
        System.out.println(ValueBinToDec+" "+ ValueHexToDec+" " + ValueOctToDec+" ");

    }
}
