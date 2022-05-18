// https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1
class CheckLeavesAtSameLevel
{
    int depth;
    boolean check(Node root)
    {	
	    depth = 0;
	    
	    return check(root,0);
	    
    }
    boolean check(Node root,int d){
        
        if(root == null)return true;
        
        if(root.left == null && root.right == null){
            
            if(depth == 0){
                depth = d;
                return true;
            }
            return depth == d;
        }
        
        return check(root.left,d+1)&&check(root.right,d+1);
    }
}
