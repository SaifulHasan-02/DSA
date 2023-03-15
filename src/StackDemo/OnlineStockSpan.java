package StackDemo;

//https://leetcode.com/problems/online-stock-span/

public class OnlineStockSpan {
    public static void main(String[] args) {
        StockSpanner obj1 = new StockSpanner();
        System.out.println(obj1.next(100));
        System.out.println(obj1.next(80));
        System.out.println(obj1.next(60));
        System.out.println(obj1.next(70));
        System.out.println(obj1.next(60));
        System.out.println(obj1.next(75));
        System.out.println(obj1.next(85));
    }
}
