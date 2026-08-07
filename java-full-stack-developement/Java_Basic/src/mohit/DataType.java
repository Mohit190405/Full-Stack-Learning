package mohit;

public class DataType {

    public static void main(String[] args) {

        // Primitive
        int age = 21;
        double cgpa = 6.75;
        char grade = 'A';
        boolean passed = true;

        // Non-Primitive
        String name = "Mohit Prajapati";
        int[] marks = {80, 85, 90};

        System.out.println("===== Primitive =====");
        System.out.println("Age    : " + age);
        System.out.println("CGPA   : " + cgpa);
        System.out.println("Grade  : " + grade);
        System.out.println("Passed : " + passed);

        System.out.println();

        System.out.println("===== Non-Primitive =====");
        System.out.println("Name   : " + name);
        System.out.println("Marks  : " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }
}