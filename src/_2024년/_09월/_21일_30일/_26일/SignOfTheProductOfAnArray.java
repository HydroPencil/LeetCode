class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int signNum = 1;

        for(int num : nums) {
            if(num == 0) return 0;
            if(num > 0) signNum *= 1;
            if(num < 0) signNum *= -1;
        }

        if(signNum > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}