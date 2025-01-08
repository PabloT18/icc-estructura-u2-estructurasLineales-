# Implementación de Árboles Binarios en Java

Este documento describe la implementación de un árbol binario de búsqueda (BST) en Java, destacando sus principales características y métodos, así como explicaciones detalladas de su funcionamiento.

## Clase `ArbolBinario`

La clase `ArbolBinario` representa un árbol binario de búsqueda. Permite insertar valores y visualizar el árbol de forma estructurada.

### Principales Atributos
- **`root`**: Representa la raíz del árbol. Inicialmente es `null` y se actualiza conforme se insertan nodos.

```java
private Node root;
```

---

## Método `insert`

### Descripción
Este método inserta un nuevo valor en el árbol binario de búsqueda. Es recursivo, ya que desciende por el árbol hasta encontrar la posición correcta para el nuevo nodo, respetando las propiedades del BST:
- Los valores menores al nodo actual van al subárbol izquierdo.
- Los valores mayores al nodo actual van al subárbol derecho.

### Definición del Método
```java
public void insert(int value) {
    root = insert(root, value);
}

private Node insert(Node node, int value) {
    if (node == null)
        return new Node(value);

    if (value < node.getValue())
        node.setLeft(insert(node.getLeft(), value));
    else if (value > node.getValue())
        node.setRight(insert(node.getRight(), value));

    return node;
}
```

### Funcionamiento
1. **Caso Base:**
   - Si el nodo actual es `null`, significa que se ha encontrado la posición donde debe insertarse el nuevo valor. Se crea un nuevo nodo con el valor proporcionado y se retorna.

2. **Recursión:**
   - Si el valor a insertar es menor que el valor del nodo actual, el método se llama recursivamente para el subárbol izquierdo.
   - Si el valor a insertar es mayor, el método se llama recursivamente para el subárbol derecho.

3. **Actualización del árbol:**
   - Después de insertar el valor, se retorna el nodo actualizado para asegurar que el árbol conserve su estructura.

### Ventajas de la Recursión
- Simplifica el código al evitar el uso de bucles y pilas adicionales.
- Refleja directamente la naturaleza jerárquica y divisoria de un árbol binario.

### Ejemplo de Uso
```java
ArbolBinario arbol = new ArbolBinario();
arbol.insert(10);
arbol.insert(5);
arbol.insert(15);
```

El árbol después de estas inserciones tiene la siguiente estructura:
```
10
├── 5
└── 15
```

---

## Método `printTree`

### Descripción
Este método permite imprimir el árbol de forma visual y estructurada. Utiliza recursión para recorrer los subárboles izquierdo y derecho, representando cada nivel con sangrías y líneas para facilitar la lectura.

### Definición del Método
```java
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
```

### Funcionamiento
1. **Impresión del Nodo Actual:**
   - Imprime el valor del nodo actual con un prefijo que indica su nivel y si es hijo izquierdo o derecho.

2. **Recursión:**
   - Si el nodo tiene hijos, se llama recursivamente al subárbol izquierdo y luego al derecho.
   - Si un subárbol es nulo, imprime `null` en su lugar.

### Ejemplo de Uso
```java
ArbolBinario arbol = new ArbolBinario();
arbol.insert(10);
arbol.insert(5);
arbol.insert(15);
arbol.printTree();
```

**Salida:**
```
10
├── 5
└── 15
```

---

## Conclusión
La implementación del árbol binario de búsqueda utiliza recursión para simplificar operaciones como la inserción y la impresión. Estas herramientas son fundamentales para manejar datos jerárquicos de manera eficiente y clara. El método `insert` destaca por su elegancia y simplicidad al adherirse a las propiedades del BST, mientras que `printTree` facilita la comprensión visual de la estructura del árbol.

