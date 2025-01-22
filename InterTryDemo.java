public class InterTryDemo {
    public static void main(String args[]) {

        try {
            int a = Integer.parseInt(args[0]);
            System.out.println("a: " + a);

            try {
                int[] x = new int[a];
                System.out.println("array size :" + x.length);
            } catch (NullPointerException npe) {
                System.out.println("NPE is raised");
            }

            int b = a + 20;
            System.out.println("b:" + b);

        }

        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Pass one int value:");
        } catch (NumberFormatException nfe) {
            System.out.println("Pass one int value:");
        }

        catch (NegativeArraySizeException nse) {
            int[] x = new int[3];
            System.out.println("In outer try array size :" + x.length);
        }
        System.out.println("After outer try/catch");
    }
}
