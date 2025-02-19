public class subString {
    public static void main(String[] args) {
        String txt = "this is programiz";
        String str1 = "Programiz";
        String str2 = "Programiz";

        int result = txt.indexOf(str1);
        if (result == -1) {
            System.out.println(str1 + " not is present in the String ");

        } else {
            System.out.println(str1 + "is present in the string ");

        }

        result = txt.indexOf(str2);
        if (result == -1) {
            System.out.println(str2 + "is not present in the String");
        } else {
            System.out.println(str2 + "is present in the strnig ");
        }
    }
}
