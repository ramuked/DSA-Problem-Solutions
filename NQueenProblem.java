//solution to the problem https://practice.geeksforgeeks.org/problems/n-queen-problem0315/1
class NQueenProblem{

    static ArrayList<ArrayList<Integer>> al;
    static HashSet<Integer> col;
    static HashSet<Integer> d1;;
    static HashSet<Integer> d2;
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
      
        col = new HashSet<>();
        d1 = new HashSet<>();
        d2 = new HashSet<>();
        al = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        solve(0,n,a);
        return al;
    }
    
    static void solve(int r,int n,ArrayList<Integer> a){
        
        if(r == n){
           
           ArrayList<Integer> temp = new ArrayList<>();
           for(int i : a)temp.add(i+1);
        
           al.add(temp);
           
            
        }
        
        for(int i = 0; i < n; i++){
            if(col.contains(i)||d1.contains(r-i)||d2.contains(r+i)){
                continue;
            }
            
            col.add(i);
            d1.add(r-i);
            d2.add(r+i);
            a.add(i);
            solve(r+1,n,a);
            a.remove(a.size()-1);
            col.remove(i);
            d1.remove(r-i);
            d2.remove(r+i);
          
            
        }
        
    }
}
