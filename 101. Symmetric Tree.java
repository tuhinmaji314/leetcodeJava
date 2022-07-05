/*
101. Symmetric Tree
Easy

9925

242

Add to List

Share
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
 

Follow up: Could you solve it both recursively and iteratively?
*/
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
    public boolean isSymmetric(TreeNode root) {
        if(root ==null)
            return true;
        else
            return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1==null && t2==null){
            return true;
        }else if((t1==null && t2!=null)|| (t1!=null &&t2==null)){
            return false;
        }else if(t1.val!=t2.val){
            return false;
        }
        else{
            return isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
        }
    }
}