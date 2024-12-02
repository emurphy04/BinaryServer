package com.binarytree.server.model;

public class BinaryTree {

    private Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public String toSerializedString() {
        return serialize(root);
    }

    private String serialize(Node node) {
        if (node == null) {
            return "null";
        }
        return "{" +
                "\"value\":" + node.value + "," +
                "\"left\":" + serialize(node.left) + "," +
                "\"right\":" + serialize(node.right) +
                "}";
    }

    private static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }
}