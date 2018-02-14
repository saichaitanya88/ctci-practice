package TreesAndGraphs;

public class CheckIfTreeIsBalanced {
    public static void main(String[] args){
        Node balancedTree = balancedTree();
        Node imbalancedTree = imbalancedTree();
        System.out.println("is balancedTree balanced?: " + isBalanced(balancedTree) +
                " // min: " + minDepth(balancedTree) +
                " max: " + maxDepth(balancedTree));
        System.out.println("is imbalancedTree balanced?: " + isBalanced(imbalancedTree) +
                " min: " + minDepth(imbalancedTree) +
                " max: " + maxDepth(imbalancedTree));
    }

    public static int maxDepth(Node root){
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static int minDepth(Node root){
        if (root == null){
            return 0;
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static boolean isBalanced(Node root){
        // difference between smallest and largest lengths should be less than 2
        return (maxDepth(root) - minDepth(root)) <= 1;
    }
    public static Node balancedTree(){
        //    a
        //  b   c
        // d e f g
        Node root = new Node("a", null);
        root.left = new Node("b", root);
        root.left.left = new Node("d", root.left);
        root.left.right = new Node("e", root.left);
        root.right = new Node("c", root);
        root.right.left = new Node("f", root.right);
        root.right.right = new Node("g", root.right);
        return root;
    }
    public static Node imbalancedTree(){
        //                a
        //        b               c
        //    d       e       f       .
        //  q   w   e   r   t   y   .   .
        // . . x . . . . . . . . . . . . .
        Node root = new Node("a", null);
        root.left = new Node("b", root);

        root.left.left = new Node("d", root.left);
        root.left.left.left = new Node("q",root.left.left);
        root.left.left.right = new Node("w", root.left.left);
        root.left.left.right.left = new Node("x",root.left.right);

        root.left.right = new Node("e",root.left);
        root.left.right.left = new Node("e", root.left.right);
        root.left.right.right = new Node("r", root.left.right);

        root.right = new Node("c", root);
        root.right.left = new Node("f", root.right);
        root.right.left.left = new Node("t", root.right.left);
        root.right.left.right = new Node("y", root.right.left);

        return root;
    }
}