package String;
//https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/description/
import java.util.Set;

public class CountTheNumberOfVowelStringsInRange {
    public static void main(String[] args) {
        String[] words = {"are","amy","u"};
        int left = 0, right = 2;
        System.out.println(vowelStrings(words, left, right));
    }
    public static int vowelStrings(String[] words, int left, int right){
        int cnt = 0;
        Set<Character> set = Set.of('a','e','i','o','u');
        for (int i = left; i <= right; i++) {
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1))) {
                cnt++;
            }
        }
        return cnt;
    }
}
