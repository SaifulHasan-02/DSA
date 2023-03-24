package LeetCode;

public class KthLargestDemo {
    public static void main(String[] args) {
        int[] nums= {4, 5, 8, 2};
        KthLargest obj = new KthLargest(3,nums);
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }
}
