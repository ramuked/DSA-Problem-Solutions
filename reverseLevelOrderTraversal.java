//solution  to the problem https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1

class reverseLevelOrderTraversal
{
     public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
       
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        if(node == null)return al;
        
        Queue<Node> q = new ArrayDeque<>();
        q.offer(node);
        
        while(!q.isEmpty()){
            
            Node curr = q.poll();
            
            st.push(curr.data);
            
            if(curr.right != null)
                q.offer(curr.right);
                
            if(curr.left!=null)
                q.offer(curr.left);
           }
        
        for(int i = st.size(); i > 0; i--){
                
            al.add(st.pop());
        
        }
        
        return al;
    }
}    
