public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i=0; i<nums.length-1; i++){
            int r = target-nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==r){
                    a[0]=i;
                    a[1]=j;
                    i = nums.length;
                    break;
                }
            }
        }
        return a;
    }
}