class Solution {
    public int height(TreeNode root) {

        // Tree empty hai
        if (root == null) {
            return 0;
        }

        // Left subtree ki height
        int left = height(root.left);

        // Right subtree ki height
        int right = height(root.right);

        // Current node + maximum of left/right
        return 1 + Math.max(left, right);
    }
}h