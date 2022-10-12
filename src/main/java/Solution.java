public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // both trees are null, return true
        if (p == null && q == null) {
            return true;
        }

        // one tree is null but the other is not
        else if (p == null || q == null) {
            return false;
        }

        // there is a value for each node
        // but the values are NOT equal
        else if (p.val != q.val) {
            return false;
        }

        // this is our recursive case
        // we continue to find equal values at each node
        else {
            // test left side of both
            // test right side of both
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
