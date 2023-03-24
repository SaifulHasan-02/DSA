package String;

import java.util.HashSet;

//https://leetcode.com/problems/unique-morse-code-words
public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[]words  = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] decode = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....",
                "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for (String s:words) {
//            StringBuilder sb = new StringBuilder();
              String str = "";
            for (int i = 0; i < s.length(); i++) {
//                sb.append(decode[s.charAt(i)-'a']);
                str = str+ decode[s.charAt(i)-'a'];
            }
//            set.add(sb.toString());
            set.add(str);
        }
        System.out.println(set);
        return set.size();
    }
}
