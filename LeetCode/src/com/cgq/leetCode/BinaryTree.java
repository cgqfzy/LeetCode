package com.cgq.leetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

	public class TreeNode{
		int val;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
		public TreeNode getLeft() {
			return left;
		}
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		public TreeNode getRight() {
			return right;
		}
		public void setRight(TreeNode right) {
			this.right = right;
		}
		
		
	}

	public static final int MAX_STACK = 100;
	/**
	 * 后续遍历 非递归
	 * @param root
	 * @return
	 */
	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if (root == null){
			return result;
		}
		
		TreeNode nodeStack[] = new TreeNode[MAX_STACK];
		int visitStack[] = new int[MAX_STACK];
		int top = -1;
		int visit = 0;
		TreeNode tmp = root;
		do{
			while(tmp != null){
				//沿着左边一直往下走
				nodeStack[++top] = tmp;
				visitStack[top] = 0;
				tmp = tmp.left;
			}
			//取出栈顶元素
			visit = visitStack[top];
			tmp = nodeStack[top--];
			if((visit == 1 && tmp.right != null) || (visit ==0 && tmp.right == null)){
				result.add(tmp.val);
				tmp = null;
			}else if(tmp.right != null && visit == 0){
				//入栈，向右节点走一步
				nodeStack[++top] = tmp;
				visitStack[top] = 1;
				tmp = tmp.right;
			}
		}while(! (top == -1 && tmp == null));
		return result;
	}
	/**
	 * 前序遍历 非递归
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
        	return result;
        }
        TreeNode nodeStack[] = new TreeNode[MAX_STACK];
        int visitStack[] = new int[MAX_STACK];
        int top = -1;
        int visit = -1;
        TreeNode tmp = root;
        do{
        	//向左移动
        	while(tmp != null){
        		//首先访问节点
        		result.add(tmp.val);
        		nodeStack[++top] = tmp;
        		visitStack[top] = 0;
        		tmp = tmp.left;
        	}
        	//出栈
        	visit = visitStack[top];
        	tmp = nodeStack[top--];
        	//判断是否访问
        	if((visit ==0 && tmp.right == null) || (visit == 1 && tmp.right != null)){
        		tmp = null;
        	}else if(visit == 0 && tmp.right != null){
        		nodeStack[++top] = tmp;
        		visitStack[top] = 1;
        		tmp = tmp.right;
        	}
        }while(!(top == -1 && tmp == null));
        
        return result;
    }
	
	public void printTree(TreeNode root,int dashNum){
		if (root != null){
			for (int i = 0; i < dashNum; i++) {
				System.out.print("--");
			}
			System.out.println(root.getVal());
		}
		if (root.getLeft() != null){
			printTree(root.getLeft(), dashNum + 1);
		}
		if (root.getRight() != null){
			printTree(root.getRight(), dashNum + 1);
		}
		
		
		
	}
	
}
