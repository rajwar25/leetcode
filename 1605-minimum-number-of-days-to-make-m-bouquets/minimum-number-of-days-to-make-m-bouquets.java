class Solution {
    public boolean possible(int arr[],int day,int m,int k)
    {
        int noB=0;
        int cnt=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=day)
            {
              cnt++;
            }
            else{
                noB=noB+cnt/k;
                cnt=0;
            }
        }
        noB=noB+cnt/k;
        return noB>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        if(val>bloomDay.length)
        {
            return -1;
        }
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            mn=Math.min(mn,bloomDay[i]);
            mx=Math.max(mx,bloomDay[i]);
        }
        int low=mn;
        int high=mx;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k))
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}