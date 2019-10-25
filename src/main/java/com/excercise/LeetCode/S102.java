package com.excercise.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: S102
 * Version:
 * Description:
 * <p>
 * <p>
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/09/30 17:02
 */
public class S102 {
    public S102() {
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            List<Integer> list = new ArrayList<>();
            while (count > 0) {
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                count--;
            }
            res.add(list);
        }
        return res;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
