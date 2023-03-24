package String;

public class ReverseUsingStrBuilder {
    public static void main(String[] args) {
        String str = "Saiful";
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        System.out.println(strBuilder);
        String str2 = new String(strBuilder);
        System.out.println(str2);

    }
}
