package String;

import java.util.*;

public class FrequencyOfVowels {
    public static void main(String[] args) {
        String str = "Good Morning All";
        countVowels(str);
    }
    public static void countVowels(String s){
        s = s.toLowerCase();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5,23);

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }

        if(map.isEmpty()){
            System.out.println("No Vowels found");
        }

        else{
            int count = 0;
            for(Map.Entry<Character,Integer> m : map.entrySet()){
                String  ans = "'"+m.getKey()+"'"+":"+m.getValue();
                if(count == map.size()-1)
                    System.out.print(ans);
                else {
                    System.out.print(ans+",");
                }
                count++;
            }

        }
    }

}
