package test.cgq.leetCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.MajorityElement;
import com.cgq.utils.MyPrint;

public class MajorityElementTest {

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
		int[] input = new int[]{1,2,3,1,1,4,1,1,1};
		MyPrint.print(new MajorityElement().majorityElement(input));
		assertEquals(1, new MajorityElement().majorityElement(input));
	}

}
