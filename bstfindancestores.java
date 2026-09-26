class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {

            // Dono nodes left side mein hain
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }

            // Dono nodes right side mein hain
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }

            // Ek left aur ek right hai
            // ya root hi p/q hai
            else {
                return root;
            }
        }

        return null;
    }
}