//solution to the problem https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/
class DutchNationalFlag
{
    public static void sort012(int a[], int n)
    {
        
        
        int l = 0;
        int m = 0;
        int r = a.length-1;
        
        while(m <= r){
            
            if(a[m] == 0){
                
                a[m] = 1;
                a[l] = 0;
                l++;
                m++;
                
            }
            z
            else if(a[m] == 1){
                
                m++;
                
            }
            else{
                
                a[m] = a[r];
                a[r] = 2;
                r--;
                
            }
            
            
            
        }
    }
}
