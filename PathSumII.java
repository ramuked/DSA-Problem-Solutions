//solution to the problem https://leetcode.com/problems/path-sum-ii/
class  PathSumII {

    List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        ans = new ArrayList<>();
        
        helper(root,0,targetSum,new ArrayList<>());
        return ans;
        
    
    }
    public void helper(TreeNode root, int currSum, int targetSum,List<Integer> al){
       
        if(root == null)return;
        
        if(root.left == null && root.right == null){
            
            if(currSum + root.val == targetSum){
                al.add(root.val);
                List<Integer> list = new ArrayList<>();
                
                list.addAll(al);
                ans.add(list);
                al.remove(al.size()-1);
                
            }
            return;
        }
       
        
        al.add(root.val);
        
      
        helper(root.left,currSum+root.val,targetSum,al);
        helper(root.right,currSum+root.val,targetSum,al);
        
        al.remove(al.size()-1);
    }
}
