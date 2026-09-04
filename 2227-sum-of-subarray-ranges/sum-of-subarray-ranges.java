class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long diff=0;
        long mx;
        long mn;
        for(int i=0;i<n;i++)
        {
            mx=nums[i];
            mn=nums[i];
            for(int j=i;j<n;j++)
            {
                mx=Math.max(mx,nums[j]);
                mn=Math.min(mn,nums[j]);
                diff+=mx-mn;
            }
            

        }
        return diff;
    }
}