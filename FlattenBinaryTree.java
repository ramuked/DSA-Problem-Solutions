//solution to the problem https://leetcode.com/problems/flatten-binary-tree-to-linked-list/submissions/
class FlattenBinaryTree {
    TreeNode prev;
    public void flatten(TreeNode root) {
        prev = null;
        if(root==null)return ;
        solve(root);
    }
    
    void solve(TreeNode root){
        
        if(root == null)return;
        
        solve(root.right);
        solve(root.left);
        
        root.right = prev;
        root.left = null;
        
        prev = root;
        
    }
}
