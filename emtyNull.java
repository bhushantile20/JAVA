public class emtyNull {
    public static void main(String args[]) {
        String str1 = null;
        String str2 = "";
        String str3 = " ";

        System.out.println("Str1 is " + isNullEmpty(str1));
        System.out.println("Str2 is " + isNullEmpty(str2));
        System.out.println("Str3 is " + isNullEmpty(str3));

    }

    public static String isNullEmpty(String str) {
        if (str == null) {
            return "null";
        } else if (str.isEmpty()) {
            return "EMPTY";
        } else {
            return "neither NULL not empty";

        }

    }
}



