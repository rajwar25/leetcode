class Solution {
    public int mySqrt(int x) {
          long low = 1, high = x;
        long ans = 0;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                low=mid+1;
                ans=mid;
            } else {
                high=mid-1;
            }
        }
        
        return (int) ans;
    }
}