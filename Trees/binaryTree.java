package Trees;

import java.util.Scanner;

public class binaryTree {

    public binaryTree() {}

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to add left of " + node.value + "?");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the left value of " + node.value + ":");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to add right of " + node.value + "?");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the right value of " + node.value + ":");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {           // ✔️ Correct Base Case
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binaryTree tree = new binaryTree();
        tree.populate(scanner);
        tree.display();
    }
}
