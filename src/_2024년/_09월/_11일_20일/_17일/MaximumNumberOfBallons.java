class MaximumNumberOfBallons {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int [] freq = new int [26];

        for(int i=0; i<n; i++){
            freq[text.charAt(i)-'a']++;
        }
        int min = Integer.MAX_VALUE;

        min = Math.min(min,freq['b'-'a']);
        min = Math.min(min,freq['a'-'a']);
        min = Math.min(min,freq['l'-'a']/2);
        min = Math.min(min,freq['o'-'a']/2);
        min = Math.min(min,freq['n'-'a']);

        return min;
    }
}