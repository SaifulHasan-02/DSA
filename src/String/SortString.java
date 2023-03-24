package String;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "dcba";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

    }
}
