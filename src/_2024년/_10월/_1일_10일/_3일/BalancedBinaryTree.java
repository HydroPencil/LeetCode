class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if(checkDepth(root) == -1) return false;

        return true;
    }

    public int checkDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = checkDepth(root.left);
        if (leftDepth == -1) return -1;

        int rightDepth = checkDepth(root.right);
        if (rightDepth == -1) return -1;

        if (Math.abs(leftDepth - rightDepth) > 1) return -1;

        return 1 + Math.max(leftDepth, rightDepth);
    }
}