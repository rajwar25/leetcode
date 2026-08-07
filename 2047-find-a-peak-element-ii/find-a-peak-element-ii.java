class Solution {
    public int findMax(int arr[][],int l,int k)
    {
     int mx=-1;
     int indx=-1;
     for(int i=0;i<l;i++)
     {
        if(arr[i][k]>mx)
        {
            mx=arr[i][k];
            indx=i;
        }
     }
     return indx;
    }
    public int[] findPeakGrid(int[][] mat) {
         int high=mat[0].length-1;
         int c=mat.length;
         int low=0;
         int row;
         int right;
         int left;
         int cols=mat[0].length;
         while(low<=high)
         {
            int mid=(low+high)/2;
            row=findMax(mat,c,mid);
            left=mid-1>=0?mat[row][mid-1]:-1;
            right=mid+1<cols?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right)
            {
                return new int[]{row, mid};
            }
            else if(mat[row][mid]<left)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
         }
         return new int[]{-1, -1};
    }
}