class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            mx=Math.max(nums[i],mx);
            mn=Integer.MAX_VALUE;
           for(int j=i;j<n;j++)
           { 
            mn=Math.min(nums[j],mn);
           }
           int d=mx-mn;
           if(d<=k)
           {
            return i;
           }
        }
        return -1;
        
    }
}