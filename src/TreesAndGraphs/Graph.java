package TreesAndGraphs;

import java.util.ArrayList;

public class Graph {
    public ArrayList<GraphNode> nodes;
    public Graph(){
        nodes = new ArrayList<>();
    }
    public GraphNode find(String data){
        for(GraphNode node : nodes){
            if (node.data.equals(data)){
                return node;
            }
        }
        return null;
    }
}
