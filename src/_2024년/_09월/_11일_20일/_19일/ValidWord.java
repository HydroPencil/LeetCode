class ValidWord {
    public boolean isValid(String word) {
        int n = word.length();
        char ch;
        int vowl = 0;
        int cons = 0;
        if (n < 3) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            ch = word.charAt(i);
            if(ch == '$' || ch == '#' || ch == '@'){
                return false;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowl++;
            } else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                cons++;
            }
        }

        return vowl>0&&cons>0?true:false;
    }
}