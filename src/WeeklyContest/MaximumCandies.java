package WeeklyContest;

public class MaximumCandies {
    public static void main(String[] args) {
        int[] candies = {5,8,6};
        int k = 3;
        System.out.println(getMaxCandiesToChildren(candies,k));
    }
    public static int getMaxCandiesToChildren(int[] candies,int k){
       int min = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]<min){
                min = candies[i];
            }
        }
        return 0;

    }
}
