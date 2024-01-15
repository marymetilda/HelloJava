import java.util.*;

public class Multiply {
    public static int caculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The product of two nubers is " + caculateProduct(a, b));
    }
}
