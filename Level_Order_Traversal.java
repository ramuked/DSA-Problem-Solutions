//solution to problem https://practice.geeksforgeeks.org/problems/level-order-traversal/1

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        if(node==null)return al;
        
        Queue<Node> q = new ArrayDeque<>();
        q.offer(node);
        
        while(!q.isEmpty()){
            
            for(int i = q.size(); i > 0; i--){
                
                Node curr = q.poll();
                al.add(curr.data);
                
                if(curr.left != null)q.add(curr.left);
                if(curr.right != null)q.add(curr.right);
                
                
            }
            
            
        }
        
        return al;
    }
}


