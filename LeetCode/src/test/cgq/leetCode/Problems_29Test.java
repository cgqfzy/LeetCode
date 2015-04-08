package test.cgq.leetCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.Problems_29;
import com.cgq.utils.MyPrint;

public class Problems_29Test {

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
		int divident = -1010369383;
		int divisor = -2147483648;
//		MyPrint.print(new Problems_29().divide(divident, divisor));
		MyPrint.print(new Problems_29().divideByShift(divident, divisor));
	}

}
