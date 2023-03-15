package Array;
//https://leetcode.com/problems/watering-plants/
public class WateringPlants {
    public static void main(String[] args) {
        int[] plants = {2,2,3,3};
        int capacity = 5;
        System.out.println(wateringPlants(plants,capacity));
    }
    public static int wateringPlants(int[] plants, int capacity) {
        int initCap = capacity;
        int steps = 0,i = 0,n = plants.length;
        while (i<n){
            if(capacity >= plants[i]){
                capacity = capacity-plants[i];
                steps = steps + 1;
                i++;

            }
            else{
                steps = steps+i;
                capacity = initCap;
                steps = steps+i;

            }

        }
        return steps;

    }
}
