package com.Dsa.BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class  BinarySearchTree {


    Node root;      // root node of BST
    int count = 0;  // to store total number of nodes
    boolean flag;   // used to check duplicate insertion

    // =========================
    // ADD ELEMENT
    // =========================

    // Public method to add element
    public boolean add(int key){
        flag = true;                 // assume element will be added
        root = add(root, key);       // recursive call
        return flag;                 // return false if duplicate
    }

    // Recursive method to insert node
    public Node add(Node n, int key){
        // If tree/subtree is empty, create new node
        if (n == null){
            n = new Node(key);
            count++;                 // increase size
            return n;
        }

        // If key is smaller, go to left subtree
        if (key < n.key)
            n.left = add(n.left, key);

            // If key is greater, go to right subtree
        else if (key > n.key)
            n.right = add(n.right, key);

            // If key already exists
        else
            flag = false;

        return n;
    }

    // =========================
    // REMOVE ELEMENT
    // =========================

    // Public remove method
    public void remove(int key){
        root = remove(root, key);
    }

    // Recursive remove method
    public Node remove(Node n, int key){

        // If tree is empty
        if (n == null)
            return null;

        // Search in left subtree
        if (key < n.key)
            n.left = remove(n.left, key);

            // Search in right subtree
        else if(key > n.key)
            n.right = remove(n.right, key);

            // Node found
        else {

            // Case 1: Node has no left child
            if (n.left == null){
                count--;
                return n.right;
            }

            // Case 2: Node has no right child
            else if (n.right == null){
                count--;
                return n.left;
            }

            // Case 3: Node has two children
            else {
                // Replace with minimum element from right subtree
                n.key = minEle(n.right);

                // Delete that minimum element
                n.right = remove(n.right, n.key);
            }
        }
        return n;
    }

    // =========================
    // FIND MINIMUM ELEMENT
    // =========================

    public int minEle(Node n){
        int min = n.key;

        // Keep going left to find smallest value
        while (n.left != null){
            min = n.left.key;
            n = n.left;
        }
        return min;
    }

    // =========================
    // LEVEL ORDER TRAVERSAL
    // =========================
//for level order traversing , bst use queue .. add root after deleting root add left and right element of the root,after that remove left ele,next remove right ele.. so on..

    // Breadth First Search using Queue
    public void levelOrder(){

        if (root == null) return;

        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);

        while (!q.isEmpty()){

            Node n = q.poll();          // remove element from queue
            System.out.print(n.key + " ");

            // Add left child
            if (n.left != null)
                q.add(n.left);

            // Add right child
            if (n.right != null)
                q.add(n.right);
        }
    }

    // =========================
    // SIZE OF TREE
    // =========================

    public int size(){
        return count;
    }

    // =========================
    // TRAVERSALS
    // =========================

    // PreOrder: Root -> Left -> Right
    public void PreOrder(){
        PreOrder(root);
    }

    // PostOrder: Left -> Right -> Root
    public void PostOrder(){
        PostOrder(root);
    }

    // InOrder: Left -> Root -> Right
    public void InOrder(){
        InOrder(root);
    }

    // Recursive PreOrder
    public void PreOrder(Node n){
        if(n == null)
            return;

        System.out.print(n.key + " ");
        PreOrder(n.left);
        PreOrder(n.right);
    }

    // Recursive PostOrder
    public void PostOrder(Node n){
        if(n == null)
            return;

        PostOrder(n.left);
        PostOrder(n.right);
        System.out.print(n.key + " ");
    }

    // Recursive InOrder
    public void InOrder(Node n){
        if(n == null)
            return;

        InOrder(n.left);
        System.out.print(n.key + " ");
        InOrder(n.right);
    }
}