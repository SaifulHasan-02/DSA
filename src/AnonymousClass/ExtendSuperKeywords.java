package AnonymousClass;

public class ExtendSuperKeywords extends SuperKeywords{
    ExtendSuperKeywords(){
        super();
        System.out.println("sub class");
    }
    void dog(){
        super.animal();
        System.out.println("This is dog class");
    }
}
