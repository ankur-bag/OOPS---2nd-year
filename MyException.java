class myException extends Exception {
    myException(String msg) {
        super(msg);
    }
}

public class MyException {
    public static void main(String[] args) {
        try {
            throw new myException("This is my custom exception");
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }
}