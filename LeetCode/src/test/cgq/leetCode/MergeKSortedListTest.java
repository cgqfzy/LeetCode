package test.cgq.leetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.MergeKSortedList.ListNode;
import com.cgq.leetCode.MergeKSortedList;

public class MergeKSortedListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MergeKSortedList mkSortedList = new MergeKSortedList();
		ListNode la = mkSortedList.createListNode(new int[]{1});
		ListNode lb = mkSortedList.createListNode(new int[]{0});
		ListNode lc = mkSortedList.createListNode(new int[]{});
		ArrayList<ListNode> lists = new ArrayList<>();
		lists.add(la);
		lists.add(lb);
		for (ListNode listNode : lists) {
			System.out.println(listNode);
		}
		System.out.println(mkSortedList.mergeKLists(lists));
		System.out.println("end.....");
	}
	
	
	

}
