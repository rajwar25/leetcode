class Solution {
    public boolean capacity(int arr[],int wt,int days)
    {
        int cnt=1;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
         if(sum+arr[i]<=wt)
         {
           sum=sum+arr[i];
         }
         else{
            sum=arr[i];
            cnt++;
         }
        }
        if(cnt<=days)
         {
            return true;
         }
         else{
            return false;
         }
    }
    public int shipWithinDays(int[] weights, int days) {
        int mx=Integer.MIN_VALUE;
        int n=weights.length;
        int wt=0;
        for(int i=0;i<n;i++)
        {
            mx=Math.max(mx,weights[i]);
            wt=wt+weights[i];
        }
        int high=wt;
        int low=mx;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(capacity(weights,mid,days))
            {
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}