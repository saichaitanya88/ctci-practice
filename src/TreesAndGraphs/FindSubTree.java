package TreesAndGraphs;

public class FindSubTree {
    public static void main(String[] args){
        Node root = CheckIfTreeIsBalanced.imbalancedTree();
        Node sub = root.left.left;
        System.out.println("containsTree: " + containsTree(root, sub));

        sub = CheckIfTreeIsBalanced.balancedTree();
        System.out.println("containsTree: " + containsTree(root, sub));

    }
    public static boolean containsTree(Node root, Node sub){
        if(sub == null) return true;
        else return subTree(root, sub);
    }
    public static boolean subTree(Node root, Node sub){
        if (root == null)
            return false;
        if (root.data == sub.data){
            if(matchTree(root, sub)){
                return true;
            }
        }
        return (subTree(root.left, sub) || subTree(root.right, sub));
    }
    public static boolean matchTree(Node root, Node sub){
        if (root == null && sub == null)
            return true; // both are null
        if (root == null || sub == null)
            return false; // either of them is null but not the other
        if (root.data != sub.data)
            return false;
        return matchTree(root.left, sub.left) && matchTree(root.right, sub.right);
    }
}
