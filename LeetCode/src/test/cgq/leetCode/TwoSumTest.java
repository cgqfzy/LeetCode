package test.cgq.leetCode;

import static org.junit.Assert.*;

import java.lang.annotation.Target;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.TwoSum;
import com.cgq.utils.MyPrint;

public class TwoSumTest {

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
		int[] input = new int[]{2,7,11,15};
		int target = 9;
		MyPrint.printArray(input);
		MyPrint.printArray(new TwoSum().twosSum(input, target));
		
	}

}
