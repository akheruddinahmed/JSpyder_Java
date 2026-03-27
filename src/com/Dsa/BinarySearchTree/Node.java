package com.Dsa.BinarySearchTree;

// Node class represents each element in the BST
public class Node {

    Node left;   // reference to left child
    int key;     // value stored in node
    Node right;  // reference to right child

    // Constructor to create a node with only key
    Node(int key){
        this.key = key;
    }

    // Constructor to create node with left child, key, and right child
    public Node(Node left, int key, Node right) {
        this.left = left;
        this.key = key;
        this.right = right;
    }
}

//This topic answer should be given from Ramana sirs notes
//aggregation
//polymorphism
//has a relation
