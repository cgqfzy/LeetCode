package test.cgq.leetCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.MaximumSubArray;
import com.cgq.utils.MyPrint;

public class MaximumSubArrayTest {

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
		int[] input = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//		int[] input = new int[]{-2,1};
		int expect = 6;
		MyPrint.print(new MaximumSubArray().maxSubArray1(input));
	}

}
