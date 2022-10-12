public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeOneNodeThree = new TreeNode(3);
        TreeNode treeOneNodeTwo = new TreeNode(2);
        TreeNode treeOneRootNode = new TreeNode(1, treeOneNodeTwo, treeOneNodeThree);

        TreeNode treeTwoNodeThree = new TreeNode(3);
        TreeNode treeTwoNodeTwo = new TreeNode(2);
        TreeNode treeTwoRootNode = new TreeNode(1, treeTwoNodeTwo, treeTwoNodeThree);

        System.out.println("Example One : " + solution.isSameTree(treeOneRootNode, treeTwoRootNode));
    }
}
