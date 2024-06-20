# Non-Linear Data Structures 

## Getting Started

This project is a practical exercise on how to implement basic non-linear data structures in Java. It includes examples of trees and their various forms, demonstrating how to manage different versions using annotated tags in Git.

This repository refers to the second unit of Data Structures, where the first chapter covers non-linear data structures: Trees, Binary Trees, and Graphs.

## Requirements
- Java JDK 11 or higher
- Git 2.20 or higher

## Trees and Graphs

### Trees
A tree is a hierarchical data structure that consists of nodes connected by edges. Each tree has a root node, and each node can have zero or more child nodes. The main properties and operations for trees are:
- **Root:** The topmost node of the tree.
- **Leaf:** A node with no children.
- **Edge:** The connection between two nodes.
- **Path:** A sequence of nodes and edges connecting a node with a descendant.
- **Subtree:** A tree consisting of a node and its descendants.
- **Height:** The length of the longest path from a node to a leaf.
- **Depth:** The length of the path from the root to a node.

### Binary Trees
A binary tree is a type of tree where each node has at most two children, referred to as the left child and the right child. The main operations for a binary tree are:
- **Insert:** Add a node to the tree following specific rules.
- **Delete:** Remove a node from the tree.
- **Traverse:** Visit all nodes in a specific order (In-order, Pre-order, Post-order).
- **Search:** Find a node in the tree.

### Graphs
A graph is a collection of nodes (also called vertices) and edges connecting pairs of nodes. Graphs can be either directed or undirected. The main operations for graphs are:
- **Add Vertex:** Add a node to the graph.
- **Add Edge:** Connect two nodes with an edge.
- **Remove Vertex:** Remove a node and its connected edges from the graph.
- **Remove Edge:** Remove the connection between two nodes.
- **Traverse:** Visit all nodes in the graph (Depth-First Search, Breadth-First Search).
- **Search:** Find a node or a path in the graph.

## Binary Trees

### Binary Search Tree (BST)
A binary search tree is a binary tree where each node has a value, and the left subtree of a node contains only nodes with values less than the node's value, while the right subtree contains only nodes with values greater than the node's value.

#### Operations on Binary Search Tree
- **Insert:** Add a new node in the correct position.
- **Delete:** Remove a node and rearrange the tree.
- **Find Minimum:** Find the node with the smallest value.
- **Find Maximum:** Find the node with the largest value.
- **Search:** Find a node by its value.
- **In-Order Traversal:** Visit nodes in ascending order.

#### Binary Search Tree Class
The `BinarySearchTree` class implements the binary search tree with basic operations.

## Node and NodeGeneric Classes

### Node
The `Node` class is used to represent a single element in a tree or graph. It holds an integer value and references to its child nodes or adjacent nodes.

### NodeGeneric
The `NodeGeneric` class is a generic version of the `Node` class. It can hold any type of data (specified by the generic type parameter `T`) and references to its child nodes or adjacent nodes.

```java
public class Node {
    public int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

public class NodeGeneric<T> {
    T data;
    NodeGeneric<T> left;
    NodeGeneric<T> right;

    public NodeGeneric(T data) {
        this.data = data;
    }
}
```


## Execution of Projects with Unit Tests

To install and use JUnit without Maven or Gradle in a simple Java project in VS Code, follow these steps:

### Requirements

- Java JDK 11 or higher
- Git 2.20 or higher

### Setup Instructions

1. **Download JUnit and Hamcrest**: Ensure you have the necessary JAR files for JUnit and Hamcrest. You can download them from the following links:
   - [JUnit JAR](https://repo1.maven.org/maven2/org/junit/jupiter/junit-jupiter-api/5.7.0/junit-jupiter-api-5.7.0.jar)
   - [Hamcrest JAR](https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar)
   - [API Guardian JAR](https://repo1.maven.org/maven2/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar)
   - [JUnit Platform Console Standalone JAR](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0.jar)

2. **Create a folder for the libraries**: Create a folder named `lib` in the root directory of your project and place the downloaded JAR files in this folder.

3. **Configure VS Code**:
   - Open your project in VS Code.
   - Open the `settings.json` file of your project (you can create one in the `.vscode` directory if it doesn't exist).
   - Add the following configuration to include the JARs in the classpath:

```json
{
  "java.project.referencedLibraries": [
    "lib/**/*.jar"
  ]
}
```

4. **Write the test code**:
   - Ensure that your folder structure is similar to this:

```
project-root
│
├── lib
│   ├── apiguardian-api-1.1.0.jar
│   ├── hamcrest-core-1.3.jar
│   ├── junit-jupiter-api-5.7.0.jar
│   ├── junit-platform-console-standalone-1.7.0.jar
│
├── src
│   ├── main
│   │   └── ... (your source code)
│   ├── test
│       └── ... (your test code)
│
├── bin
│   └── ... (compiled files)
```

### Compile and Run Tests

1. **Compile the Java files**:
   Open a terminal in VS Code and navigate to the root folder of your project. Then, run the following command to compile your Java files, including the JARs in the classpath:

```sh
javac -cp "lib/*" -d bin src/main/Materia/Controllers/ArbolBinario.java src/main/Materia/Models/Node.java src/test/Materia/ArbolBinarioTest.java src/main/App.java
```

2. **Run the tests using JUnit**:
   After compiling the files, run the following command to execute the tests using JUnit:

```sh
java -cp "lib/*:bin" org.junit.platform.console.ConsoleLauncher --classpath bin --scan-classpath
```

### Example Output

You should see output similar to the following if your tests run successfully:

```
IN-ORDER TRAVERSAL: 1 2 3
PRE-ORDER TRAVERSAL: 1 3 2
```

This procedure should allow you to compile and run your unit tests using JUnit in a Java project without Maven or Gradle.


## Contribute

To contribute to this project, please create a fork and send a pull request, or simply open an issue with your comments and suggestions.

## Authors

- [PABLO TORRES] - Initial development


