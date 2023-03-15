package String;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack= "aaa";
        String needle = "a";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();

        char[] need = needle.toCharArray();
        char[] hy = haystack.toCharArray();

        return -1;

    }
}
