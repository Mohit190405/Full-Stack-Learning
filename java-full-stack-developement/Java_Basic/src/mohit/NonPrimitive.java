package mohit;

interface Greeting {
    void sayHello();
}

class Student implements Greeting {

    String name = "Mohit";

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}

public class NonPrimitive {

    public static void main(String[] args) {

        // 1. String
        String city = "Ahmedabad";

        // 2. Array
        int[] marks = {80, 85, 90};

        // 3. Class / Object
        Student s = new Student();

        // 4. Object type
        Object obj = "This is Object type";

        // 5. Interface reference
        Greeting g = s;

        // 6. Wrapper class
        Integer age = 21;

        System.out.println("===== Non-Primitive Data Types =====");

        System.out.println("String      : " + city);

        System.out.println("Array       : " + marks[0] + ", " + marks[1] + ", " + marks[2]);

        System.out.println("Class/Object: " + s.name);

        System.out.println("Object Type : " + obj);

        System.out.print("Interface   : ");
        g.sayHello();

        System.out.println("Wrapper     : " + age);
    }
}
