package Array;

public class OneZero {
    public static void main(String[] args) {
        String[] strs = {"10","0001","111001","1","0"};
        System.out.println(findMaxForm(strs,4,3));
    }
    public static int findMaxForm(String[] strs, int m, int n) {

        int ans = 0;

        for(String str : strs){
            char[] e = str.toCharArray();
            int countZero = 0;
            int countOne = 0;
            for(int i =0;i<e.length;i++){
                if(e[i]=='0'){
                    countZero++;
                }else if(e[i] == '1'){
                    countOne++;
                }
            }
            System.out.println(countZero +" "+ countOne);
            if((countZero <= m && countOne <= n)){
                ans++;
            }
        }
        return ans;

    }
}
