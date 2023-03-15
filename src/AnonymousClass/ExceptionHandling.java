package AnonymousClass;

public class ExceptionHandling {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int c = a/b;
            System.out.println("Try Block is running");

        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
//        finally {
//            System.out.println("END");
//        }
        System.out.println("END");

    }
}
