// solution to the problem https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
class DistanceBetweenNodesBT{
    
    int findDist(Node root, int a, int b) {
       
        
        Node lca  = findLca(root, a,b);
      
        int d1 = depth(lca, 0, a);
        int d2 = depth(lca, 0, b);
       
        return d1 + d2;
    
  
        
    }
    Node findLca(Node root,int a, int b){
        
        if(root == null){
            
            return root;
        }
        
        if(root.data == a){
            
           
            return root;
        }
        
        if(root.data == b){
         
            return root;
        }
        
        Node leftLca = findLca(root.left,a,b);
        Node rightLca = findLca(root.right,a,b);
        
        if(leftLca != null && rightLca != null){
            
         
            return root;
        }
        
        return (leftLca != null)?leftLca: rightLca;
        
    }
    
    int depth(Node root, int d, int val){
        
        if(root == null){
            
            return -1;
        }
        
        if(root.data == val){
            return d;
        }
        
        int l = depth(root.left, d+1, val);
        return (l!=-1)?l : depth(root.right, d+1, val);
    }
}
