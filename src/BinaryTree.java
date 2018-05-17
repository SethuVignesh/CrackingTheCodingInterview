import static java.lang.Integer.max;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}



public class BinaryTree {
    Node root;
    public static void main(String args[])
    {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.left.right.right = new Node(5);

        System.out.println("maxLevel of a tree"+maxLevel(tree_level.root));
    }

    private static int maxLevel(Node root) {

        if(root==null) return -1;
        return max(maxLevel(root.left),maxLevel(root.right))+1;
    }



}
