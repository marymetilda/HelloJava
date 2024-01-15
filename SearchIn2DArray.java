import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("Enter values");
        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter search key");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare
                if (numbers[i][j] == x) {
                    System.out.println("search key found at location(" + i + "," + j + ")");
                }
            }
        }
    }
}
