class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum =0;
        int mul =1;
        int num =n;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            mul*=rem;
            num = num/10;           
        }
        
        return n%(sum+mul)==0;
    }
}