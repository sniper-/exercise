package com.excercise.LeetCode.Exercise.Others;

/**
 * ClassName: S104
 * Version:
 * Description:
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 *
 * @Program:
 * @Author: sniper
 * @Date: 2019/10/08 14:42
 */
public class S104 {
    public S104() {
    }

    public int maxDepthRecursive(TreeNode root) {
        if (root == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepthRecursive(root.left);
            int rDepth = maxDepthRecursive(root.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
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
