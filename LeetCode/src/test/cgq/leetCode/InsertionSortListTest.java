package test.cgq.leetCode;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.InsertionSortList;
import com.cgq.leetCode.InsertionSortList.ListNode;

public class InsertionSortListTest {
	private InsertionSortList isl = new InsertionSortList();
	public static int[] testArray = new int[10];
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Random rand = new Random();
		for (int i = 0; i < testArray.length; i ++){
//			testArray[i] = rand.nextInt(20);
			testArray[i] = 11 - i;
		}
		
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
	public void testInsertionSortList() {
		//{1,1} {3,2,4}
		printArray();
		ListNode head = isl.createList(new int[]{3,2,4});
		isl.printListNode(head);
		System.out.println(head);
		System.out.println(isl.jump(head, 9));
		ListNode newHead = isl.insertionSortList(head);
		isl.printListNode(newHead);
		System.out.println(newHead);
	}

	private static void printArray(){
		StringBuffer sb = new StringBuffer("随机数组：");
		for (int i = 0; i < testArray.length; i++) {
			sb.append(testArray[i] + "   ");
		}
		System.out.println(sb.toString());
	}
	@Test
	public void testCreateList() {
		fail("Not yet implemented");
	}

	@Test
	public void testJump() {
		fail("Not yet implemented");
	}

	@Test
	public void testPrintListNode() {
		fail("Not yet implemented");
	}

}
