class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        for(int i =0;i<chars.length;i++){
            int count =1;
            s.append(chars[i]);
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count>9){
                s.append(count/10);
                s.append(count%10);
            }
            else if(count>1){
                s.append(count);
            }
        }
        for(int i =0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
        
    }
}