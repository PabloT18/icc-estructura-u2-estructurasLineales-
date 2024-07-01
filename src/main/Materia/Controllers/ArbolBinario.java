package main.Materia.Controllers;

import main.Materia.Models.Node;

public class ArbolBinario {

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    // Método para insertar un nodo y equilibrar el árbol
    public Node insert(Node node, int value) {
        // Realizar inserción normal de BST
        if (node == null)
            return new Node(value);

        if (value < node.getValue())
            node.setLeft(insert(node.getLeft(), value));
        else if (value > node.getValue())
            node.setRight(insert(node.getRight(), value));
        // No se permiten valores duplicados en el árbol AVL
        return node;
    }

    public void printTree() {
        printTreeNode2(root, "", true);
    }

    public void printTreeNode2(Node root, String prefix, boolean isLeft) {

        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode2(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode2(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }

    public Node getRoot() {
        return root;
    }
}
