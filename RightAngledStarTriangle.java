public class RightAngledStarTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns (prints stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print a star and a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}