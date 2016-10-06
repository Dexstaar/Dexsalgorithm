/*package com.dexstaar.algorithm.tree;

public class BinaryTree {
    Node root;

    public void addNode(int key, String name){
        Node newNode = newNode(key, name);

        if (root == null) {
            root = newNode;
        }else{
            Node focusNode = root;

            Node parent;

            while (true) {
                parent = focusNode;

                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;

                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
            }
        }
    }
}

class Node{
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name){
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return name + " has a key " + key;
    }
}
*/