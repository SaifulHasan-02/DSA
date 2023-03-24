package String;

public class NoOfWords {
    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println(countWords(arr));
    }

    private static int countWords(String[] sentences) {
        int max = 0;
        for(int i =0;i<sentences.length;i++){
            int count = 0;
            char[] temp = sentences[i].toCharArray();
            for(int j =0;j<temp.length;j++){
                if(temp[j] == ' ' && temp[j+1]  != ' '){
                    count++;
                }
            }
            if(count>max){
                max = count;
            }
        }
        return max+1;
    }
}
