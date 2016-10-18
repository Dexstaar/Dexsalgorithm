package com.dexstaar.algorithm.tree;

public class BinarySearchTree {
    Node root;

    public static void main(String[] args) {
        BinarySearchTree bsTree = new BinarySearchTree();

        bsTree.addNode(50, "Boss");
        bsTree.addNode(25, "Vice Pres");
        bsTree.addNode(15, "Office Manager");
        bsTree.addNode(30, "Seceretary");
        bsTree.addNode(75, "Sales Manager");
        bsTree.addNode(85, "Salesman 1");

        System.out.println("### inOrderTraverse ###");
        bsTree.inOrderTraverseTree(bsTree.root);
        System.out.println("#######################");

        System.out.println("### preOrderTraverse ###");
        bsTree.preOrderTraverseTree(bsTree.root);
        System.out.println("#######################");

        System.out.println("### postOrderTraverse ###");
        bsTree.postOrderTraverseTree(bsTree.root);
        System.out.println("#######################");
    }

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);

        if(root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;

            while(true) {
                parent = focusNode;

                if(key < focusNode.key) {
                    focusNode = focusNode.leftChild;

                    if(focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //left -> self -> right
    public void inOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    //self -> left -> right
    public void preOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    //left -> right -> self
    public void postOrderTraverseTree(Node focusNode) {
        if(focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;

        while(focusNode.key != key) {
            if(key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if(focusNode == null) {
                return null;
            }
        }

        if(focusNode == null) {
            return null;
        }

        return focusNode;
    }

}
