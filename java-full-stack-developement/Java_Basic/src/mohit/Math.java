package mohit;

public class Math {

    public static void main(String[] args) {

        System.out.println("Max: " + max(10, 20));
        System.out.println("Min: " + min(10, 20));
        System.out.println("Power: " + pow(2, 3));
        System.out.println("Square Root: " + sqrt(25));
        System.out.println("Random: " + random());
    }

    private static int max(int i, int j) {
        // Returns the bigger number
        return (i > j) ? i : j;
    }

    private static int min(int i, int j) {
        // Returns the smaller number
        return (i < j) ? i : j;
    }

    private static double pow(int i, int j) {
        // Calculates i raised to the power j
        return java.lang.Math.pow(i, j);
    }

    private static double sqrt(int i) {
        // Calculates square root of the number
        return java.lang.Math.sqrt(i);
    }

    private static double random() {
        // Generates a random number between 0.0 and 1.0
        return java.lang.Math.random();
    }
}