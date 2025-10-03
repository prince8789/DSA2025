class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty_bottle = numBottles;
        int drinkBottle = numBottles;
        while(empty_bottle >= numExchange){
            empty_bottle = empty_bottle - numExchange;
            drinkBottle++;
            numExchange++;
            empty_bottle++;
        }
        return drinkBottle;
        
    }
}