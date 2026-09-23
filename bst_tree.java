class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        // Agar tree/subtree empty hai
        if (root == null) {
            return new TreeNode(val);
        }

        // Value chhoti hai -> left
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }

        // Value badi hai -> right
        else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}