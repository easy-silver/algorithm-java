package dataStructure.tree;

public class TreeClient {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n4 = t.createNode(null, 4, null);
        Node n5 = t.createNode(null, 5, null);
        Node n2 = t.createNode(n4, 2, n5);
        Node n3 = t.createNode(null, 3, null);
        Node n1 = t.createNode(n2, 1, n3);

        t.setRoot(n1);
        t.inOrder(t.getRoot());
        //t.preOrder(t.getRoot());
        //t.postOrder(t.getRoot());
    }
}
