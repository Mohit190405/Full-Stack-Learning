package mohit;

public class StringMethods {
	public static void main(String[] args) {

        String s = "Mohit Prajapati";

        System.out.println("Length: " + s.length());
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Contains Mohit: " + s.contains("Mohit"));
        System.out.println("Substring: " + s.substring(0, 5));
    }
}
