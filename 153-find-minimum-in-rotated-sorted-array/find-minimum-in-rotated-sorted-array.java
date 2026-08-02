class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int h=n-1;
        int l=0;
        int ans=Integer.MAX_VALUE;
        while(l<=h)
        {
            int mid=(h+l)/2;
            if(arr[l]<=arr[mid])
            {
                ans=Math.min(ans,arr[l]);
                l=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                h=mid-1;
            }
        }
        return ans;
    }
}