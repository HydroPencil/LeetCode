class FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;

        for(int i : nums)   sum+=e(String.valueOf(i));

        return sum;
    }

    private int e(String n){
        int max = 0;

        for(int i=0;i<n.length();i++){
            max = Math.max(max, n.charAt(i)-'0');
        }

        String ans = "";
        for(int i=0;i<n.length();i++){
            ans+=max;
        }

        return Integer.parseInt(ans);
    }
}