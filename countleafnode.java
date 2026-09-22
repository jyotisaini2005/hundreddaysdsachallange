class Solution {
    public int countLeaves(TreeNode root) {
        
        // Tree empty hai
        if (root == null) {
            return 0;
        }

        // Current node leaf hai
        if (root.left == null && root.right == null) {
            return 1;
        }

        // Left + Right subtree ke leaf nodes
        return countLeaves(root.left) + countLeaves(root.right);
    }
}co