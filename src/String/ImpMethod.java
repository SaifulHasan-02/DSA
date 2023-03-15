package String;
import java.sql.SQLOutput;
import java.util.Arrays;
public class ImpMethod {
    public static void main(String[] args) {
        String str = "Hello I am here bro !!!";
        System.out.println('a' + 'b');//addition of ascii value
        System.out.println("a" + 1);
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('I'));
        System.out.println("     Hello".strip());
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
