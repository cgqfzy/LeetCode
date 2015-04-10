package test.cgq.leetCode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.Pow;
import com.cgq.utils.MyPrint;

public class PowTest {

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
		Pow p50 = new Pow();
//		MyPrint.print(p50.powShift(2, 7));
		MyPrint.print(p50.int2bit(46));
		int n = -2147483648;
		System.out.println(-n);
	}

}
