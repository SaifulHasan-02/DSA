package GreedyAlgorithm;
//https://leetcode.com/problems/furthest-building-you-can-reach/
import QueueDS.PriorityQueueDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int[] heights = {4,12,2,7,3,18,20,3,19};
        int bricks = 10,ladders = 2;
        System.out.println(furthestBuilding(heights,bricks,ladders));
        System.out.println(furthestBuilding2(heights,bricks,ladders));
    }
    public static int furthestBuilding2(int[] heights,int bricks,int ladders){
        ArrayList<Integer> list = new ArrayList<>();
        int n = heights.length;
        for (int i = 0; i < n-1; i++) {
            if(heights[i+1]<heights[i]) continue;

            list.add(heights[i+1]-heights[i]);
            bricks= bricks-(heights[i+1]-heights[i]);

            if(bricks<0){
                bricks = bricks+(getMax(list));
                if(ladders>0){
                    ladders = ladders-1;
                }else {
                    return i;
                }
            }
        }
        return n-1;
    }
    public static int getMax(ArrayList<Integer> list){
        int max = 0;
        for (Integer e:list) {
            if(e>max){
                max = e;
            }
        }
        return max;
    }
    public static int furthestBuilding(int[] heights,int bricks,int ladders){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = heights.length;
        for (int i = 0; i < n-1; i++) {
            if(heights[i]>=heights[i+1])
                continue;
            bricks = bricks-(heights[i+1]-heights[i]);
            pq.offer(heights[i+1]-heights[i]);
            if(bricks<0){
                bricks = bricks +(int)pq.poll();
                if(ladders>0){
                    ladders = ladders-1;
                }else{
                    return i;
                }
            }
        }
        return n-1;
    }
}
