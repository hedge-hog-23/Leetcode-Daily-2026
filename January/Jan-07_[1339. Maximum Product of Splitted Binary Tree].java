class Solution {
    long total = 0;
    long max = 0;
    long sum = 0;
    static final int MOD = 1_000_000_007;

    public long findSum(TreeNode node){
        //for finding total sum, can return node.val + find(node.left)+find(node.right) as well

        if(node == null)
            return 0;

        sum +=node.val;
        findSum(node.left);
        findSum(node.right);

        return sum;
    }

    public long dfs(TreeNode node){
        if(node == null)
            return 0;

        long sum = node.val + dfs(node.left) + dfs(node.right); //sum of each subtree
        max = Math.max(max,sum*(total-sum));
        //logic -> prod of subtrees = total_sum * (subtree_sum - total_sum)
        return sum;
    }
    public int maxProduct(TreeNode root) {
        total = findSum(root); //find total sum = 21 in 1st case
        dfs(root);  //traverse entire subtrees
        return (int)(max % MOD); //to overcome overflow issues
    }
}

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
