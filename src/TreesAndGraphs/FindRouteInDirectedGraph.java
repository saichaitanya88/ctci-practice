package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class FindRouteInDirectedGraph {
    public static void main(String[] args){

    }

    // searches using breadth first
    public static boolean search(Graph g, GraphNode start, GraphNode end){
        Stack<GraphNode> nodesToCheck = new Stack<>();
        // Set all nodes to Unvisited
        for(GraphNode n : g.nodes){
            n.state = State.Unvisited;
        }

        start.state = State.Visiting;
        GraphNode node;
        nodesToCheck.push(start);
        while(!nodesToCheck.isEmpty()){
            node = nodesToCheck.pop();
            if (node != null){
                for (GraphNode adjacent : node.adjacentNodes){
                    if (adjacent.state != State.Unvisited)
                        continue;
                    if (adjacent == end){
                        return true;
                    }
                    adjacent.state = State.Visiting;
                    nodesToCheck.add(adjacent);
                }
                node.state = State.Visited;
            }
        }
        return false;
    }

    public static Graph testGraph(){
        Graph g = new Graph();
        g.nodes = new ArrayList<>();

        return g;
    }
}

enum State{
    Unvisited, Visited, Visiting
}