import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution solution = new Solution();
        System.out.println("preoder"+ solution.preorderTraversal(root));
        System.out.println("postorder"+solution.postorderTraversal(root));
        System.out.println("inorder"+solution.inorderTraversal(root));
    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        pretraversal(root, result);
        return result;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postTraversal(root, result);
        return result;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    public void pretraversal(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        pretraversal(root.left, result);
        pretraversal(root.right, result);
    }
    public void postTraversal(TreeNode root, List<Integer> result) {
        if (root == null) return;
        pretraversal(root.left, result);
        pretraversal(root.right, result);
        result.add(root.val);
    }
    public void inOrderTraversal(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inOrderTraversal(root.left, result);
        result.add(root.val);
        inOrderTraversal(root.right, result);
    }
}
