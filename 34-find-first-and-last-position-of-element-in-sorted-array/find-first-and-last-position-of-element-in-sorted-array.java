class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int first=-1;
        int last=-1;
        while(l<=h)
        {
          int mid=(l+h)/2;
          if(nums[mid]==target)
          {
            first=mid;
            h=mid-1;
          }
          else if(nums[mid]>target)
          {
            h=mid-1;
          }
          else{
            l=mid+1;
          }
        }
        int low=0;
        int high=n-1;
        while(low<=high)
        {
          int mid=(low+high)/2;
          if(nums[mid]==target)
          {
            last=mid;
            low=mid+1;
          }
          else if(nums[mid]>target)
          {
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        if(first!=-1 && last==-1)
        {
            last=first;
            int arr[]=new int[]{first,last};
            return arr;
        }
        else if(first!=-1 && last!=-1)
        {
             int arr[]=new int[]{first,last};
            return arr;
        }
        else{
            int arr[]=new int[]{-1,-1};
            return arr;
        }

    }
}