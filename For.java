public class For {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;

        // Block 1: The Star Section (Top 3 rows)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println("\n"); // Double spacing for visual clarity
        }

        // Block 2: The Dot Section (Bottom 3 rows)
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("  ");
            }
            System.out.println("\n");
        }
    }
}