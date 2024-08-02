package easy.implementQueueUsingStacks232;

class MyQueue {
    private Stack<Integer> stMain;
    private Stack<Integer> stSub;
    public MyQueue() {
        stMain = new Stack<>();
        stSub = new Stack<>();
    }

    public void push(int x) {
        stMain.push(x);
    }

    public int pop() {
        while(!stMain.isEmpty()){
            stSub.push(stMain.pop());
        }
        int ans = stSub.pop();
        while(!stSub.isEmpty()){
            stMain.push(stSub.pop());
        }
        return ans;
    }

    public int peek() {
        while(!stMain.isEmpty()){
            stSub.push(stMain.pop());
        }
        int ans = stSub.peek();
        while(!stSub.isEmpty()){
            stMain.push(stSub.pop());
        }
        return ans;
    }

    public boolean empty() {
        return stMain.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */