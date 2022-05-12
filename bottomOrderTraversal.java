//solution to the problem https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

class bottomviewBinaryTree
{
    static class Pair{
        int hd;
        Node root;
        Pair(int hd,Node root){
            this.hd = hd;
            this.root = root;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        if(root==null)return new ArrayList<>();
        
        Map<Integer,Integer> hm = new TreeMap<>();
        
        Queue<Pair> q = new ArrayDeque<>();
        
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            
            Pair curr = q.poll();
           
         
            hm.put(curr.hd,curr.root.data);
                
            
            
            if(curr.root.left!=null){
                
                q.offer(new Pair(curr.hd-1,curr.root.left));
                
            }
            if(curr.root.right!=null){
                
                q.offer(new Pair(curr.hd+1,curr.root.right));
            }
            
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : hm.keySet()){
            ans.add(hm.get(i));
        }
        return ans;
        
    }
}
