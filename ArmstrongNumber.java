import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[])

    {
        int n, sum = 0, temp, remainder, digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an armstrong number:");

        n = in.nextInt();
        temp = n;

        while (temp != 0) {
            digits++;
            temp = temp / 10;

        }
        temp = n;

        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        if (n == sum)
            System.out.println(n + "is an armstrong numbers");
        else
            System.out.println(n + "is not an armstrong number");
    }

    static int power(int n, int r) {
        int c,   p =1;

        return p;
    }

}
