class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null)
            return -1;

        Queue<TreeNode> q = new ArrayDeque<>(); //can use linkedlist imp. as well, 
        //but poll operations are bit faster in Array Deque as it uses arrays and no need of pointers to nodes like linkedlist
        q.add(root);

        int maxRowSum = Integer.MIN_VALUE;
        int rowCt = 1;
        int maxRowCt = 1;
      
        while(!(q.isEmpty())){
            int len = q.size();
            int rowSum = 0;
            for(int i=0;i<len;i++){
                TreeNode curr = q.poll();
                rowSum+=curr.val;

                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(rowSum > maxRowSum){
                maxRowSum = rowSum;
                maxRowCt = rowCt;
            }
            rowCt++;
        }
        return maxRowCt;
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
