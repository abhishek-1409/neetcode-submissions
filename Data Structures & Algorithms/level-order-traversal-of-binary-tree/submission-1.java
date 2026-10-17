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
    public void dfs(List<List<Integer>> list, TreeNode node, int depth){
        if(node == null)
            return;
        
        if(list.size() == depth)
            list.add(new ArrayList<>());
        list.get(depth).add(node.val);
        dfs(list, node.left, depth+1);
        dfs(list, node.right, depth+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans,root,0);
        return ans;
    }
}
