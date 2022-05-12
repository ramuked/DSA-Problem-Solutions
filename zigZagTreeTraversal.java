//solution to the problem https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1
class zigZagTreeTraversal
{
    ArrayList<Integer> zigZagTraversal(Node root)
	{
	    if(root==null)return new ArrayList<>();
	    Queue<Node> q = new ArrayDeque<>();
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    q.offer(root);
	    int p = 0;
	    while(!q.isEmpty()){
	        ArrayList<Integer> al = new ArrayList<>();
	        
	        for(int i = q.size();i>0;i--){
	            
	            Node curr = q.poll();
	            al.add(curr.data);
	            if(curr.left!=null)q.offer(curr.left);
	            if(curr.right!=null)q.offer(curr.right);
	            
	            
	       
	        }
	        if(p%2==1){
	            Collections.reverse(al);
	        }
	        ans.addAll(al);
	        p++;
	    }
	    
	    return ans;
	    
	}
}
