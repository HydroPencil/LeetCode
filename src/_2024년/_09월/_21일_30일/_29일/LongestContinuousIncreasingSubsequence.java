class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 0;
        int length = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                length++;
            } else {
                maxLength = Math.max(length, maxLength);
                length = 1;
            }
        }

        return Math.max(length, maxLength);
    }
}