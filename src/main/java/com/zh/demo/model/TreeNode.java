package com.zh.demo.model;

public class TreeNode <T> {

    private T data;

    private TreeNode left;

    private TreeNode right;

    public T getData() {
        return data;
    }

    public TreeNode<T> setData(T data) {
        this.data = data;
        return this;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode<T> setLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode<T> setRight(TreeNode right) {
        this.right = right;
        return this;
    }
}
