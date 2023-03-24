package AnonymousClass;

public class ThrowThrowsDemo {
    public static void main(String[] args) {
        ThrowThrows obj = new ThrowThrows();

        try{
            obj.method();
            System.out.println("This is try block");
        }

        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception here");
            System.out.println(e.getMessage());
        }


        finally {
            System.out.println("END");
        }
    }
}
