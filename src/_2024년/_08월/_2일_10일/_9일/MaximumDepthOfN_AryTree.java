/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class MaximumDepthOfN_AryTree {
    public int maxDepth(Node root) {
        if(root == null) return 0;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        int ans = 1;

        while(!q.isEmpty()) {
            int count = q.size();

            for(int i = 0; i<count; i++) {
                Node cur = q.remove();

                if(!cur.children.isEmpty()) {
                    for(Node n : cur.children) {
                        q.add(n);
                    }
                }

            }

            if(!q.isEmpty()) ans++;
        }

        return ans;
    }
}