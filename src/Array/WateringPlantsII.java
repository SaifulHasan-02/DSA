package Array;

//https://leetcode.com/problems/watering-plants-ii/

public class WateringPlantsII {
    public static void main(String[] args) {
        int[] plants = {2,2,3,3};
        int capacityA = 5,capacityB = 5;
        System.out.println(minimumRefill(plants,capacityA,capacityA));
    }
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int refill = 0,s =0,e = plants.length-1;
        int initCapA = capacityA,initCapB = capacityB;

        while (s<=e){
            if (s== e) {
                if(capacityA>=capacityB)
                    capacityA=capacityA-plants[s];

                else
                    capacityB = capacityB-plants[s];
                s++;
                e--;
            }
            if(capacityA>=plants[s]){
                capacityA = capacityA - plants[s];
                s++;
            }
            if(capacityB>=plants[e]){
                capacityB = capacityB - plants[e];
                e--;
            }


            else if(capacityA<plants[s]){
                capacityA = initCapA;
                refill += 1;

            }
            else if(capacityB< plants[e]){
                capacityA = initCapB;
                refill += 1;
            }

        }
        return refill;
    }
}
