package Binary_Tree;

import java.util.Scanner;

public class Symmetric_tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    Scanner ss = new Scanner(System.in);

    public TreeNode createTree() {
        System.out.println("enter the data : ");
        int data = ss.nextInt();

        if(data == -1)
            return null;

        TreeNode root = new TreeNode(data);

        System.out.println("Enter the left data for : " + data);
        root.left = createTree();

        System.out.println("Enter the right data for : " + data);
        root.right = createTree();

        return root;
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        return mirrorTest(root.left,root.right);
    }

    public static boolean mirrorTest(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode == null || rightNode == null)    
            return leftNode == rightNode;            

        /*
         * Simpler version of the above 2 lines 
         * 
         * if (leftNode == null && rightNode == null)
         *     return true;
         * else if(leftNode == null || rightNode == null)
         *     return false;
         */

        if(leftNode.val != rightNode.val)
            return false;

        return mirrorTest(leftNode.left,rightNode.right) && mirrorTest(leftNode.right,rightNode.left) ;
    }

    public static void inOrder(TreeNode root) {
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Symmetric_tree test1 = new Symmetric_tree();

        TreeNode root = test1.createTree(); 
        inOrder(root);

        System.out.println();

        System.out.println("Symmetric : " + isSymmetric(root));
    }
    
}
