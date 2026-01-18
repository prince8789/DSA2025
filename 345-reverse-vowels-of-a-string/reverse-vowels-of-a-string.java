class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int left =0;
        int right = str.length()-1;
        while(left<right){
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);
            if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
                if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'||ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'){
                    char temp =str.charAt(left);
                    str.setCharAt(left,str.charAt(right));
                    str.setCharAt(right,temp);
                    left++;
                    right--;

                }else{
                    right--;
                }
            }
            else{
                left++;
            }
        }
        String s2 = str.toString();
        return s2;
        
    }
}