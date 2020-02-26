package com.ana.algorithms.trees;

public class TreesExercises {

    public static void preorderVisit(TreeNode root) {
        System.out.println("Preorder visit: " + preorder(root));
    }

    public static void inorderVisit(TreeNode root) {
        System.out.println("Inorder visit: " + inorder(root));
    }

    public static void postorderVisit(TreeNode root) {
        System.out.println("Postorder visit: " + postorder(root));
    }

    private static String preorder(TreeNode node) {
        String visit = "";
            if (node.isRoot() || node.isLeaf()) visit += node.getData();
            if (node.hasLeftChild()) visit += preorder(node.getLeft());
            if (node.hasRightChild()) visit += preorder(node.getRight());
        return visit;
    }

    private static String inorder(TreeNode node) {
        String visit = "";
        if (node.hasLeftChild()) visit += inorder(node.getLeft());
        if (node.isRoot() || node.isLeaf()) visit += node.getData();
        if (node.hasRightChild()) visit += inorder(node.getRight());
        return visit;
    }

     private static String postorder(TreeNode node) {
        String visit = "";
        if (node.hasLeftChild()) visit += postorder(node.getLeft());
        if (node.hasRightChild()) visit += postorder(node.getRight());
        if (node.isRoot() || node.isLeaf()) visit += node.getData();
        return visit;
    }

    public static void test() {
        TreeNode root = prepareTree();

        preorderVisit(root);
        inorderVisit(root);
        postorderVisit(root);
    }

    private static TreeNode prepareTree() {
        TreeNode a,b,c,d,e,f,g,h,i;
        a = new TreeNode(); a.setData("A");
        b = new TreeNode(); b.setData("B");
        c = new TreeNode(); c.setData("C");
        d = new TreeNode(); d.setData("D");
        e = new TreeNode(); e.setData("E");
        f = new TreeNode(); f.setData("F");
        g = new TreeNode(); g.setData("G");
        h = new TreeNode(); h.setData("H");
        i = new TreeNode(); i.setData("I");

        a.setLeft(b); a.setRight(c);
        b.setLeft(d); b.setRight(e);
        e.setLeft(g);
        c.setRight(f);
        f.setLeft(h); f.setRight(i);

        return a;
    }
}
