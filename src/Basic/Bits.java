package Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Bits {
    public static void main(String[] args) {
        int start = 10;
        int goal = 82;
        System.out.println(minBitFlips(start,goal));

    }
    public static int minBitFlips(int start, int goal) {
        int min = Math.min(start,goal);
        int n = (int)(Math.log(min)/Math.log(2)+1);
        System.out.println(n);
        Object[] bin = binary(start);
        System.out.println(Arrays.toString(bin));
        System.out.println("--------------------------");
        Object[] target = binary(goal);
        System.out.println(Arrays.toString(target));

        int count = 0;
        int ti = target.length-1;
        int bi = bin.length-1;
        while(ti >= 0 && bi >= 0){
            if(target[ti] != bin[bi]){
                count++;
            }
            ti--;
            bi--;
        }
        int left = Math.max(ti,bi);
        int countleft = 0;
        if(ti>bi){
            for (int i = 0; i <= ti; i++) {
                if(target[ti] == (Object)1){
                    countleft++;
                }
            }
        }else{
            for (int i = 0; i <= bi; i++) {
                if(bin[i] == (Object)1){
                    countleft++;
                }
            }

        }
        return count+countleft;

    }
    public static Object[] binary(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 0){
            list.add(n%2);
            n /= 2;
        }
        Object[] arr = list.toArray();
        reverseArray(arr);
        return arr;
    }
    public static void reverseArray(Object[] arr){
        int start = 0;
        int end = arr.length-1;
        //System.out.println("Reverse Array");
        while(start < end) {
            Object t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}
