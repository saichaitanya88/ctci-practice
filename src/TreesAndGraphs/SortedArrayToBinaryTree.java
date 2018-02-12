package TreesAndGraphs;

public class SortedArrayToBinaryTree {
    public static void main(String[] args){
        int[] items = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 };
        Node balancedTree = createMinimalBST(items);
        boolean isBalanced = CheckIfTreeIsBalanced.isBalanced(balancedTree);
        int minDepth = CheckIfTreeIsBalanced.minDepth(balancedTree);
        int maxDepth = CheckIfTreeIsBalanced.maxDepth(balancedTree);
        System.out.println("is balancedTree balanced?: " + isBalanced +
                " // min: " + minDepth +
                " max: " + maxDepth);
    }
    public static Node addToTree(int items[], int start, int end){
        if (end < start)
            return null;
        int mid = (start + end) / 2;
        Node node = new Node("" + items[mid]);
        node.left = addToTree(items, start, mid-1);
        node.right = addToTree(items, mid+1, end);
        return node;
    }
    public static Node createMinimalBST(int items[]){
        return addToTree(items, 0, items.length - 1);
    }
}
