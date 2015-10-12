package objects;

public class BinarySearchTree {

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
