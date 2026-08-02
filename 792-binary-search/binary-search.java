class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int k=bs(nums,0,n-1,target);
        return k;
    }
    private int bs(int arr[],int a,int b, int k)
    {
        int mid=(a+b)/2;
    if(arr[mid]==k)
    {
     return mid;
    }
    if(a>b)
    {
        return -1;
    }
    if(arr[mid]<k)
    {
       return bs(arr,mid+1,b,k);
    }
    else{
       return bs(arr,a,mid-1,k);
    }
}
}