package InfosysSampleQuestion;

public class HerosAndVillian {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        int h = 4;
        int[]v = {1,2,3,1,3};
        System.out.println(getMinNoOfVillians(n,m,h,v));

    }
    public static int getMinNoOfVillians(int n,int m, int h, int[]v){

        int i = 0;
        for (; i < v.length; i++) {
            if(h == v[i]){
                n--;
                m--;
            }
            else if(h>v[i]){
                n--;
                h = h-v[i];
            }
            else if(h<v[i]){
                m--;
                if(m <= 0){
                    break;
                }
            }

        }
        if(i == v.length-1) return 0;
        return v.length-i;

    }
}
