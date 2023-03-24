package Array;

public class MinLengthOfWire {
    public static void main(String[] args) {
        int[] state = {1,0,0};
        int[] distance = {1,5,6};
        System.out.println(getMinLen(state.length,state,distance.length,distance));
    }
    public static int getMinLen(int n,int[] state,int m,int[]distance){
        int ans = 0;

        for (int i = 1; i < n; i++) {
            if(state[i] == 0 && state[i-1] == 1){
                ans += (distance[i] - distance[i-1]);
                state[i] = 1;
            }
        }
        return ans;
    }
}
