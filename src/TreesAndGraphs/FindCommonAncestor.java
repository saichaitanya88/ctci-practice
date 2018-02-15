package TreesAndGraphs;

public class FindCommonAncestor {
    public static void main(String[] args){
        Node node = CheckIfTreeIsBalanced.imbalancedTree();
        Node a = node.left.left.left;
        Node b = node.left.right.left;
        Node ancestor = findAncestor(node, a, b);
        System.out.println("Ancestor for nodes: " + a.data + " & "  + b.data + " is " + ancestor.data);
    }
    public static Node findAncestor(Node root, Node a, Node b){
        if (contains(root.left, a) && contains(root.left,b)){
            return findAncestor(root.left, a,b);
        }
        if (contains(root.right, a) && contains(root.right, b)){
            return findAncestor(root.right, a,b);
        }
        return root;
    }

    public static boolean contains(Node root, Node node){
        if (root == null) return false;
        if (root == node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }
}
