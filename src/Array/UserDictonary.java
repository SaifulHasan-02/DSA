package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDictonary {
    public static void main(String[] args) {
        String[] s = {"cat","batman","latt","matter","cat","matter","cat","Cat","CAT","Latt"};
        System.out.println(getSuggestion(s));
    }
    public static List<String> getSuggestion(String[]s){
        List<String> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : s){
//            str = str.toLowerCase();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.println(map);

        for(Map.Entry<String,Integer>m : map.entrySet()){
            if(m.getValue()>1){
                ans.add(m.getKey());
            }
        }
        return ans;
    }
}
