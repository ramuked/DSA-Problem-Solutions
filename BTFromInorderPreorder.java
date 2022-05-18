//solution to the problem https://practice.geeksforgeeks.org/problems/construct-tree-1/1/#
class BTFromInorderPreorder
{
    static HashMap<Integer,Integer> hm;
    static int preIndex;
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        
        hm = new HashMap<>();
        preIndex = 0;
        for(int i = 0; i < n; i++){
            hm.put(inorder[i],i);
        }
        return buildTree(inorder,preorder,0,n-1);
        
        
    }
    static Node buildTree(int inorder[],int preorder[], int start,int end){
       
        
        if(start>end){
            
            return null;
        }
        Node curr = new Node(preorder[preIndex++]);
        if(start == end){
            
            return curr;
        }
        
        int inorderIndex = hm.get(curr.data);
        
        
        curr.left = buildTree(inorder,preorder,start,inorderIndex-1);
        curr.right = buildTree(inorder,preorder,inorderIndex+1,end);
        return curr;
    }

}
