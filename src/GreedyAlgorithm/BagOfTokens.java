package GreedyAlgorithm;

import java.util.Arrays;

//https://leetcode.com/problems/bag-of-tokens/
public class BagOfTokens {
    public static void main(String[] args) {
        int[] tokens = {100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens,power));
    }
    public static int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        if(n==0){
            return n;
        }
        Arrays.sort(tokens);
        int score = 0;
        int s = 0, e = n-1;
        int maxScore = 0;
        while (s<=e){

            if(power >= tokens[s]){
                power= power- tokens[s];
                score += 1;
                s++;
                if(score>maxScore){
                    maxScore = score;
                }
            }
            else if(score>=1){
                power = power + tokens[e];
                score -= 1;
                e--;
            }
            else {
                break;
            }
        }
        return maxScore;

    }
}
