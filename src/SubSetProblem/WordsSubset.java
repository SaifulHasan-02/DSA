package SubSetProblem;
//https://leetcode.com/problems/word-subsets/
import java.util.*;
public class WordsSubset {
    public static void main(String[] args) {
        String[] words1 ={"amazon","apple","facebook","google","leetcode"};
        String[] words2 ={"e","o"};
        System.out.println(wordSubsets(words1,words2));

    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        for(String p : words1){
            getSubSet(p,words2,"",ans, p);
        }
        return ans;

    }
    public static void getSubSet(String p,String[] words2,String up,List<String>ans,String org){
        if(p.length() == 0){
            ans.add(org);
            return;
        }

        char c = p.charAt(0);
        getSubSet(p.substring(1),words2,up+c,ans,org);
        getSubSet(p.substring(1),words2,up,ans,org);
    }
}

