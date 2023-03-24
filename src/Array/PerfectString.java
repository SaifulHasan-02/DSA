package Array;

import java.util.Scanner;

public class PerfectString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {

            int n = sc.nextInt();
            String str = sc.next();
            System.out.println(Perfect(n, str));
            t--;
        }

    }
    public static int Perfect(int n,String str){

        char[] ch = str.toCharArray();
        int ind = 0;
        for (;ind<n;ind++){
            if(ch[ind]=='1'){
                break;
            }
        }
        int count = 0;
        for (;ind<n;ind++){
            if(ch[ind]=='0')
                count++;
        }
        return count;
    }
}
