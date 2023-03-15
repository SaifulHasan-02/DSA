package String;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a", "bc"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
        System.out.println(arrayStringsAreEqual2(word1,word2));

    }
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2){
        String s1 = "",s2 = "";

        for(String s : word1){
            s1 = s1 + s;
        }

        for(String s : word2){
            s2 = s2 + s;
        }

        return s1.equals(s2);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String s1 = String.join("",word1);
        String s2 = String.join("",word2);

        return s1.equals(s2);
    }
}
