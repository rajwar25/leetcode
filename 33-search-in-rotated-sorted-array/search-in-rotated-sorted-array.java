class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        int ans=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==target)
            {
                ans=mid;
            }
            if(arr[mid]>=arr[l])
            {
               if(arr[l]<=target && target<=arr[mid])
               {
                  h=mid-1;
               }
               else{
                l=mid+1;
               }
            }
            else{
                if(arr[mid]<=target && target<=arr[h])
                {
                   l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return ans;
    }
}