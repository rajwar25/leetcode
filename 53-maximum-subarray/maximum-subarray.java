class Solution {
    public int maxSubArray(int[] nums) {
        int ans1;
        int ans2;
        int j=0;
        int n=nums.length;
        int maxc=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
          sum=sum+nums[i];
          if(sum>maxc)
          {
            maxc=sum;
            ans1=i;
            ans2=j;
          }
          if(sum==0)
          {
            j=i;
          }
          if(sum<0)
          {
            sum=0;
          }
        }
        return maxc;
    }
}