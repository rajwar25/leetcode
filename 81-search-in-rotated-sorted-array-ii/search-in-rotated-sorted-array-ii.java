class Solution {
    public boolean search(int[] arr, int target) {
        int n=arr.length;
        int h=n-1;
        int l=0;
        int mid;
        boolean b=false;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(arr[mid]==target)
            {
             b=true;
            }
            if(arr[mid]==arr[l] && arr[mid]==arr[h])
            {
                h=h-1;
                l=l+1;
                continue;
            }
            if(arr[l]<=arr[mid])
            {
                if(arr[mid]>=target && arr[l]<=target)
                {
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && arr[h]>=target)
                {
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return b;
        
    }
}