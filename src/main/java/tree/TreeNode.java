package tree;

public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;


    public TreeNode() {
    }
    public TreeNode(int val) {
        this.value = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.value = val;
        this.left = left;
        this.right = right;
    }




}
