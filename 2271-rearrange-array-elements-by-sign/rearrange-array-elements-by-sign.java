class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int cnt1=0;
        int cnt2=0;
        int j=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                arr1[j]=nums[i];
                j++;
                cnt1++;
            }
            if(nums[i]<=0)
            {
                arr2[k]=nums[i];
                k++;
                cnt2++;
            }
        }
        int arr[]=new int[n];
        int d=0;
        int z=0;
        for(int l=0;l<n;l++)
        {
            if(l%2==0)
            {
                arr[l]=arr1[d];
                d++;
            }
            if(l%2==1)
            {
                arr[l]=arr2[z];
                z++;
            }
        }
          return arr;
    }
}