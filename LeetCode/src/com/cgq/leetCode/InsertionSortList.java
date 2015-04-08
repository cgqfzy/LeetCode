package com.cgq.leetCode;


/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * @author kkb
 *
 */
public class InsertionSortList {

	public ListNode insertionSortList(ListNode head){
		if (head == null){
			return null;
		}
		//����һ������ͷ���
		ListNode dummyHeader = new ListNode(-1);
		dummyHeader.next = head;
		ListNode index = head.next;
		head.next = null;
		ListNode preHead = dummyHeader;
		ListNode tmp = null;
		while(index != null){
			//tmp��ֵ  ������Ҫ
			tmp = new ListNode(index.val);
			//����
			index = index.next;
			
			//��tmp���뵽���ʵ�λ��
			while( head != null && tmp.val > head.val){//���������ж�˳�����Ҫ�����˳��ߵ����ܻ����ָ��
				preHead = head;
				head = head.next;
			}
			
			if(head == null){
				preHead.next = tmp;
			}else{
				preHead.next = tmp;
				tmp.next = head;
			}
			head = dummyHeader.next;
			preHead = dummyHeader;
			
			printListNode(dummyHeader);
		}
		return dummyHeader.next;
	}
	
	
	public ListNode insertSortList(ListNode head){
	     if(head == null){
	            return null;
	        }
	        ListNode dummyHeader = new ListNode(-1);
	        dummyHeader.next = head;
	        ListNode index = head.next;
	        head.next = null;
	        ListNode preHead = dummyHeader;
	        ListNode tmp = null;
	        while(index != null){
	            tmp = new ListNode(index.val);
	            index = index.next;
	            while(tmp.val >= head.val && head != null){
	                preHead = head;
	                head = head.next;
	            }
	            if (head == null){
	                preHead.next = tmp;
	            }else{
	                preHead.next = tmp;
	                tmp.next = head;
	            }
	            head = dummyHeader.next;
	            preHead = dummyHeader;
	        }
	        return dummyHeader.next;
	}
	
	/**
	 * ���÷ǵݹ�ķ�ʽ���һ������
	 * @param array ����������������
	 * @return ������������ͷָ��
	 */
	public ListNode createList(int[] array){
		if (array == null){
			throw new NullPointerException();
		}
		ListNode head = new ListNode(array[0]);
		ListNode index = head;
		ListNode tmp = null;
		for(int i = 1; i < array.length ; i ++){
			tmp = new ListNode(array[i]);
			index.next = tmp;
			index = index.next;
		}
		return head;
	}
	
	public ListNode jump(ListNode head,int step){
		int index = 0;
		while(index < step && head != null){
			head = head.next;
			index ++;
		}
		return head;
	}
	
	public String printListNode(ListNode head){
		if (head == null){
			return null;
		}
		StringBuffer sb = new StringBuffer("��ǰ���?");
		while (head.next != null) {
			sb.append(head.val + "-->");
			head = head.next;
		}
		sb.append(head.val);
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
		@Override
		public String toString() {
			return "ListNode [val=" + val + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if (obj instanceof ListNode){
				return this.val == ((ListNode)obj).val && this.next == ((ListNode)obj).next;
			}
			return false;
			
		}
	}
}


