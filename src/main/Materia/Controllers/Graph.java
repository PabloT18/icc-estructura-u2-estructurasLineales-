package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.Materia.Models.NodeGraph;

public class Graph {
    private List<NodeGraph> nodes;

    // Constructor
    public Graph() {
        this.nodes = new ArrayList<>();
    }

    // Método para añadir un nodo
    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }

    // Método para añadir una arista
    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src); // Para grafos no dirigidos
    }

    // Método para imprimir el grafo
    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("Vertex " + node.getValue() + ":");
            for (NodeGraph neighbor : node.getNeighbors()) {
                System.out.print(" -> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    // Método de búsqueda en profundidad (DFS)
    public void DFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        DFSUtil(startNode, visited);
    }

    private void DFSUtil(NodeGraph node, boolean[] visited) {
        visited[node.getValue() - 1] = true; // Adjusted index for 1-based node values
        System.out.print(node.getValue() + " ");

        for (NodeGraph neighbor : node.getNeighbors()) {
            if (!visited[neighbor.getValue() - 1]) { // Adjusted index for 1-based node values
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Método de búsqueda en anchura (BFS)
    public void BFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        LinkedList<NodeGraph> queue = new LinkedList<>();

        visited[startNode.getValue() - 1] = true; // Adjusted index for 1-based node values
        queue.add(startNode);

        while (!queue.isEmpty()) {
            NodeGraph node = queue.poll();
            System.out.print(node.getValue() + " ");

            for (NodeGraph neighbor : node.getNeighbors()) {
                if (!visited[neighbor.getValue() - 1]) { // Adjusted index for 1-based node values
                    visited[neighbor.getValue() - 1] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}