public class InstanceVar {
    // Instance variables
    String name;
    int grade;
    // Parameter names are different from instance variable names to avoid conflict.
    public InstanceVar(String studentName, int studentGrade) {
        name = studentName;
        grade = studentGrade;
    }

    // Method to display the student's details
    public void displayDetails() {
        System.out.println("Student Name: " + name + "\nGrade: " + grade);
    }

    public static void main(String[] args) {
        // Creating a Student object with name "John" and grade 7
        Student student1 = new Student("John", 7);

        // Displaying the details of student1
        student1.displayDetails(); // Outputs: Student Name: John, Grade: 7
    }
}

