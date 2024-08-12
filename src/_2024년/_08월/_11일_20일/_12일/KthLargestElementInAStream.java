class KthLargest {
    private int largestN[];

    public KthLargest(int k, int[] nums) {
        largestN = new int[k];
        Arrays.sort(nums);

        if(nums.length >= 1) {
            if(nums.length >= k) {
                for(int i=0; i < k; i++) {
                    largestN[i] = nums[nums.length-i-1];
                }
            } else {
                for(int i=0; i < k; i++) {
                    if(i < nums.length) {
                        largestN[i] = nums[nums.length-i-1];
                    } else {
                        largestN[i] = -100000;
                    }
                }
            }
        } else {
            Arrays.fill(largestN, -100000);
        }
        System.out.println(Arrays.toString(largestN));
    }

    public int add(int val) {
        for(int i=0; i<largestN.length; i++) {
            if(largestN[i] < val) {
                int tmp = largestN[i];
                largestN[i] = val;
                val = tmp;
            }
        }

        return largestN[largestN.length-1];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */