class Solution {
    public int trap(int[] arr) {
        int lm=0;
        int rm=0;
        int l=0;
        int r=arr.length-1;
        int total=0;
        while(l<r)
        {
          if(arr[l]<=arr[r])
          {
            if(lm<=arr[l])
            {
                lm=arr[l];
            }
            else{
                total+=lm-arr[l];
            }
            l+=1;
          }
          else{
            if(rm<=arr[r])
            {
                rm=arr[r];
            }
            else{
                total+=rm-arr[r];
            }
            r-=1;
          }
        }
        return total;
    }
}