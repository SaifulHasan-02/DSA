package AnonymousClass;

public class ThrowThrows {

    void method() throws ArithmeticException,NullPointerException{
        int a = 10;
        int b = 0;
        int c = a/b;
        throw new ArithmeticException("Exception hai method me");

    }
}
