class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);

        int val = nums[0];
        int sum = Math.max(nums[0], 0); // Start with first element if positive

        for (int i = 1; i < nums.length; i++) {

            // Add only distinct positive numbers
            if (nums[i] > 0 && val != nums[i]) {
                val = nums[i];
                sum += val;
            }
        }

        // If there are no positive numbers, return the largest element
        if (sum == 0) {
            return nums[nums.length - 1];
        }

        return sum;
    }
}