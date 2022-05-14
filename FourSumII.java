// solution to https://leetcode.com/problems/4sum-ii/
class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        int n = nums1.length;
        HashMap<Integer,Integer> hm1 = new HashMap<>();
       
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                
                int s1 = nums1[i]+nums2[j];
                int s2 = nums3[i]+nums4[j];
                
                hm1.put(s1,hm1.getOrDefault(s1,0)+1);
                
                hm2.put(s2,hm2.getOrDefault(s2,0)+1);
             }
        }
        
        int ans = 0;
        for(int i : hm1.keySet()){
            int v1 = hm1.get(i);
            int v2 = hm2.getOrDefault(-i,0);
            
            ans += v1*v2;
        }
        
        return ans;
    }
}
