// Class name FloatDemo
class FloatDemo {
    public static void main(String[] args){
        // This line attempts to assign a double value to a float variable, which causes a compilation error.
        // In Java, decimal numbers are treated as double by default.
        // To fix the error, either change the variable type to double or add 'f' or 'F' to the literal to indicate it's a float.
        float num = 10.9; // This will cause an error: "Type mismatch: cannot convert from double to float"
        double num1 = 34.6;
        // Correct way to declare a float:
        // float num = 10.9f; // Adding 'f' to make it a float literal
        
        // Prints the value of num to the console.
        System.out.println("num :" + num);
        System.out.println("num1 :" + num1);
    }
}
