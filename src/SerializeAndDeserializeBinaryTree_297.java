import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree_297 {

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree_297 entity = new SerializeAndDeserializeBinaryTree_297();
        TreeNode node = entity.deserialize("[1,2,3,null,null,4,5]");
        System.out.println(entity.serialize(node));
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        StringBuilder res = new StringBuilder();
        res.append("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null) {
                res.append(cur.val).append(",");
                queue.offer(cur.left);
                queue.offer(cur.right);
            } else {
                res.append("null").append(",");
            }
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if ("[]".equals(data)) {
            return null;
        }
        String[] array = data.substring(1, data.length() - 1).split(",");
        TreeNode res = new TreeNode(Integer.parseInt(array[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(res);
        int i = 1;
        int arrayLen = array.length;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (i >= arrayLen) {
                break;
            }
            if (!"null".equals(array[i])) {
                cur.left = new TreeNode(Integer.parseInt(array[i]));
                queue.offer(cur.left);
            }
            ++i;
            if (i >= arrayLen) {
                break;
            }
            if (!"null".equals(array[i])) {
                cur.right = new TreeNode(Integer.parseInt(array[i]));
                queue.offer(cur.right);
            }
            ++i;
        }
        return res;
    }
    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}