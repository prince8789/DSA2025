/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer, TreeNode> map = new HashMap<>();
        

        HashSet<Integer> children = new HashSet<>();
        

        for (int[] desc : descriptions) {
            int parent = desc[0];
            int child = desc[1];
            int isLeft = desc[2];

            map.putIfAbsent(parent, new TreeNode(parent));
            
 
            map.putIfAbsent(child, new TreeNode(child));


            TreeNode parentNode = map.get(parent);
            TreeNode childNode = map.get(child);


            if (isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }


            children.add(child);
        }


        for (int key : map.keySet()) {
            if (!children.contains(key)) {
                return map.get(key);
            }
        }

        return null;
    }
}