//solution to the problem https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
class CelebrityProblem
{ 
    int celebrity(int M[][], int n)
    {
    	int p1 = 0;
    	int p2 = n-1;
    	while(p2-p1 > 0){
    	    if(M[p1][p2]==0){
    	        p2--;
    	    }
    	    else{
    	        p1++;
    	        
    	    }
    	    
    	}
    	
    	int c = p1;
    	
    	for(int i = 0; i < n; i++){
    	    if(i == c)continue;
    	    
    	    if(M[i][c] == 0 || M[c][i] == 1)return -1;
    	}
    	return c;
    }
}
