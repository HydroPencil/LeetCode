package medium.divideArrayIntoArraysWithMaxDifference2966;

class Solution {
    int SUB_ARRAY_SIZE = 3;

    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[nums.length / SUB_ARRAY_SIZE][SUB_ARRAY_SIZE];

        for (int i = 0; i < nums.length / SUB_ARRAY_SIZE; i++) {
            int index = i * SUB_ARRAY_SIZE;
            if (nums[index + 2] - nums[index] > k) {
                return new int[0][0];
            }
            for (int j = 0; j < SUB_ARRAY_SIZE; j++) {
                ans[i][j] = nums[index + j];
            }
        }

        return ans;
    }
}