class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // The biggest value seen so far is the root's value
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        // If the current node is greater than or equal to the biggest value 
        if (node.val >= maxSoFar) {
            count = 1;
        }
        maxSoFar = Math.max(maxSoFar, node.val);
        
        // Recursively count good nodes in the left subtree
        count += dfs(node.left, maxSoFar);
        // Recursively count good nodes in the right subtree
        count += dfs(node.right, maxSoFar);
        return count;
    }
}