package Binary_Tree;
import java.util.Scanner;

public class Maximum_Depth_of_Binary_Tree {
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

    public static void inOrder(TreeNode root) {
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        int lHight = maxDepth(root.left);
        int rHight = maxDepth(root.right);

        return 1 + Math.max(lHight,rHight);
    }

    public static void main(String[] args) {
        Maximum_Depth_of_Binary_Tree test1 = new Maximum_Depth_of_Binary_Tree();
        TreeNode root = test1.createTree(); 
        inOrder(root);

        System.out.println("  ");
        System.out.println("Max Depth : " + test1.maxDepth(root));
        
    }
}
