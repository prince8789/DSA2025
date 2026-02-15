class Solution {
    public String addBinary(String a, String b) {
        int n1 =a.length()-1,n2=b.length()-1;
        int carry = 0,base=2;
        StringBuilder sb =new StringBuilder();
        while(n1>=0 || n2>=0){
            int t1=0,t2=0,sum;
            if(n1>=0) t1= a.charAt(n1--)-'0';
            if(n2>=0) t2= b.charAt(n2--)-'0';
            sum = t1+t2+carry;
            if(sum>=base){
                sum=sum-base;
                carry=1;
            }
            else carry=0;
            sb.append(sum);
        } 
        if(carry==1){
                sb.append(carry);
        }
        return sb.reverse().toString();       
    }
}