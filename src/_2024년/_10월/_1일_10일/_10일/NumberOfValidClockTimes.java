class NumberOfValidClockTimes {
    public int countTime(String time) {
        int h = 1; int m = 1;

        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            h = 24;
        } else if (time.charAt(0) == '?') {
            int d = Character.getNumericValue(time.charAt(1));
            if (d > 3) {
                h = 2;
            } else {
                h = 3;
            }
        } else if (time.charAt(1) == '?') {
            int d = Character.getNumericValue(time.charAt(0));
            if (d == 2) {
                h = 4;
            } else {
                h = 10;
            }
        }

        if (time.charAt(3) == '?' && time.charAt(4) == '?') {
            m = 60;
        } else if (time.charAt(3) == '?') {
            m = 6;
        } else if (time.charAt(4) == '?') {
            m = 10;
        }

        return h*m;
    }
}