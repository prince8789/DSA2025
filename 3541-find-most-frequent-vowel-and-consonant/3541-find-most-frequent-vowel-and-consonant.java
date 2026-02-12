class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        int vow=0;
        int cons=0;
        for(var ch : hm.keySet()){
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                int freq = hm.get(ch);
                vow = Math.max(vow,freq);
            }
            else{
                int freq = hm.get(ch);
                cons = Math.max(cons,freq);
            }
        }
        return vow+cons;
        
    }
}