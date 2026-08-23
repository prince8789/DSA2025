class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int lc =0;
        int rc = 0;
        int suml =0;
        int sumr =0;
        for(int i =0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                lc++;
            }
            else suml+=num.charAt(i)-'0';
        }
        for(int i =n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                rc++;
            }
            else sumr+=num.charAt(i)-'0';
        }
        if((lc+rc)%2==1){
            return true;
        }
        int diff = suml-sumr;
        return diff != (rc-lc)/2*9;
    }
}