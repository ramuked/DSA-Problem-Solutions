//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
class BinaryTreeLeftView
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<>();
      if(root == null)return ans;
      Queue<Node> q = new ArrayDeque<>();
      
      q.offer(root);
      while(!q.isEmpty()){
          
        int s = q.size();
        
        for(int i = 0; i < s; i++){
            
            Node curr = q.poll();
            if(i == 0)ans.add(curr.data);
            
            if(curr.left != null){
                
                q.offer(curr.left);
            }
            
            if(curr.right != null){
                q.offer(curr.right);
            }
            
        
        
        }
        
    }
        
        return ans;
        
    
      
      
    }
}
