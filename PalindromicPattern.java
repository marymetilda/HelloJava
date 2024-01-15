public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

/* Implementation of knapsak algoritham */
/* Implementation of two matrices */
/* Implementation of huffman coding algoritham */
/* Implementation of selection sort algoritham */
/* Implementation of task sheduling algoritham */
/* Implementation of bubble sort algoritham */
/* Implementation of fractional knapsak algoritham */