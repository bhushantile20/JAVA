public class Code2 {
    public static void main(String args[]) {
        int n = 365;
        int sum = 0;

        while (n != 0) {
            int d = n % 10;
            System.out.println(d);
            n = n / 10;

        }
        System.out.println(sum);
    }

}