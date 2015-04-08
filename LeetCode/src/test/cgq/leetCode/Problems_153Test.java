package test.cgq.leetCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.Problems_153;
import com.cgq.utils.MyPrint;

public class Problems_153Test {

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
		Problems_153 problems_153 = new Problems_153();
//		int[] input = new int[]{2,3,4,5,1};
		int[] input = new int[]{3,1,2};
		MyPrint.print(problems_153.findMin(input));
	}

}
