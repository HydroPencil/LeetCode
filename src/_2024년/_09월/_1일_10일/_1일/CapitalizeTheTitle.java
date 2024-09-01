class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        String[] strs = title.split(" ");
        String ans = "";

        for(String str : strs) {
            if(str.length() > 2) {
                for(int i=0; i<str.length(); i++) {
                    if(i == 0) {
                        ans += String.valueOf(str.charAt(i)).toUpperCase();
                    } else {
                        ans += String.valueOf(str.charAt(i)).toLowerCase();
                    }
                }

                ans += " ";
            } else {
                ans += str.toLowerCase() + " ";
            }
        }

        return ans.substring(0, ans.length() - 1);
    }
}