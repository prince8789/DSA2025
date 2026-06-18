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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        if(root == null) return l1;
        traverse(root,l1,0);
        return l1;

        
    }
    public void traverse(TreeNode root, List<Integer> l1,int level){
        if(root == null) return;
        if(level>=l1.size()){
            l1.add(root.val);
        }
        else{
            l1.set(level,root.val);
        }
        traverse(root.left,l1,level+1);
        traverse(root.right,l1,level+1);
    }
}