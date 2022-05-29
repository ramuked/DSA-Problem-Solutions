//solution to the problem https://leetcode.com/problems/min-cost-to-connect-all-points/

class MinCostConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        
        int n = points.length;
        ArrayList<Edge> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            
            for(int j = i+1; j < n; j++){
                
                al.add(new Edge(i,j,Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1])));
            }
            
        }
        
        int cost = 0;
        EagerUFDS uf = new EagerUFDS(n);
        Collections.sort(al);
        for(Edge e : al){
            if(uf.isConnnected(e.from,e.to))continue;
          
            uf.union(e.from,e.to);
            cost += e.wt;
            
            
        }
        
        return cost;
        
        
        
    }
    
    class Edge implements Comparable<Edge>
    {
		int from;
		int to;
        int wt;
        
		public Edge(int from,int to,int wt)
		{
		    this.from = from;
            this.to = to;
            this.wt = wt;
            
		}
		@Override
		public int compareTo(Edge o)
		{
			if(wt>o.wt)return 1;
			else if(wt<o.wt)return -1;
			return 0;
		}
    }
    
    public class EagerUFDS{

	private int[] id;
	private int[] size;
	int cc;
	public EagerUFDS(int N){
		
		id = new int[N];
		size = new int[N];
		cc = N;
		for(int i = 0; i < N; i++){
			id[i] = i;
			size[i] = 1;
		}
	}
	
	private int root(int i){
		while (i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	
	public boolean isConnnected(int p, int q){
		return root(p) == root(q);
			
	}
		
	
	public void union(int p, int q){
		
		int i = root(p);
		int j = root(q);
		if(i == j)return;
        cc -= 1;
        
		if(size[i] < size[j]){
			id[i] = id[j];
			size[j] += size[i];
		}
		else{
			id[j] = id[i];
			size[i] += size[j];
			
			
		}
	}

}
    
}
