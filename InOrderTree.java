package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 04/03/17.
 */

public class InOrderTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls= new ArrayList<>();
        if (root == null) {
            return ls;
        }

        //keep the nodes in the path that are waiting to be visited
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        // traverse the tree
        while (stack.size() > 0) {

            // visit the top node
            node = stack.pop();
            ls.add(new Integer(node.val)) ;
            if (node.right != null) {
                node = node.right;

                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        return ls;

    }

    public static void main(String[] args){
        InOrderTree in = new InOrderTree();
        TreeNode root = new TreeNode(8);
        root.left= new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left= new TreeNode(6);
        root.left.right= new TreeNode(4);
        root.right.left = new TreeNode(18);
        root.right.left = new TreeNode(20);

        in.inorderTraversal(root);

    }
}
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }