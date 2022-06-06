class EditDistance {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i<=n; i++)Arrays.fill(dp[i],Integer.MAX_VALUE);
        for(int i = 0; i <= n; i++){
            dp[i][m] = n-i;
        }
        
        for(int i = 0; i <= m; i++){
            dp[n][i] = m - i;
        }
        
        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j >= 0; j--){
                
                if(word1.charAt(i) == word2.charAt(j)){
                    dp[i][j] = dp[i+1][j+1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i+1][j], Math.min(dp[i][j+1],dp[i+1][j+1]));
                }
            }
        }  
        return dp[0][0];
    }
}
