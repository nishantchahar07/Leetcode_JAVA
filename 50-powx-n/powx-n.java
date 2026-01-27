class Solution {
    public double get(double x, int n){
       if( n == 0)return 1;
        
        double half =  get(x , n/2);
        if(n % 2 == 0){
            return half * half;
        }
        else{
           return  half * half * x;
        }

    }
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1/x;

        }
        return get(x, n);
    }
}