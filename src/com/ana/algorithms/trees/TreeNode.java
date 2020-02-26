package com.ana.algorithms.trees;

public class TreeNode {
    private TreeNode left, right;
    private String data;

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isRoot() {
        if (this.left != null || this.right != null) return true;
        return false;
    }

    public boolean isLeaf() {
        if (this.left == null && this.right == null) return true;
        return false;
    }

    public boolean hasLeftChild() {
        if (this.left != null) return true;
        return false;
    }

    public boolean hasRightChild() {
        if (this.right != null) return true;
        return false;
    }
}
