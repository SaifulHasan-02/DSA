package StackDemo;

//https://leetcode.com/problems/online-stock-span/

import java.util.Stack;

public class StockSpanner {
    Stack<int[]>stock;
    StockSpanner(){
        stock = new Stack<>();
    }

    public int next(int price){
        int count = 1;
        while (!stock.isEmpty() && stock.peek()[0] <= price){
            count += stock.peek()[1];
            stock.pop();
        }
        stock.push(new int[]{price,count});
        return count;
    }
}
