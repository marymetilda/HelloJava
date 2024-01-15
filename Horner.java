public class Horner {

    public static int horner(int poly[], int n, int x) {
        int result = poly[0];

        for (int i = 1; i < n; i++) {
            result = result * x + poly[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int poly[] = { 2, 7, 2, -1 };
        int x = 3;
        int n = poly.length;
        System.out.println("Value of polynomial is :" + horner(poly, n, x));
    }
}
