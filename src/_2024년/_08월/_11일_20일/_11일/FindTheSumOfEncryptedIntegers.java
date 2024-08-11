class FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += encrypt(num);
        }
        return sum;
    }

    private static int encrypt(int num){
        String str = String.valueOf(num);
        int n = str.length();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            String ch = String.valueOf(str.charAt(i));
            if(Integer.parseInt(ch) > max){
                max = Integer.parseInt(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(String.valueOf(max));
        }
        return Integer.parseInt(sb.toString());
    }
}