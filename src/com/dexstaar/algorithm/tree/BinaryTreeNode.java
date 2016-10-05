package com.dexstaar.algorithm.tree;

public class BinaryTreeNode {
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private int value;

    public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int value){
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public BinaryTreeNode getLeft(){
        return left;
    }

    public BinaryTreeNode getRight(){
        return right;
    }

    public int getValue() {
        return value;
    }
}
