package TreesAndGraphs;

public class FindNextNode {
    public static void main(String[] args){
        Node n = inOrderSuccessor(CheckIfTreeIsBalanced.balancedTree().right);
        System.out.println("node n: " + n.data);
        n = inOrderSuccessor(CheckIfTreeIsBalanced.imbalancedTree().left);
        System.out.println("node n: " + n.data);
    }

    public static Node inOrderSuccessor(Node node){
        if (node != null){
            Node successor;
            if (node.parent == null || node.right != null){
                successor = leftMostChild(node.right);
            }
            else{
                while((successor = node.parent) != null){
                    if (successor.left == node)
                        break;
                    node = successor;
                }
            }
            return successor;
        }
        return null;
    }

    public static Node leftMostChild(Node node){
        if (node == null) return null;
        while(node.left != null)
            node = node.left;
        return node;
    }
}
