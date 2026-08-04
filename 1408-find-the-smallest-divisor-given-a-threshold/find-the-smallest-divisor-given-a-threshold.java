class Solution {
    public int divison(int arr[],int divisor, int threshold)
    {
        int sum=0;
        int minSum;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum=(int)(sum+Math.ceil((double)arr[i]/divisor));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
          mx=Math.max(mx,nums[i]);
        }
        int low=1;
        int high=mx;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int k=divison(nums,mid,threshold);
           if(k<=threshold)
           {
             ans=mid;
             high=mid-1;
           }
           else{
            low=mid+1;
           }
        }
        return ans;
    }
}