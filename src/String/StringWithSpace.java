package String;

import java.util.Arrays;

public class StringWithSpace {
    public static void main(String[] args) {
        String str = "I am Here bro";
        System.out.println(Arrays.toString(getArray(str)));
        System.out.println(noOfWords(str));
    }
    private static int noOfWords(String s){
        int noOfSpace = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                noOfSpace++;
        }
        return noOfSpace+1;
    }
    private static char[] getArray(String str) {
        char[] ch = str.toCharArray();
        return ch;
    }
}
