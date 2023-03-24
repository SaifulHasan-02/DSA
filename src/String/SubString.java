package String;
//https://leetcode.com/problems/counting-words-with-a-given-prefix/
public class SubString {
    public static void main(String[] args) {
        /*
        String str = "Saiful";
        System.out.println(str.substring(0,2));
        String[] s = {"Saiful","Hasan"};
        System.out.println(s[1].substring(0,2));
        String re = "Sa";
        if(s[0].substring(0,2).equals(re)){
            System.out.println(true);
        }else
            System.out.println(false);

         */
        int[][] arr = {{1,2,3},{2,3},{4,5,6,7}};


        print(arr);
    }
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int prefixCount(String[] words, String pref) { //From others
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
    public int prefixCount2(String[] words, String pref) {  //ME
        int count = 0;
        for(int i =0;i<words.length;i++){
            if(words[i].length()>=pref.length()){
                if(words[i].substring(0,pref.length()).equals(pref)){
                    count++;
                }
            }
        }
        return count;

    }
}
