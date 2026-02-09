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
    private void inOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null)
            return;
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
    }

    private TreeNode bstBuild(ArrayList<Integer> arr, int l, int r){
        if(l > r)
            return null;
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = bstBuild(arr,l,mid-1);
        root.right = bstBuild(arr,mid+1,r);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);
        int n = arr.size();
        TreeNode res = bstBuild(arr,0,n-1);
        return res;
    }
}
