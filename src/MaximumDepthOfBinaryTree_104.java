/**
 * @author huangzebin
 * @description 递归
 * @createDate: 2021/7/1 14:37
 */
public class MaximumDepthOfBinaryTree_104 {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = maxDepth(root.left) + 1;
        int b = maxDepth(root.right) + 1;
        return a > b ? a : b;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}