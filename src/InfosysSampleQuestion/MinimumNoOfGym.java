package InfosysSampleQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinimumNoOfGym {
    public static void main(String[] args) {
        int e = 10;
        int nE = 2;
        int[] energy = {1,2};
        System.out.println(minGym(e,nE,energy));
    }
    public static int minGym(int e,int n,int[] energy){
        Arrays.sort(energy);
        reverse(energy);
        int count = 0;

        for (int i = 0; i < energy.length; i++) {
            if(e>=energy[i]*2){
                count+=2;
                e = e-energy[i]*2;
            }else if(e>= energy[i]) {
                count++;
                e = e-energy[i];
            }
        }
        if(e<=0) return count;
        return -1;
    }
    public static void reverse(int[] energy){
        int start = 0;
        int end = energy.length-1;
        while (start<end){
            int temp = energy[start];
            energy[start] = energy[end];
            energy[end] = temp;
            start++;
            end--;
        }
    }
}
