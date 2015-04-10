package test.cgq.leetCode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.SearchRotatedSortedArray1;
import com.cgq.utils.MyPrint;

public class SearchRotatedSortedArrayTest1 {

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
		int[] input = new int[]{4,5,6,7,0,1,2};
		int[] in2 = new int[]{1,2,3,4,5,6,7};
		int target = 0;
		MyPrint.print(new SearchRotatedSortedArray1().search(input, target));
	}

}
