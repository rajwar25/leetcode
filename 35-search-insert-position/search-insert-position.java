class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int indx=h+1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]>=target)
            {
              indx=mid;
              h=mid-1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
        }
        return indx;
    }
}