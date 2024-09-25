class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> m = new HashMap<>();

        for (String i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        for (String s : arr) {
            if (m.get(s) == 1 && ++count == k) {
                return s;
            }
        }

        return "";
    }
}