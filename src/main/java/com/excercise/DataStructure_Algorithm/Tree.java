package com.excercise.DataStructure_Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ClassName: TreeElements
 * Version: 1.0
 * Description:
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/09/29 14:08
 */
public class Tree<E> {

    private List<E> nodes = new ArrayList<>();

    public Tree() {

    }

    /**
     * Description: turn string array into a balanced BTree
     *
     * @Param: [s]
     * @return:
     * @Author: sniper
     * @Date: 2019/9/29 14:23
     */
    public Tree(String[] s) {

    }

    public List<E> dfsRecursive(Node<E> node) {
        List<E> res = new ArrayList<>();
        res.add(node.getValue());

        if (node.left != null)
            dfsRecursive(node.left);

        if (node.right != null)
            dfsRecursive(node.right);

        return res;
    }

    public List<E> dfsNonRecursive(Node<E> root) {
        List<E> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node<E> node = stack.peek();
            res.add(node.getValue());
            stack.pop();
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return res;

    }

    static class Node<E> {
        private E value;
        private Node<E> left;
        private Node<E> right;

        public Node(E value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public Node(E value, Node<E> left, Node<E> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public E getValue() {
            return value;
        }
    }
}
