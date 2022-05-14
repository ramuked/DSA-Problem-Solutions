//solution to the prooblem https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

class BoundaryTraversalBinaryTree
{
	ArrayList <Integer> boundary(Node root)
	{
	    if(root == null)return new ArrayList<>();
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    if(!isLeaf(root)){
	        ans.add(root.data);
	    }
	    addLeftBoundary(root,ans);
	    addLeaves(root,ans);
	    addRightBoundary(root,ans);
	    return ans;
	}
	
    boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }
    
	
	
	void addLeftBoundary(Node root,ArrayList<Integer> ans){
	     
	    Node curr = root.left;
	    while(curr != null){
	        
	        if(!isLeaf(curr)) ans.add(curr.data);
	        else break;
	        
	        if(curr.left!=null) curr = curr.left;
	        else curr = curr.right;
	        
	    }
	}
	
	void addRightBoundary(Node root,ArrayList<Integer> ans){
	  
	        ArrayList<Integer> al = new ArrayList<>();
	        
	        Node curr = root.right;
	        while(curr != null){
	        
	        if(!isLeaf(curr)) al.add(curr.data);
	        else break;
	        
	        if(curr.right!=null) curr = curr.right;
	        else curr = curr.left;
	        
	    }
	    
	    for(int i = al.size()-1;i>=0;i--){
	        ans.add(al.get(i));
	    }
	        
	   
	}
	
	void addLeaves(Node root,ArrayList<Integer> ans){
	    if(root==null)return;
	    
	    addLeaves(root.left,ans);
	    if(isLeaf(root)){
	        ans.add(root.data);
	    }
	    addLeaves(root.right,ans);
	}
	
}
