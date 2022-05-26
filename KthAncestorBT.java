//solution to the problem https://practice.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1/

class KthAncestor(
{
    public int kthAncestor(Node root, int k, int node)
    {
		
        
        Queue<Node> q = new ArrayDeque<>();
        
        q.offer(root);
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(root.data,-1);
        
        while(!q.isEmpty()){
            
            Node curr = q.poll();
            
            if(curr.left!=null){
                
                hm.put(curr.left.data,curr.data);
                q.offer(curr.left);
            }
            
            if(curr.right!=null){
                
                hm.put(curr.right.data,curr.data);
                q.offer(curr.right);
            }
            
        }
        
        int count = 0;
        int curr = node;
        while(count < k && curr != -1){
            curr = hm.get(curr);
            count++;
         
        }
        
        return (count == k)?curr : -1;
        
    }
}
