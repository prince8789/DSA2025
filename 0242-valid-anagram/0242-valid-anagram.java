class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> mp = new HashMap<>();
        for(int i =0;i <s.length();i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
         Map<Character,Integer> mt = new HashMap<>();
        for(int i =0;i <t.length();i++){
            char ch = t.charAt(i);
            if(!mt.containsKey(ch)){
                mt.put(ch,1);
            }
            else{
                mt.put(ch,mt.get(ch)+1);
            }
        }
        return mp.equals(mt);
        
    }
}