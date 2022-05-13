class DiagonalTraversal
{
    public ArrayList<Integer> diagonal(Node root){
           //add your code here.
        Queue<Node> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        if(root == null)return ans;
        q.offer(root);
        
        while(!q.isEmpty()){
           Node curr = q.poll();
           while(curr != null){
               ans.add(curr.data);
               
               if(curr.left != null)q.offer(curr.left);
               curr = curr.right;
           }
       
           
       }
       
       return ans; 
           
    }
      
}
