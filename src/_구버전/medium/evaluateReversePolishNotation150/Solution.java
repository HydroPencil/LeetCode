package medium.evaluateReversePolishNotation150;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        for (String c : tokens) {
            if ("*+/-".contains(c)) {
                calc(nums, c);
                continue;
            }
            nums.push(Integer.parseInt(c));
        }
        return nums.peek();
    }

    private void calc(Stack<Integer> st, String in) {
        int second = st.pop();
        int first = st.pop();
        if (in.equals("*")) {
            st.push(first * second);
        }
        if (in.equals("/")) {
            st.push(first / second);
        }
        if (in.equals("+")) {
            st.push(first + second);
        }
        if (in.equals("-")) {
            st.push(first - second);
        }
    }
}