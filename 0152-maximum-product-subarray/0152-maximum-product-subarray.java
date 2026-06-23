class Solution {
    public int maxProduct(int[] nums) {

        // Maximum product ending at current index
        int maxProd = nums[0];

        // Minimum product ending at current index
        int minProd = nums[0];

        // Final answer
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // If current number is negative,
            // maximum and minimum swap roles
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Either start fresh from nums[i]
            // or extend previous product
            maxProd = Math.max(nums[i], maxProd * nums[i]);

            minProd = Math.min(nums[i], minProd * nums[i]);

            // Update global maximum
            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
}