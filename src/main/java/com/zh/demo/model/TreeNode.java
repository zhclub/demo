package com.zh.demo.model;

import com.alibaba.fastjson.JSON;
import com.zh.demo.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TreeNode <T> {

    private T data;

    private TreeNode<T> left;

    private TreeNode<T> right;

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode() {
    }

    public T getData() {
        return data;
    }

    public TreeNode<T> setData(T data) {
        this.data = data;
        return this;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> setLeft(TreeNode<T> left) {
        this.left = left;
        return this;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public TreeNode<T> setRight(TreeNode<T> right) {
        this.right = right;
        return this;
    }

    @Override
    public String toString() {
        // 前序遍历

        List<T> list = new ArrayList<>();
        preorder(list, this);
        return list.toString();
    }

    private void preorder(List<T> list, TreeNode<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        preorder(list, treeNode.left);
        list.add(treeNode.data);
        preorder(list, treeNode.right);
    }
}
