package util;

import java.util.*;

public final class TreeNodeUtil {

    private TreeNodeUtil() {
    }

    public static TreeNode addNode(TreeNode root, Integer value) {
        if (root == null) return new TreeNode(value);
        if (value == root.val) return root;

        if (value > root.val) {
            if (root.right != null) {
                return addNode(root.right, value);
            } else {
                return root.right = new TreeNode(value);
            }
        } else {
            if (root.left != null) {
                return addNode(root.left, value);
            } else {
                return root.left = new TreeNode(value);
            }
        }
    }

    public static boolean equalsBFS(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(t1);
        queue2.offer(t2);
        while (!queue1.isEmpty() | !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            if (node2 != null && node1 != null && node1.val != node2.val) {
                return false;
            }
            if (node1 != null && node1.left != null) {
                queue1.offer(node1.left);
            }
            if (node1 != null && node1.right != null) {
                queue1.offer(node1.right);
            }
            if (node2 != null && node2.left != null) {
                queue2.offer(node2.left);
            }
            if (node2 != null && node2.right != null) {
                queue2.offer(node2.right);
            }
        }
        return true;
    }

    public static TreeNode generateGraphFromArray(Integer[] srez) {
        TreeNode rootNode = new TreeNode(srez[0], null, null);
        List<TreeNode> parent = new ArrayList<>();
        List<TreeNode> child = new ArrayList<>();
        parent.add(rootNode);
        for (int i = 1; i < srez.length; ) {
            for (TreeNode treeNode : parent) {
                if (treeNode != null) {
                    if (i < srez.length) {
                        treeNode.left = srez[i] == null ? null : new TreeNode(srez[i]);
                    }
                    if (++i < srez.length) {
                        treeNode.right = srez[i] == null ? null : new TreeNode(srez[i]);
                    }
                    child.add(treeNode.left);
                    child.add(treeNode.right);
                    i++;
                } else {
                    child.add(null);
                    child.add(null);
                    i += 2;
                }
            }
            parent = child;
            child = new ArrayList<>();
        }
        return rootNode;
    }

    public static TreeNode generateBinGraph(Integer[] srez) {
        TreeNode rootNode = new TreeNode(srez[0], null, null);
        for (int i = 1; i < srez.length; i++) {
            Integer integer = srez[i];
            if (integer != null) {
                addNode(rootNode, integer);
            }
        }
        return rootNode;
    }

    public static TreeNode generateGraphSergey(Integer[] root) {
        TreeNode rootNode = new TreeNode(root[0], null, null);
        int length = 0;
        int levelLength = 1;
        TreeNode[] arrayOld = new TreeNode[1];
        TreeNode[] arrayChield = new TreeNode[2];
        arrayOld[0] = rootNode;
        int indexRoot = 1;
        while (root.length > length) {
            for (int i = 0, child = 0; i < levelLength && indexRoot < root.length; i++) {
                if (arrayOld[i] != null) {
                    if (root[indexRoot] != null) {
                        arrayOld[i].left = new TreeNode(root[indexRoot]);
                        arrayChield[child] = arrayOld[i].left;
                    }
                    indexRoot++;
                    child++;
                    if (root[indexRoot] != null) {
                        arrayOld[i].right = new TreeNode(root[indexRoot]);
                        arrayChield[child] = arrayOld[i].right;
                    }
                    indexRoot++;
                    child++;
                }
            }
            levelLength = levelLength * 2;
            length += levelLength;
            arrayOld = arrayChield;
            arrayChield = new TreeNode[levelLength * 2];
        }
        return rootNode;
    }

    public static String printTree(TreeNode rootNode) {
        Stack<TreeNode> globalStack = new Stack<>();
        globalStack.push(rootNode);
        // the initial value of the distance between elements
        int gaps = 32;
        boolean isRowEmpty = false;
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        while (!isRowEmpty) {
            // local stack for setting descendants of the element
            Stack<TreeNode> localStack = new Stack<>();
            isRowEmpty = true;
            sb.append(" ".repeat(gaps));
            while (!globalStack.isEmpty()) {
                TreeNode temp = globalStack.pop();
                if (temp != null) {
                    sb.append(temp.val);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if (temp.left != null || temp.right != null) {
                        isRowEmpty = false;
                    }
                } else {
                    sb.append("__");
                    localStack.push(null);
                    localStack.push(null);
                }
                sb.append(" ".repeat(Math.max(0, gaps * 2 - 2)));
            }
            sb.append("\n");
            gaps /= 2;
            while (!localStack.isEmpty()) {
                // move all elements from the local stack to the global
                globalStack.push(localStack.pop());
            }
        }
        String separator = "-----------------------------------------------------------------";
        sb.append(separator).append("\n");
        return sb.toString();
    }
}