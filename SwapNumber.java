import java.util.Scanner;

class SwapNumber {
    public static void main(String args[]) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping \nx=" + x + "\ny=" + y);
        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping\nx=" + x + "\ny=" + y);

    }
}