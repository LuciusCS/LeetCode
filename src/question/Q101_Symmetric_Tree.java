package question;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q101_Symmetric_Tree {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static boolean isSymmetric(TreeNode root) {

        List<Integer>integers=new ArrayList<>();
        //使用先序遍历
        Queue<TreeNode>treeNodes=new LinkedList<>();

        //一个节点都没有
        if (root==null){
            return true;
        }

        //只有一个节点
        if (null==root.left&&null==root.right){
            return true;
        }

        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            TreeNode treeNode=treeNodes.poll();
            if (null!=treeNode) {
                integers.add(treeNode.val);
            }else {
                integers.add(null);
            }

            treeNodes.add(treeNode.left);
            treeNodes.add(treeNode.right);

        }

        int index=1;

        int midIndex=(int) Math.pow(2,index++);
        int lastIndex=(int) Math.pow(2,index)-2;

        int length=integers.size();
        while (lastIndex<length){
            int firstIndex=lastIndex-midIndex+1;
            while (firstIndex<lastIndex){
                if (integers.get(firstIndex)==integers.get(lastIndex)){
                    firstIndex++;
                    lastIndex--;
                }else {
                    return false;
                }
            }


            midIndex=(int) Math.pow(2,index++);
            lastIndex=(int) Math.pow(2,index)-2;
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,1));
        System.out.println(Math.pow(2,2));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,4));
        System.out.println(Math.pow(2,5));


    }


}
