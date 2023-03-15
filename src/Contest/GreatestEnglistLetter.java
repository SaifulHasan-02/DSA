package Contest;

import java.util.Arrays;
//2309
public class GreatestEnglistLetter {
    public static void main(String[] args) {
        String s = "AbCdEfGhIjK";
        System.out.println(greatestLetter(s));
    }
    public static String greatestLetter(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int indLS = 0;
        int n = s.length();

        for (int i = 0; i < arr.length; i++) {
            if (Character.toLowerCase(arr[i]) == arr[i]) {
                indLS = i;
                break;
            }

        }
        String p = "";
        int start = 0;
        System.out.println(arr[indLS]);
        System.out.println(indLS);
        System.out.println(Arrays.toString(arr));
        while (start < indLS) {
            for (int end = indLS; end < n; end++) {
                if (arr[start] == Character.toUpperCase(arr[end])) {
                    p = p + arr[start];
                }
            }

            start++;

        }
        System.out.println(p);
        if(p.length()>0) return p.substring(p.length() - 1);
        return p;


    }
}
