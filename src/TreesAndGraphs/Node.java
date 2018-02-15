package TreesAndGraphs;

public class Node{
    public Node right;
    public Node left;
    public Node parent;
    public String data;
    public boolean visited;
    public Node(String d, Node parent){
        this.data = d;
        this.parent = parent;
    }
    public void visit(){
        visited = true;
    }
}

