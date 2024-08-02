package easy.rangeSumOfBST938;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        sum += sumBST(root, low, high);
        return sum;
    }
    public int sumBST(TreeNode node, int low, int high){
        if(node.val<low&&node.right!=null){
            return sumBST(node.right, low, high);
        }
        if(node.val>high&&node.left!=null){
            return sumBST(node.left, low, high);
        }
        int sum = 0;
        if(node.val<=high&&node.val>=low){
            sum = node.val;
            if(node.left!=null)sum+=sumBST(node.left,low,high);
            if(node.right!=null)sum+=sumBST(node.right,low,high);
        }
        return sum;
    }
}