class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        int minlength = String.valueOf(low).length();
        int maxlength = String.valueOf(high).length();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i =minlength;i<=maxlength;i++){
            for(int start=0;start+i<=9;start++){
                String substr = str.substring(start,start+i);
                int num = Integer.parseInt(substr);
                if(num>=low && num<=high){
                    l.add(num);
                }
            }
        }
        return l;
    }
}