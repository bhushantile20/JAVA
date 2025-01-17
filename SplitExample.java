public class SplitExample {
    public static void main(String args[]) {
        String s1 = "java String split method by technolamror";
        String[] words = s1.split("\\s");

        for (String w : words) {
            System.out.println(w);
        }
    }

}
