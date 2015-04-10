package test.cgq.leetCode;

import junit.framework.TestCase;

import com.cgq.leetCode.SearchRotatedSortedArray2;

public class SearchRotatedSortedArrayTest2 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSearch() {
		SearchRotatedSortedArray2 p31 = new SearchRotatedSortedArray2();
		int[] input = new int[]{3,1,1};
		int target = 3;
		System.out.println(p31.findPivot(input, 0, input.length - 1));
		System.out.println(p31.search(input, target));
	}

}
