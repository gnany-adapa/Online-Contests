class Solution {
    public double myPow(double x, int n) {
        // Handle base cases
        if (n == 0) {
            return 1.0;
        }
        
        // Calculate positive power
        if (n > 0) {
            return power(x, n);
        }
        // Calculate negative power
        else 
        {
                return 1.0 / power(x, -n);
            
        }
    }
    
    private double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        
        double half = power(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
