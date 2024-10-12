class MaximumNumberOfBallons {
    public int maxNumberOfBalloons(String text) {
        int[] alphabet = new int[26];
        for(int i=0; i<text.length(); i++) {
            alphabet[text.charAt(i) - 'a']++;
        }

        int ans = alphabet[0];

        if(ans > alphabet[1]) ans = alphabet[1];
        if(ans > alphabet[11]/2) ans = alphabet[11]/2;
        if(ans > alphabet[13]) ans = alphabet[13];
        if(ans > alphabet[14]/2) ans = alphabet[14]/2;

        return ans;
    }
}