public class RangePerfect {
    public static void main(String argsp[]) {
        for (int n = 1; n < 100000; n++) {
            int sum = 0;

            for (int i = 1; i <= n - 1; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            if (n == sum)
                System.out.println(n);
        }
    }
}
