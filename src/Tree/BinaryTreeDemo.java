package Tree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertLeft(50);
        tree.insertLeft(30);
        tree.insertRight(60);
        tree.insertLeft(80);
        System.out.println(tree.inOrder4(tree.root));
        System.out.println(tree.countNode(tree.root));
        //tree.insertRight(5);
        //tree.insertLeft(30);
        //tree.inOrder(tree.root);
        System.out.println();
        tree.inOrderItr(tree.root);
        System.out.println();
       tree.preOrder(tree.root);
        System.out.println();
        //tree.postOrder(tree.root);
        System.out.println();
        //tree.inOrderItr();
       // System.out.println(tree.inorderTraversal(tree.root));
        /*
        tree.preOrderItr(tree.root);
        System.out.println(tree.preOrderItrSelf(tree.root));
        System.out.println(tree.inOrderItrSelf(tree.root));
        System.out.println(tree.postOrderItrSelf(tree.root));
        tree.postOrderRec(tree.root);

         */
        System.out.println(tree.maxDept(tree.root));
        System.out.println(tree.minDepth(tree.root));
        System.out.println(tree.isBalanced(tree.root));
        //System.out.println(tree.diameter(tree.root,0));
        tree.levelOrderTraversal(tree.root);
        System.out.println(tree.searchInBT(tree.root,80));
        tree.insertNode(tree.root,1000);

        //tree.deleteNode(tree.root,50);
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrderItr();
        System.out.println();
        System.out.println(tree.getKSmallestElement(tree.root,3));
    }
}
