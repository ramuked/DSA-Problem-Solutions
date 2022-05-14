// solution to the problem https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1
class TransformToSumTree{
    
    public void toSumTree(Node root){
         //add code here.
        if(root == null)return;
         
        sum(root);
        
         
    }
    
    public int sum(Node root){
        
        
        if(root == null)return 0;

        int l = sum(root.left);
        int r = sum(root.right);
        int temp = root.data;
        root.data = l + r;
       
        return root.data + temp;
        
    }
    
    
    
}
