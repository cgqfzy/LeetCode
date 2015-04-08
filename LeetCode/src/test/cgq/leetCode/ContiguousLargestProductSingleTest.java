package test.cgq.leetCode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.ContiguousLargestProduct;

public class ContiguousLargestProductSingleTest {

	private ContiguousLargestProduct clp = new ContiguousLargestProduct();
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
	public void testMaxProduct() {
		int expectedResult = 12;
		int[] testArray = {-2,1,-6};
		assertEquals(expectedResult, clp.maxProduct(testArray));
	}

}
