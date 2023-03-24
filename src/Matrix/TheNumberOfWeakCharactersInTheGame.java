package Matrix;
//https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/

import java.util.Arrays;

public class TheNumberOfWeakCharactersInTheGame {
    public static void main(String[] args) {
        int[][]properties = {{5,5},{6,3}, {3,6}};

        System.out.println(numberOfWeakCharacters(properties));
        System.out.println(numberOfWeakCharacters2(properties));
    }
    public static int numberOfWeakCharacters2(int[][] properties){
        int n = properties.length,count=0;

        Arrays.sort(properties,(a,b)->(a[0] == b[0])?b[1]-a[1]:a[0]-b[0]);
        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >=0 ; i--) {
            if(properties[i][1]<max )
                count++;

            max = Math.max(max,properties[i][1]);
        }
        return count;

    }
    public static int numberOfWeakCharacters(int[][] properties){
        int count = 0;
        Arrays.sort(properties,(a, b)-> (a[0] == b[0]) ? a[1]-b[1]:b[0]-a[0]);


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < properties.length; i++) {
            if(max > properties[i][1]){
                count++;
            }
            max = Math.max(max,properties[i][1]);
        }
        return count;
    }
}
