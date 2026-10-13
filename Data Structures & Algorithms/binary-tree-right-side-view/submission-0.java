class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        // Start BFS from the root
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                // Take the next node from the front of the queue
                TreeNode node = queue.poll();
                //is the last node in the current level,
                if (i == size - 1) {
                    result.add(node.val);
                }
                // Add the left
                if (node.left != null) {
                    queue.offer(node.left);
                }
                // Add the right
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return result;
    }
}