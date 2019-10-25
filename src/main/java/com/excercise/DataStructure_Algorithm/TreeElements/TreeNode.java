package com.excercise.DataStructure_Algorithm.TreeElements;

/**
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 201909 10:34
 */
public class TreeNode<E> {
    private E value;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode(E value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public TreeNode(E value, TreeNode<E> left, TreeNode<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
