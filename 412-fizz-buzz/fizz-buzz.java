class Solution {
    public List<String> fizzBuzz(int n) {
       List<String> str = new ArrayList<>();
       int i =1;
        while(i<=n){
            if(i%3==0 && i%5==0){
                str.add("FizzBuzz");
            }
            else if(i%3==0){
                str.add("Fizz");
            }
            else if(i%5==0){
                str.add("Buzz");
            }
            else{
                str.add(String.valueOf(i));
            }
            i++;
        }
        return str;
        
    }
}