package Array;

public class LcmAndHcf {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println(lcm(a,b));
        System.out.println(lcm2(a,b));
        System.out.println(hcf(a,b));
        System.out.println(hcf2(a,b));
    }
    //a * b = lcm * hcf
    public static int lcm(int a,int b){

        for(int l = a>b?a:b;l<=(a*b);l = l+(a>b?a:b)){
            if((l % a == 0) && (l % b == 0))
                return l;
        }
        return -1;
    }
    public static int lcm2(int a,int b){
        return a*b/hcf(a,b);
    }
    public static int hcf(int a,int b){
        if(a == 0) return b;

        if(b == 0) return a;

        if(a > b){
            return hcf(a%b,b);
        }
        return hcf(b%a,a);
    }
    public static int hcf2(int a,int b){
        return a*b/lcm(a,b);
    }

}
