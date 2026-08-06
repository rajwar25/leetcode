class Solution {
    public boolean find(int []arr,int k)
    {
        boolean ans=false;
        int n=arr.length;
        if(k>arr[n-1])
        {
            return ans;
        }
        int h=n-1;
        int l=0;
        while(l<=h)
        {
            int mid=(h+l)/2;
            if(arr[mid]==k)
            {
                ans=true;
                break;
            }
            else if(arr[mid]<k)
            {
              l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
    public boolean searchMatrix(int[][] mat, int target) {
         int rows = mat.length;          
        boolean ans=false;  
        for(int i=0;i<rows;i++)
        {
                 if(find(mat[i],target))
                 {
                    ans=true;
                 }
                 else{
                    continue;
                 }
        }
        return ans;
    }
}

