public class SD {
    public static void main(String[] args) {
        double[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double SD1 = calculateSD(numArray);

        System.out.println("Standarddeviation =%.6f", SD1);
s
    }

    public static double calculateSD(double numArray[]) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;
        for (double num : numArray) {
            sum += num;
        }

        double mean = sum / length;
        for (double num : numArray) {
            SD += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / length);

    }
}
