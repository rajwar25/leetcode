class Solution {
    public boolean maxSplit(int arr[],int sum,int k)
    {
        int curSum=0;
        int d=1;
       for(int i=0;i<arr.length;i++)
       {
         if(curSum+arr[i]<=sum)
         {
           curSum=curSum+arr[i];
         }
         else{
            curSum=arr[i];
            d++;
         }
       }
       if(d<=k)
       {
        return true;
       }
       else{
        return false;
       }
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            mx=Math.max(mx,nums[i]);
            sum=sum+nums[i];
        }
        int low=mx;
        int high=sum;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(maxSplit(nums,mid,k))
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