class Solution {
    public double myPow(double x, int n) {
long temp = Math.abs((long) n);
        double ans  =1.0;

        while(temp>0){
            if((temp & 1) == 1){
                ans = ans * x;
                temp-=1;
            }
            else{
                temp = temp / 2;
                x = x * x;
            }
        }
        if(n < 0){
            return 1.0/ans;
        }
        return ans;
    }
}