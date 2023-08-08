package Binary_Tree;
import java.util.ArrayList;

public class Binary_Tree_Inorder_Traversal {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root;
    int[] array = { 1, 2, 3, 4, 5 };
    int indx = -1;

    public TreeNode createTree(int[] arr, int i) {
        if (i >= arr.length)
            return null;

        TreeNode root = new TreeNode(arr[i]);

        root.left = createTree(arr, 2 * i + 1);
        root.right = createTree(arr, 2 * i + 2);

        return root;
    }
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return list;

        inorderTraversal(root.left);
        list.add(root.data);
        inorderTraversal(root.right);
        return list;
    }

    public static void main(String[] args) {
        Binary_Tree_Inorder_Traversal test1 = new Binary_Tree_Inorder_Traversal();
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int idx = 0;
        TreeNode root = test1.createTree(array, idx);
        System.out.println(test1.inorderTraversal(root));
    }
}
