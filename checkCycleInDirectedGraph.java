class checkCycleInDirectedGraph {
    
    int[] color;
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
    
        color = new int[V];
        
        for(int i = 0;i<V;i++){
            
        
            if(color[i]==0){
                    
                boolean f = visit(adj,i);

                if(f)return f;
            }
           
        }
        
        return false;
        
    }
    
    boolean visit(ArrayList<ArrayList<Integer>> adj,int i){
        
        if(color[i]==1)return true;
        
        if(color[i]==2)return false;
        
        color[i] = 1;
        
        for(int x : adj.get(i)){
            
            if(visit(adj,x))return true;
        
        }
        
        color[i] = 2;
        return false;
        
    }
}
