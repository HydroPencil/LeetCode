class NArayTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> res=new LinkedList();
        if(root==null) return res;
        Stack<Node> st=new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            Node cur=st.pop();
            res.addFirst(cur.val);
            for(Node child:cur.children){
                st.push(child);
            }
        }

        return res;
    }
}