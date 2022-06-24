class Node {
    int data;
    Node left;
    Node right;
}

class BST {
    public Node createNode(int k) {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
    
    public Node insert(Node node, int value) {
        if (node == null) {
            return createNode(value);
        }
        
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.right) {
            node.right = insert(node.right, value);
        }
        return node;
    }
}

class Main {
    public static void main(String args[]) {
        BST bst = new BST();
        Node root = null;
        
        root = bst.insert(root, 8);
    }
}