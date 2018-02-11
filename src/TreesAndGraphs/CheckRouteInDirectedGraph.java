package TreesAndGraphs;

import java.util.Stack;

public class CheckRouteInDirectedGraph {
    public static void main(String[] args){
        Graph graph = testGraph();
        GraphNode start = graph.find("a");
        GraphNode end = graph.find("h");
        System.out.println("path from "  + start.data + " -> " + end.data + " exists? " + search(graph, start, end));


        start = graph.find("f");
        end = graph.find("a");
        System.out.println("path from "  + start.data + " -> " + end.data + " exists? " + search(graph, start, end));
    }

    public static GraphNode find(Graph graph, String data){
        for(GraphNode node : graph.nodes){
            if (node.data.equals(data)){
                return node;
            }
        }
        return null;
    }

    // searches using breadth first
    public static boolean search(Graph graph, GraphNode start, GraphNode end){
        Stack<GraphNode> nodesToCheck = new Stack<>();
        // Set all nodes to Unvisited
        for(GraphNode n : graph.nodes){
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
        Graph graph = new Graph();
        GraphNode a = new GraphNode("a");
        GraphNode b = new GraphNode("b");
        GraphNode c = new GraphNode("c");
        GraphNode d = new GraphNode("d");
        GraphNode e = new GraphNode("e");
        GraphNode f = new GraphNode("f");
        GraphNode g = new GraphNode("g");
        GraphNode h = new GraphNode("h");

        // paths
        a.add(b);
        b.add(f);
        b.add(e);
        e.add(c);
        e.add(g);
        f.add(d);
        d.add(e);
        g.add(h);

        // add nodes to graph
        graph.nodes.add(a);
        graph.nodes.add(b);
        graph.nodes.add(c);
        graph.nodes.add(d);
        graph.nodes.add(e);
        graph.nodes.add(f);
        graph.nodes.add(g);
        graph.nodes.add(h);

        return graph;
    }
}