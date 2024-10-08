class MinimumAverageOfSmallestAndLargestElements {
    public double minimumAverage(int[] nums) {
        double ans = Double.MAX_VALUE;

        Arrays.sort(nums);
        for(int i=0; i<nums.length/2; i++) {
            ans = Math.min(ans, (nums[i] + nums[nums.length-1 - i])/2.0);
        }

        return ans;
    }
}