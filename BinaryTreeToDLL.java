//https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
class BinaryTreeToDLL
{
    Node prev;
    Node head;
    Node bToDLL(Node root)
    {
	    prev = null;
	    head = null;
	    
	    solve(root);
	    return head;
	
    }
        
    void solve(Node root){
        if(root == null)return;
        
        solve(root.left);
        if(head == null){
            head = root;
        }
        else{
            prev.right = root;
            root.left = prev;
            
        }
        prev = root;
        solve(root.right);
        
    }
}
