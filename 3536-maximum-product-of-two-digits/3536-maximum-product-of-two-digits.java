class Solution {
    public int maxProduct(int n) {
        
        int max =Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        while(n>0){
            if(n%10 >max){
                curr = max;
                max = n% 10;               
            }
            else if(n%10 > curr){
                curr = n%10;
            }
            n=n/10;
        }
        return max*curr;
    }
}