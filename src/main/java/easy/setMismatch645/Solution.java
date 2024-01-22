package easy.setMismatch645;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        boolean[] check = new boolean[nums.length+1];
        int[] ans = new int[2];

        for(int i : nums){
            if(check[i]) {
                ans[0] = i;
            }
            check[i] = true;
        }
        for(int i=1; i<=nums.length; i++){
            if(!check[i]) ans[1] = i;
        }

        return ans;
    }
}