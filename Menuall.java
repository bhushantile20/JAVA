import java.util.Scanner;

class Menuall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            int ch = scan.nextInt();

            if (ch == 1) {
                System.out.println("Enter 2 numbers:");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Sum = " + (a + b));
            } else if (ch == 2) {
                System.out.println("Enter 2 numbers:");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Difference = " + (a - b));
            } else if (ch == 3) {
                System.out.println("Enter 2 numbers:");
                int a = scan.nextInt();
                int b = scan.nextInt();
                System.out.println("Product = " + (a * b));
            } else if (ch == 4) {
                System.out.println("Enter 2 numbers:");
                int a = scan.nextInt();
                int b = scan.nextInt();
                if (b != 0) {
                    System.out.println("Quotient = " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            } else if (ch == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scan.close();
    }
}
