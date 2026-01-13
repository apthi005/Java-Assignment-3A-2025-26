package assignment;
class DivByZeroException extends Exception {
    public DivByZeroException(String s) {
        super(s);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            if (b == 0) {
                throw new DivByZeroException("Division by Zero is not allowed");
            }
            System.out.println("Result: " + (a / b));
        } catch (DivByZeroException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}