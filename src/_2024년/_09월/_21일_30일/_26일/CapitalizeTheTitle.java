class Solution {
    public String capitalizeTitle(String title) {
        String[] word = title.split(" ");

        for (int i = 0; i < word.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (word[i].length() <= 2) {
                for (char c : word[i].toCharArray()) {
                    if (c >= 'A' && c <= 'Z') {
                        sb.append((char)(c - 'A' + 'a'));
                    } else {
                        sb.append(c);
                    }
                }
            } else {
                if (word[i].charAt(0) >= 'a' && word[i].charAt(0) <= 'z') {
                    sb.append((char)(word[i].charAt(0) - 'a' + 'A'));
                } else {
                    sb.append(word[i].charAt(0));
                }
                for (int j = 1; j < word[i].length(); j++) {
                    if (word[i].charAt(j) >= 'A' && word[i].charAt(j) <= 'Z') {
                        sb.append((char)(word[i].charAt(j) - 'A' + 'a'));
                    } else {
                        sb.append(word[i].charAt(j));
                    }
                }
            }

            word[i] = sb.toString();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length - 1; i++) {
            sb.append(word[i] + " ");
        }
        sb.append(word[word.length - 1]);

        return sb.toString();
    }
}