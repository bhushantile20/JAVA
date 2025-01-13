import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string:");
        s1 = in.nextLine();

        System.out.println("Enter the second string:");
        s2 = in.nextLine();

        if (s1.compareTo(s2) > 0) {
            System.out.println("The first string is greater than the second string.");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("The first string is smaller than the second string.");
        } else {
            System.out.println("Both strings are equal.");
        }

        in.close(); // Closing the scanner to prevent resource leaks
    }
}
