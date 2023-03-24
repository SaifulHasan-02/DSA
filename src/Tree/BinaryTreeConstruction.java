package Tree;
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class BinaryTreeConstruction {
    public static void main(String[] args) {
        int[] inOrder = {9,3,15,20,7};
        int[] preOrder = {3,9,20,15,7};
        TreeNode t = new TreeNode();
        TreeNode head = t.bulidTree(inOrder,preOrder);
        t.inOrderTraversal(head);
    }
}
