class CLineInput {
    public static void main(String args[]) {
        int invalid = 0;
        int number, count = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                number = Integer.parseInt(args[i]);

            } catch (NumberFormatException e) {
                invalid = invalid + 1;
                System.out.println("Invalid numbers :" + args[i]);
                continue;
            }
            count = count + 1;
        }
        System.out.println("Valid Numbers=" + count);
        System.out.println("Invalide number=" + invalid);
    }
}