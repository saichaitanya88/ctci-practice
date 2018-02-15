package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class BinarySearchTreeToLinkedLists {
    public static void main(String[] args){
        Node root = CheckIfTreeIsBalanced.balancedTree();
        ArrayList<LinkedList<Node>> linkedLists = levelsToLinkedLists(root);
        for(LinkedList<Node> list : linkedLists){
            printList(list);
        }

        System.out.println();

        root = CheckIfTreeIsBalanced.imbalancedTree();
        linkedLists = levelsToLinkedLists(root);
        for(LinkedList<Node> list : linkedLists){
            printList(list);
        }
    }

    public static ArrayList<LinkedList<Node>> levelsToLinkedLists(Node root){
        int level = 0;
        ArrayList<LinkedList<Node>> result = new ArrayList<>();
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        result.add(level, list);
        while(true){
            // Level Traversal
            list = new LinkedList<>();
            for(int i = 0; i < result.get(level).size(); i++){
                Node node = result.get(level).get(i);
                if (node != null){
                    if (node.left != null) list.add(node.left);
                    if (node.right != null) list.add(node.right);
                }
            }

            // We are done if all items are cleared
            if (list.size() == 0)
                break;

            // items in the list are added as current level's linkedlist
            result.add(level+1, list);
            // go to next level
            level++;
        }
        return result;
    }


    public static void printList(LinkedList<Node> list){
        while(list.peekFirst() != null){
            System.out.print("" + list.peekFirst().data + " -> ");
            list.removeFirst();
        }
        System.out.println("");
    }
}