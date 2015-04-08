package com.cgq.leetCode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class MergeKSortedList {

	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {
			// TODO Auto-generated constructor stub
			this.val = x;
			this.next = null;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			StringBuffer sb = new StringBuffer("[ ");
			ListNode tmp = this;
			while (tmp != null) {
				sb.append(tmp.val + " ");
				tmp = tmp.next;
			}
			sb.append("]");
			return sb.toString();
		}
	}
	
	public ListNode mergeKLists(List<ListNode> lists){
		int size = lists.size();
		if (size == 0){
			return null;
		}
		if (size == 1) {
			return lists.get(0);
		}
		int mid = (size - 1) / 2;
		ListNode la = mergeKLists(lists.subList(0, mid + 1));
		ListNode lb = mergeKLists(lists.subList(mid + 1, size));
		return merge(la, lb);
	}
	
	
	public ListNode merge(ListNode la,ListNode lb){
		
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead;
		while (la != null && lb != null) {
			if (la.val <= lb.val) {
				cur.next = la;
				la = la.next;
			}else{
				cur.next = lb;
				lb = lb.next;
			}
			cur = cur.next;
		}
		if (la != null) {
			cur.next = la;
		}
		if (lb != null){
			cur.next = lb;
		}
		return dummyHead.next;
	}
	
	public ListNode mergeKListNode(List<ListNode> lists){
		if (lists.size() == 0) {
			return null;
		}
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(11,new ListNodeCompare());
		for (ListNode listNode : lists) {
			if (listNode != null) {
				queue.add(listNode);
			}
		}
		if (queue.isEmpty()) {
			return null;
		}
		ListNode result = queue.poll();
		if (result.next != null) {
			queue.add(result.next);
		}
		ListNode cur = result;
		while (!queue.isEmpty()) {
			ListNode node =  queue.poll();
			if (node.next != null) {
				queue.add(node.next);
				node.next = null;
			}
			cur.next = node;
			cur = cur.next;
		}
		return result;
	}
	
	public ListNode createListNode(int[] input){
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead;
		ListNode tmp = null;
		for (int i = 0; i < input.length; i++) {
			tmp = new ListNode(input[i]);
			tmp.next = null;
			cur.next = tmp;
			cur = tmp;
		}
		return dummyHead.next;
		
	}
	
	private class ListNodeCompare implements Comparator<ListNode>{

		@Override
		public int compare(ListNode o1, ListNode o2) {
			// TODO Auto-generated method stub
			return o1.val - o2.val;
		}

		
	}
}

