class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty_bottle = numBottles;
        int count = numBottles;
        while(empty_bottle>=numExchange){
            int newbottle  =empty_bottle/numExchange;
            count =count +newbottle ;
            
            empty_bottle = empty_bottle % numExchange + newbottle;

        }
        return count;
    }
}