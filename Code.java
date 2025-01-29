class Code {
    public static void main(String argsp[]) {
        int n = 365;

        while (n != 0) {
            int d = n % 10;
            System.out.println(d);// print digit
            n = n / 10;// remove that digit

        }

    }
}

// n%10-> gives last digit
