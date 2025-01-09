class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class excep4 {
    public static void main(String args[]) {
        try {
            if (args.length == 0) {
                throw new MyException("No arguments provided");
            }

            if (args[0].equals("hello")) {
                System.out.println("String is right");
            } else {
                throw new MyException("Invalid String");
            }
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
