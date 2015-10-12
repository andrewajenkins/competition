package objects;

public class BinarySearchTree {

    public static TreeNode iterativeTreeSearch(TreeNode x, int k) {
        while(x != null && k != x.key) {
            if(k < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return x;
    }

    public static TreeNode treeSearch(TreeNode x, int k) {
        if(x == null || k == x.key) {
            return x;
        }
        if(k < x.key) {
            return treeSearch(x.left, k);
        } else {
            return treeSearch(x.right, k);
        }
    }
}
