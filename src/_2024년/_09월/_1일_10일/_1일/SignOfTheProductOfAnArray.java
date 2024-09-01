class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int check = 1;

        for(int num : nums) {
            if(num == 0) return 0;
            if(num > 0) check *= 1;
            if(num < 0) check *= -1;
        }

        if(check > 0) {
            return 1;
        }

        return -1;
    }
}