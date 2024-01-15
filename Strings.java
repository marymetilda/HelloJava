import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Your name is : " + name);

        // concatenation
        String firstName = "tony";
        String secondName = "stark";
        String fullName = firstName + "@" + secondName;
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // compare
        String name1 = "Tony";
        String name2 = "Tony";

        // 1 s1 > s2 : +ve value;
        // 2 s1 == s2: 0;
        // 3 s1 < s2 : -ve value;

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }

        // Strings are immutable
    }
}
