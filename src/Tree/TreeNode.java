package Tree;

public class TreeNode {
    static int ind = 0;
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left ,TreeNode right){
        this.val = val;
        this.right = null;
        this.left = null;
    }

    public TreeNode bulidTree(int[]inOder,int[] preOrder){
        return buildTreeRec(inOder,preOrder,0,inOder.length-1);


    }
    public TreeNode buildTreeRec(int[] inOder,int[] preOrder,int startIn,int endIn){
        TreeNode root = new TreeNode(preOrder[ind]++);
        int inInd = getInd(inOder,0,inOder.length-1,root.val);

        if(inInd == 0)
            return root;


        root.left = buildTreeRec(inOder,preOrder,startIn+1,inInd-1);
        root.right = buildTreeRec(inOder,preOrder,inInd+1,inOder.length-1);
        return root;
    }
    public int getInd(int[]inOrder,int s,int e,int target){
        int i = s;
        for (;i<=e;i++){
            if(inOrder[i] == target){
                break;
            }
        }
        return i;
    }
    public void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }

}
