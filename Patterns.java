public class Patterns {
    public static void main(String[] args) {
        // Solid Rectangle
        int n = 4;
        int m = 5;

        // outer loop
        for (int i = 0; i < 4; i++) {
            // inner loop
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
