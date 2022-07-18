class Solution {
    public double myPow(double x, int n) {
// Ask the interviewer can the value of n be -ve 
        double ans = 1.0;
        long  power = n; // overlow condition 
        if(n  < 0)
            power *= -1;
        while(power > 0)
        {
            if(power % 2 == 0) // even power 
            {
                x = x * x;
                power /= 2;
            }
            else // odd power
            {
                ans *= x;
                power -= 1;
            }
        }
        if(n < 0)
            ans = 1 / ans;
        return ans;
    }
}
// TC : O(log n)
// SC : O(1)
