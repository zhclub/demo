package com.zh.demo.exercism;

import com.zh.demo.model.TreeNode;

public class BinaryTree {

    public static void main(String[] args) {
        int[] nums = {3, 2, 8, 4, 7, 6, 9, 1, 0};

        TreeNode<Integer> head = new TreeNode<>();
        head.setData(5);

        new BinaryTree().createTree(head, nums);

        System.out.println(head.toString());
    }

    private void createTree(TreeNode<Integer> head, int[] nums) {

        for (int num : nums) {
            add(head, num);
        }

    }

    private void add(TreeNode<Integer> head, int num) {
        TreeNode<Integer> node = head;

        TreeNode<Integer> tmp = new TreeNode<>(num);

        while (true) {
            if (num > node.getData()) {
                if (node.getRight() == null) {
                    node.setRight(tmp);
                    return;
                } else {
                    node = node.getRight();
                }
            } else {
                if (node.getLeft() == null) {
                    node.setLeft(tmp);
                    return;
                } else {
                    node = node.getLeft();
                }
            }
        }
    }

}
