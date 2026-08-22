class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int num = n;

        while (num > 0) {
            sum += num % 10;
            product *= num % 10;
            num /= 10;
        }

        return n % (sum + product) == 0;
    }
}