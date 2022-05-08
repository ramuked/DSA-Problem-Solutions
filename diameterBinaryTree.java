//solution to the problem https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
class diamterBinaryTree {
    
    int diameter;
    
    int diameter(Node root) {
     
        diameter = 0;
        solve(root);
       
    
        return diameter;
    }
    
    int solve(Node root){
        
        if(root == null)return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        diameter = Math.max(diameter,left + right + 1);
        return Math.max(left,right) + 1;
        
    }
}
