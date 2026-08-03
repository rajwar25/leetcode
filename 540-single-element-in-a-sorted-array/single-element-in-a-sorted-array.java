class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int ans=-1;
        if(n==1)
        {
            ans=nums[0];
            return ans;
        }
        else if(nums[n-1]!=nums[n-2])
        {
            ans=nums[n-1];
            return ans;
        }
        else if(nums[0]!=nums[1])
        {
            ans=nums[0];
            return ans;
        }
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            {
                ans=nums[mid];
                break;
            }
            if((mid%2)!=0 && nums[mid]==nums[mid-1] || (mid%2)==0 && nums[mid]==nums[mid+1])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}