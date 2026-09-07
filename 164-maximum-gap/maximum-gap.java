class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==1)
        {
            return 0;
        }
        int mx=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
           int j=i+1;
           mx=Math.max(mx,nums[j]-nums[i]);
        }
        int ans=Math.abs(mx);
        return ans;
      
    }
}