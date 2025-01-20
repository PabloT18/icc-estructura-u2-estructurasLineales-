package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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

    public void addEdgeUni(NodeGraph src, NodeGraph des) {
        src.addNeighbor(des);
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

    // Método DFS
    public void dfs(NodeGraph start) {
        Set<NodeGraph> visited = new HashSet<>();
        System.out.println("DFS desde el nodo " + start.getValue() + ":");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(NodeGraph node, Set<NodeGraph> visited) {
        if (visited.contains(node)) {
            return;
        }

        System.out.print(node.getValue() + " ");
        visited.add(node);

        for (NodeGraph neighbor : node.getNeighbors()) {
            dfsHelper(neighbor, visited);
        }
    }

    public boolean getDFS(NodeGraph start, NodeGraph destino) {
        Set<NodeGraph> visitados = new HashSet<>();
        System.out.println("DFS desde el nodo " + start.getValue() + " hasta el nodo " + destino.getValue() + " :");
        boolean encontrado = getDFSUtil(start, destino, visitados);
        System.out.println();
        return encontrado;
    }

    private boolean getDFSUtil(NodeGraph node, NodeGraph destino,
            Set<NodeGraph> visitados) {
        if (visitados.contains(node)) {
            return false;
        }

        System.out.print(node.getValue() + " ");
        visitados.add(node);

        if (node.equals(destino)) {
            return true;
        }

        for (NodeGraph neighbor : node.getNeighbors()) {
            if (getDFSUtil(neighbor, destino, visitados)) {
                return true;
            }
        }

        return false;
    }

    // Método BFS
    public void bfs(NodeGraph start) {
        Set<NodeGraph> visited = new HashSet<>();
        Queue<NodeGraph> queue = new LinkedList<>();

        System.out.println("BFS desde el nodo " + start.getValue() + ":");
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            NodeGraph current = queue.poll();
            System.out.print(current.getValue() + " ");

            for (NodeGraph neighbor : current.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}