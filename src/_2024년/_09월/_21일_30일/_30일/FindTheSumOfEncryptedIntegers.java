class FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int summ = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 10) {
                int maxn = -1;
                int count = 0;

                while (nums[i] > 0) {
                    int it = nums[i] % 10;
                    if (it > maxn) {
                        maxn = it;
                    }
                    nums[i] /= 10;
                    count++;
                }

                nums[i] = maxn;
                for (int j = 0; j < count - 1; j++) {
                    nums[i] *= 10;
                    nums[i] += maxn;
                }
            }

            summ += nums[i];
        }

        return summ;
    }
}