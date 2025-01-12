import java.util.Scanner;

class swaptwonumbers {
    public static void main(String argsp[]) {
        int x, y;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping \nx=" + x + "\ny" + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping \nx=" + x + "\ny=" + y);

    }
}