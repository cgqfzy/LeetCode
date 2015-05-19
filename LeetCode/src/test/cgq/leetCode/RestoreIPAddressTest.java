package test.cgq.leetCode;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.RestoreIPAddress;

/**
 * @comment
 * @author cgqfzy
 * @version 1.0
 * @date May 15, 2015 11:21:52 AM
 */
public class RestoreIPAddressTest {

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
		String str = "111111111";
		ArrayList<String> res = new RestoreIPAddress().restoreIPAddresses(str);
		for(String st : res){
			System.out.println(st);
		}
	}

}
