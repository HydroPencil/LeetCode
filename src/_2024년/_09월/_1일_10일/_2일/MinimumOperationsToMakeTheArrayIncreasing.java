class MinimumOperationsToMakeTheArrayIncreasing {
    public int minOperations(int[] nums) {
        if(nums.length == 1) return 0;

        int ans = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] >= nums[i]) {
                int diff = nums[i-1] - nums[i] + 1;
                ans += diff;
                nums[i] += diff;
            }
        }

        return ans;
    }
}