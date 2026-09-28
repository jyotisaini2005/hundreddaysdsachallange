class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Base case
        if (root == null) {
            return null;
        }

        // Agar current node p ya q hai
        if (root == p || root == q) {
            return root;
        }

        // Left subtree mein search
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // Right subtree mein search
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Dono sides mein node mili
        if (left != null && right != null) {
            return root;
        }

        // Jo side null nahi hai, uska result return karo
        if (left != null) {
            return left;
        }

        return right;
    }
}
l