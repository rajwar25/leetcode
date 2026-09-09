class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        {
            return 1;
        }
         long N = n;
        if (N < 0) {
            x=1/x;
            N=-N;
        }
        return power(x,N);
    }
    public double power(double x, long n)
    {
        double ans=1.0;
        if(n==0)
        {
            return ans;
        }
        if(n%2==1)
        {
            ans=x*power(x, n-1);
        }
        else
        {
            double half=power(x,n/2);
            ans=half*half;
        }
        return ans;
    }
}