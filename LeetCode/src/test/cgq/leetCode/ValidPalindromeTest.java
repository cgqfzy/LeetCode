package test.cgq.leetCode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.ValidPalindrome;
import com.cgq.utils.MyPrint;

public class ValidPalindromeTest {

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
		ValidPalindrome vp = new ValidPalindrome();
		String string = "A man, a plan, a canal: Panama";
		String str = ",.";
		MyPrint.print(vp.isPalindrome(str));
	}

}
