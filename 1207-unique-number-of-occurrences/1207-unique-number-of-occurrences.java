class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs= new HashSet<>();
        for(int i =0;i<arr.length;i++){
            int num = arr[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }
            else{
                hm.put(num,1);
            }
        }
        for (int vl : hm.values()){
            hs.add(vl);
        }
        if(hs.size()==hm.size()){
            return true;
        }
        return false;
    }
}