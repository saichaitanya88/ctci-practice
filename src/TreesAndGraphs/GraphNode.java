package TreesAndGraphs;

import java.util.ArrayList;

public class GraphNode {
    public ArrayList<GraphNode> adjacentNodes;
    public State state;
    public String data;
    public GraphNode(String data){
        this.data = data;
        adjacentNodes = new ArrayList<>();
    }
    public void add(GraphNode node){
        adjacentNodes.add(node);
    }
}

enum State{
    Unvisited, Visited, Visiting
}