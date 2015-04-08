package test.cgq.leetCode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cgq.leetCode.LRUCache_V1;

public class LRUCache_V1Test {

	
	
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
		LRUCache_V1 lruCache = new LRUCache_V1(1);
		System.out.println(lruCache.toString());
		lruCache.set(2, 1);
		System.out.println(lruCache.toString());
		System.out.println(lruCache.get(2));
	}

}
