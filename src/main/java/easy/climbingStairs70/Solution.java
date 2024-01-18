package easy.climbingStairs70;

class Solution {
    final static int MAX_STEPS = 46;
    static int[] steps = new int[MAX_STEPS];
    public Solution(){
        steps[1] = 1;
        steps[2] = 2;
        for(int i=3; i<MAX_STEPS; i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
    }
    public int climbStairs(int n) {
        return steps[n];
    }
}