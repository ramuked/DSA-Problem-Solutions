class verticalOrderTraversal
{
    //Function to find the vertical order traversal of Binary Tree.
    static class Pair{
        int hD;
        Node root;
        Pair(int hD,Node root){
            this.hD = hD;
            this.root = root;
        }
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        
        if(root==null)return new ArrayList<>();
        
        Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
        
        Queue<Pair> q = new ArrayDeque<>();
        
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            
            Pair curr = q.poll();
            if(map.containsKey(curr.hD)){
                
                map.get(curr.hD).add(curr.root.data);
                
            }
            else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.root.data);
                map.put(curr.hD,al);
            }
            
            if(curr.root.left!=null){
                q.add(new Pair(curr.hD-1,curr.root.left));
            }
            if(curr.root.right!=null){
                q.add(new Pair(curr.hD+1,curr.root.right));
                
            }
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : map.keySet()){
            for(int j : map.get(i))
                ans.add(j);
        }
        
        return ans;
    }
}
