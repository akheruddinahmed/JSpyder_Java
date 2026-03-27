package com.Dsa.BinarySearchTree;

public class UserProgram {

    public static void main(String[] args) {

        BinarySearchTree b = new BinarySearchTree();

        // ======================
        // INSERT OPERATIONS
        // ======================

        System.out.println("Adding Elements:");
        b.add(50);
        b.add(30);
        b.add(10);
        b.add(40);
        b.add(70);
        b.add(60);
        b.add(90);

        // Try duplicate

        System.out.println("Adding duplicate 50: " + b.add(50));

        // ======================
        // DISPLAY SIZE
        // ======================

        System.out.println("Size of Tree: " + b.size());

        // ======================
        // TRAVERSALS
        // ======================

        System.out.print("PreOrder: ");
        b.PreOrder();
        System.out.println();

        System.out.print("PostOrder: ");
        b.PostOrder();
        System.out.println();

        System.out.print("InOrder: ");
        b.InOrder();
        System.out.println();

        System.out.print("LevelOrder: ");
        b.levelOrder();
        System.out.println();

        // ======================
        // REMOVE OPERATIONS
        // ======================

        // Remove leaf node
        System.out.println("\nRemoving leaf node (10)");
        b.remove(10);
        b.InOrder();
        System.out.println();

        // Remove node with one child
        System.out.println("Removing node with one child (30)");
        b.remove(30);
        b.InOrder();
        System.out.println();

        // Remove node with two children
        System.out.println("Removing node with two children (70)");
        b.remove(70);
        b.InOrder();
        System.out.println();

        // Remove root
        System.out.println("Removing root node (50)");
        b.remove(50);
        b.InOrder();
        System.out.println();

        // ======================
        // FINAL SIZE
        // ======================

        System.out.println("Final Size: " + b.size());
    }
}