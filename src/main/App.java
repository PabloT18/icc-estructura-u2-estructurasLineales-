package main;

import main.Materia.Controllers.AVLTree;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Graph;
import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estructuras de Datos NO Lineanes\n");

        // runArbolesBinarios();
        // runrunArbolesBinarios();

        Graph graph = new Graph();

        // Añadir nodos
        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);

        // Añadir aristas
        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node3);
        graph.addEdge(node3, node4);
        graph.addEdge(node4, node5);

        // Imprimir el grafo
        graph.printGraph();

        // Recorridos DFS y BFS
        System.out.println("Depth First Traversal starting from vertex 1:");
        graph.DFS(node1);

        System.out.println("\nBreadth First Traversal starting from vertex 1:");
        graph.BFS(node1);
    }

    private static void runrunArbolesBinarios() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = { 40, 20, 60, 10, 30, 50, 70, 5, 15, 55 };
        // int[] valores = { 47, 23, 65, 14, 31, 52, 78, 19, 49 };
        // int[] valores = { 55, 34, 72, 25, 48, 61, 80, 18, 30, 68 };
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        arbolBinario.printTree();
        ArbolRecorridos recorridos = new ArbolRecorridos();
        System.out.print("IN-ORDER TRAVERSAL: ");
        recorridos.inOrderTraversal(arbolBinario.getRoot());
        System.out.println();
        System.out.print("PRE-ORDER TRAVERSAL: ");
        recorridos.preOrderTraversal(arbolBinario.getRoot());
        System.out.println();
        System.out.print("POST-ORDER TRAVERSAL: ");
        recorridos.postOrderTraversal(arbolBinario.getRoot());
        System.out.println();
    }

    // private static void runArbolesBinarios() {

    // System.out.println("\t\tArboles Binarios\n");

    // Node root = new Node(40);
    // root.setLeft(new Node(20));
    // root.setRight(new Node(3));

    // root.getLeft().setLeft(new Node(4));
    // root.getLeft().setRight(new Node(5));

    // root.getRight().setRight(new Node(6));

    // root.getLeft().getLeft().setLeft(new Node(7));
    // root.getLeft().getRight().setLeft(new Node(8));

    // ArbolRecorridos arbolBinario = new ArbolRecorridos();

    // System.out.print("IN-ORDER TRAVERSAL: ");
    // arbolBinario.inOrderTraversal(root);
    // System.out.println();

    // System.out.print("PRE-ORDER TRAVERSAL: ");
    // arbolBinario.preOrderTraversal(root);
    // System.out.println();

    // System.out.print("PRE-ORDER TRAVERSAL: ");
    // arbolBinario.preOrderIterative(root);
    // System.out.println();

    // System.out.print("POST-ORDER TRAVERSAL: ");
    // arbolBinario.postOrderTraversal(root);
    // System.out.println();
    // System.out.print("POST-ORDER TRAVERSAL: ");
    // arbolBinario.postOrderIterative(root);
    // System.out.println();

    // AVLTree tree = new AVLTree();

    // int[] values = { 20, 10, 30, 5, 15, 25, 35, 2, 7, 12, 17, 22, 27, 32, 37 };

    // for (int value : values) {
    // tree.insert(value);
    // }

    // System.out.println("Inorder traversal of the constructed AVL tree is:");
    // tree.inOrder();
    // AVLTree tree = new AVLTree();

    // int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

    // for (int value : values) {
    // tree.insert(value);
    // }

    // // System.out.println("Inorder traversal of the constructed AVL tree is:");
    // // tree.inOrder();

}
