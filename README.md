# Estructuras de Datos No Lineales

## Getting Started

Este proyecto es un ejercicio práctico sobre cómo implementar estructuras de datos no lineales en Java. Incluye ejemplos de árboles y grafos, así como los algoritmos más comunes asociados a estas estructuras.

Este repositorio se refiere a la tercera unidad de Estructuras de Datos, donde se cubren estructuras de datos no lineales: Árboles y Grafos.

## Requisitos
- Java JDK 11 o superior
- Git 2.20 o superior

## Árboles

### Introducción
Un árbol es una estructura de datos no lineal que organiza los datos en una jerarquía. Los nodos de un árbol están conectados mediante enlaces (aristas) y tienen las siguientes características principales:
- Un nodo raíz (root) que no tiene padre.
- Cada nodo puede tener cero o más nodos hijos.
- No hay ciclos.

Los tipos de árboles incluidos en este proyecto son:
- **Árbol Binario:** Cada nodo puede tener como máximo dos hijos.
- **Árbol de Búsqueda Binaria (BST):** Un árbol binario donde los valores a la izquierda de un nodo son menores, y los valores a la derecha son mayores.

#### Clase `Node`
La clase `Node` implementa un nodo de árbol binario, con atributos para almacenar el valor, los hijos izquierdo y derecho, y la altura del nodo.

```java
package main.Materia.Models;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
```

### Operaciones comunes en Árboles
- **Inserción**: Insertar un nodo en la ubicación adecuada.
- **Búsqueda**: Encontrar un nodo con un valor específico.
- **Recorridos**:
  - Preorden (Root, Left, Right)
  - Inorden (Left, Root, Right)
  - Postorden (Left, Right, Root)
- **Eliminación**: Remover un nodo y ajustar el árbol para mantener sus propiedades.

## Grafos

### Introducción
Un grafo es una estructura de datos no lineal que consiste en nodos (vértices) conectados mediante enlaces (aristas). Los grafos pueden ser:
- **Dirigidos** o **No Dirigidos**: Dependiendo de si las aristas tienen una dirección definida.
- **Ponderados** o **No Ponderados**: Dependiendo de si las aristas tienen un peso asociado.

#### Clase `NodeGraph`
La clase `NodeGraph` implementa un nodo para representar un vértice en un grafo, con una lista de vecinos que representa las conexiones.

```java
package main.Materia.Models;

import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    private int value;
    private List<NodeGraph> neighbors;

    public NodeGraph(int value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    public int getValue() {
        return value;
    }

    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(NodeGraph neighbor) {
        this.neighbors.add(neighbor);
    }
}
```

### Operaciones comunes en Grafos
- **Inserción de Vértices y Aristas**: Agregar nodos y conexiones entre ellos.
- **Recorridos**:
  - DFS (Depth-First Search)
  - BFS (Breadth-First Search)
- **Detección de Ciclos**: Determinar si el grafo contiene ciclos.
- **Cálculo de Rutas**: Encontrar la ruta más corta entre dos nodos usando algoritmos como Dijkstra o Bellman-Ford.

## Comparación: Árboles vs Grafos

| Característica        | Árboles                      | Grafos                              |
|------------------------|-------------------------------|-------------------------------------|
| **Estructura**         | Jerárquica                   | General                            |
| **Ciclos**             | No permitidos                | Permitidos                         |
| **Recorridos**         | Preorden, Inorden, Postorden | DFS, BFS                           |
| **Relaciones**         | Padre-Hijo                   | Arbitrarias                        |
| **Uso Típico**         | Representar jerarquías       | Representar redes o conexiones     |

## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

