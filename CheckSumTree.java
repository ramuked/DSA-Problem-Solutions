lass CheckSumTree
{
    class Sum{
        int sum;
        
    }
	boolean isSumTree(Node root)
	{
	
        return isSumTree(root,new Sum());
	}
	
	boolean isSumTree(Node root,Sum s){
	    if(root == null){
	       
	        return true;
	    }
	    
	    if(root.left == null && root.right == null){
	        
	        s.sum = root.data;
	        return true;
	    }
            
	    Sum leftSum = new Sum(),rightSum = new Sum();
	    
	    boolean left = isSumTree(root.left,leftSum);
	    boolean right = isSumTree(root.right,rightSum);
	    
	    s.sum = leftSum.sum + rightSum.sum + root.data;
	    
	    if(left != right)return false;
	    
	    if(leftSum.sum + rightSum.sum != root.data)return false;
	   
	    
	    return true;
	    
	
	}
}
