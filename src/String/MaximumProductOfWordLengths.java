package String;

public class MaximumProductOfWordLengths {
    public static void main(String[] args) {
        String[] words ={"a","ab","abc","d","cd","bcd","abcd"};
        System.out.println(maxProduct(words));

    }
    public  static int maxProduct(String[] words) {
        int maxLength = 0;
        int flag = 0;
        int k =0;
        int n = words.length;
        int i =0;
        while (i < n-1 || k < words.length-2 ) {
            char[] str1 = words[k].toCharArray();
            char[] str2 = words[i+1].toCharArray();
            for (int j = 0; j < Math.min(str1.length,str2.length); j++) {
                if(str1[j] == str2[j]){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0) {
                int currLen = str1.length * str2.length;
                if (currLen > maxLength) {
                    maxLength = currLen;
                }
            }

            if(i == words.length-2){
                k++;
                i = k+1;
            }
            i++;

        }
        return maxLength;

    }
}
