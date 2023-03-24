package AnonymousClass;

public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (java.lang.Exception e){
            System.out.println(e);
        }


        finally {
            System.out.println("END");
        }
    }
}
