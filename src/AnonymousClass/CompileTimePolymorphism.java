package AnonymousClass;

public class CompileTimePolymorphism {
    int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a, double b){
        return a*b;
    }
    int area(int a, int b){
        return a+b;
    }
    int area(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        System.out.println(obj.multiply(5,2));
        System.out.println(obj.multiply(5.5,6.3));
    }
}
