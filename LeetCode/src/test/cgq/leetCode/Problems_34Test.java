package test.cgq.leetCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.Problems_34;
import com.cgq.utils.MyPrint;

public class Problems_34Test {

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
		Problems_34 p34 = new Problems_34();
		int[] input = new int[]{2,2};
		int target = 2;
		MyPrint.print(p34.findMinIndex(input, 0, input.length, target));
	}

}
