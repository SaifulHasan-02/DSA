package Tree;
import java.util.*;

public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void insertLeft(int data){
        Node node = new Node(data);
        if(root == null){
            root =  node;
            return;
        }
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        temp.left = node;
    }
    void insertRight(int data){
        Node node = new Node(data);
        if(root == null){
            root =  node;
            return;
        }
        Node temp = root;
        while(temp.right != null){
            temp = temp.right;
        }
        temp.right = node;
    }
    //traversal using recursion
    void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    void inOrderItr(Node root){
        if(root == null){
            return;
        }
        Node temp = root;
        Stack<Node> stk = new Stack<>();
        while(temp != null || stk.size()>0){
            while(temp != null){
                stk.push(temp);
                temp=temp.left;
            }
            temp = stk.pop();
            System.out.print(temp.data+" ");
            temp =temp.right;

        }
    }
    void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }
    //tree traversal using iteration

    void inOrderItr(){
        if(root == null){
            return;
        }
        Stack<Node> stk = new Stack<>();
        Node temp = root;
        while(temp != null || stk.size()>0){
            while(temp != null){
                stk.push(temp);
                temp=temp.left;
            }
            temp = stk.pop();
            System.out.print(temp.data+" ");
            temp = temp.right;

        }
    }
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            list.add(null);
            return list;
        }
        Node temp = root;
        Stack<Node> stk = new Stack<>();
        while(temp != null || stk.size()>0){
            while(temp != null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            list.add(temp.data);

            temp = temp.right;
        }
        return list;

    }
    //Iteration Preorder traversal using stack
    /*
    public void preOrderItr(Node root){
        if(root == null){
            return;
        }
        Node temp = root;
        Stack<Node> stk = new Stack<>();
        stk.push(temp);
        while(!stk.empty()){
            temp = stk.pop();
            System.out.println(temp.data+" ");

            if(temp.right != null){
                stk.push(temp);
            }
            if(temp.left != null){
                stk.push(temp);
            }

        }
    }
     */
    public void preOrderItr(Node root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return ;
        }
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            root = stk.pop();
            list.add(root.data);
            if(root.right != null){
                stk.push(root.right);
            }
            if(root.left != null){
                stk.push(root.left);
            }
        }
        System.out.println(list);
    }
    public List<Integer> preOrderItrSelf(Node root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while (stk.size()>0){
            root = stk.pop();
            list.add(root.data);
            if(root.right != null){
                stk.push(root.right);
            }
            if(root.left != null){
                stk.push(root.left);
            }
        }
        return list;
    }
    public List<Integer> inOrderItrSelf(Node root){
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Node temp = root;
        Stack<Node> stk = new Stack<>();
        while (temp != null || stk.size()>0){
            while (temp != null){
                stk.push(temp);
                temp = temp.left;
            }
            temp = stk.pop();
            list.add(temp.data);
            temp = temp.right;
        }
        return list;
    }
    public int getKSmallestElement(Node root, int k){
        ArrayList<Integer>ans = inOrder3(root);
        return (int)ans.get(k-1);
    }
    public ArrayList<Integer> inOrder3(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node>stk = new Stack<>();


        while (root != null || !stk.isEmpty()){
            while (root != null){
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            list.add(root.data);
            root = root.right;

        }
        return list;
    }
    public void postOrderRec(Node root){
        if(root == null){
            return;
        }
        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.print(root.data+" ");
    }
    public List<Integer> postOrderItrSelf(Node root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node> stk1 = new Stack<>();
        Stack<Node> stk2 = new Stack<>();
        stk1.push(root);
        while(stk1.size()>0){
            root = stk1.pop();
            stk2.push(root);
            if(root.left != null){
                stk1.push(root.left);
            }
            if(root.right != null){
                stk1.push(root.right);
            }
        }
        while (stk2.size()>0){
            list.add(stk2.pop().data);
        }
        return list;

    }
    //Maximum Dept of tree
    public int maxDept(Node root){
        if(root == null)
            return 0;
        int left = maxDept(root.left);
        int right = maxDept(root.right);
        return 1+(int)Math.max(left,right);
    }
    //minimum dept of tree:Shortest path between root and leaf
    /*Algo
    1.if root.left and root.right both null it means leaf node is there so return 1
    2.if root.left is null then return 1+root.right;
    3.if root.right is null then return 1+root.left;
    4.If both left and right are not null then we have to return 1+min(root.left,root.right);
     */
    public int minDepth(Node root){
        if(root == null)
            return 0;
        //leaf node is there
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null){
            return 1+minDepth(root.right);
        }
        if(root.right == null){
            return 1+minDepth(root.left);
        }
        return 1+(int)Math.min(minDepth(root.left),minDepth(root.right));
    }
    //check tree is balanced or not
    public boolean isBalanced(Node root){
        if(root == null){
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(Math.abs(left-right)>1){
            return false;
        }
        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);
        if(l && r){
            return true;
        }
        return false;
    }
    public int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        return 1+(int)Math.max(l,r);
    }
    //Diameter of a tree:  number of nodes on the longest path between two end nodes.
    /*
    public int diameter(Node root,int max){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        max = Math.max(max,left+right);
        return 1+(int)Math.max(left,right);
    }
     */
    public void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.data);
            if(temp.left != null)
                queue.offer(temp.left);
            if(temp.right != null)
                queue.offer(temp.right);
        }
    }
    //search node in tree using level order traversal
    public  boolean searchInBT(Node root,int target){
        if(root == null){
            return false;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if(root.data == target){
                return true;
            }
            if(root.left != null){
                queue.offer(root.left);
            }if(root.right != null){
                queue.offer(root.right);
            }
        }
        return false;
    }
    //Insert node in tree using level Order Traversal
    //T(n) = O(n),S(n) = O(n)
    public void insertNode(Node root,int x){
        if(root == null){
            root = new Node(x);
            return;
        }

        Queue<Node> queue = new LinkedList<>();


                queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if(root.left != null){
                queue.offer(root.left);
            }
            if(root.left == null){
                root.left = new Node(x);
                break;
            }
            if(root.right != null){
                queue.offer(root.right);
            }
            if(root.right == null){
                root.right = new Node(x);
                break;
            }
        }
    }
    public ArrayList<Integer> inOrder4(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Stack<Node> stk = new Stack<>();
        while (!stk.isEmpty() || root != null){
            while (root != null){
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            ans.add(root.data);
            root = root.right;

        }
        return ans;
    }
    public int countNode(Node root){
        if(root == null)
            return 0;
        Stack<Node>stk = new Stack<>();
        int count = 0;
        while (true){
            if(root != null) {
                stk.push(root);
                root = root.left;
            }else{
                if(stk.isEmpty()){
                    break;
                }
                root = stk.pop();
                count++;
                root = root.right;
            }
        }
        return count;
    }

    //something error
    /*
    public void deleteNode(Node root,int x){
        if(root == null){
            return;
        }
        else if(root.data == x){
            Node dummy = root;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            Node temp = null;
            while (!queue.isEmpty()){
                root = queue.poll();

                if(root.left != null){
                    queue.offer(root.left);
                }
                if(root.left == null){
                    temp = root;
                    dummy.data = temp.data;
                    root = null;

                }
                if(root.right != null){
                    queue.offer(root.right);
                }
                if(root.right == null){
                    temp = root;
                    dummy.data = temp.data;
                    root = null;
                    break;
                }
            }



        }


    }

     */
}
