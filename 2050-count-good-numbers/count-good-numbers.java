class Solution {
    static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long eve=(n+1)/2;
        long odd=n/2;
        long p5=mypow(5,eve);
        long p4=mypow(4,odd);
        return (int)((p5*p4)%MOD);
    }
    public long mypow(long x, long p)
    {
        long ans=1;
        if(p==0)
        {
          return ans;
        }
        else if(p%2==1)
        {
            ans=x*mypow(x,p-1)%MOD;
        }
        else{
            long half=mypow(x,p/2);
            ans=(half*half)%MOD;
        }
        return ans;
    }
}