package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "saiful";
        String b = "h";
        String c = a;
        System.out.println(a.equals(b));
        System.out.println(c==a);
        System.out.println(c==b);
        System.out.println();
        String s1 = new String("Hasan");
        String s2 = new String("Hasan");
        System.out.println(s1 ==s2);
        System.out.println(s1.equals(s2));
    }
}
