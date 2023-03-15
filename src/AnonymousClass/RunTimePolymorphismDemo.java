package AnonymousClass;

public class RunTimePolymorphismDemo {
    public static void main(String[] args) {

        //Normal
        RunTimePolymorphism obj = new RunTimePolymorphism();
        obj.method();

        //run time polymorphism
        RunTimePolymorphism obj1 = new Run();
        obj1.method();

        //Normal
        Run obj2 = new Run();
        obj2.method();
    }
}
