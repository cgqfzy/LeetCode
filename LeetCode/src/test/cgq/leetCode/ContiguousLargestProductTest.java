package test.cgq.leetCode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cgq.leetCode.ContiguousLargestProduct;

/**
 * 对于参数测试需要重新写一个类，而不能与其它测试类共用一个类，
 * 然后为该类制定一个Runner，不能使用默认的Runner
 * @author kkb
 *
 */
@RunWith(Parameterized.class)
public class ContiguousLargestProductTest {

	private ContiguousLargestProduct clp = new ContiguousLargestProduct();
	private int result;
	private int[] params;
	private static int count = 1;
	@Before
	public void setUp() throws Exception {
		System.out.println("执行测试次数：" + (count));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("第" + (count++) + "次测试执行结束");
	}
	
	/**
	 * 定义测试数据的集合，该方法可以任意命名，但是必须使用@Parameters标注进行修饰
	 * 其中的数据是一个二维数组，数据两两一组，每组中的两个数据一个是参数，一个是预期的结果
	 * @return
	 */
	@Parameters
	public static Collection testData(){
		int[] testData1 = {-2,3,-4};
		int testExpected1 = 24;
		
		int[] testData2 = {-2,0,-1};
		int testExpected2 = 0;
		
		int[] testData3 = {-2};
		int testExpected3 = -2;
		
		int[] testData4 = {7,-2,-3};
		int testExpected4 = 42;
		
		return Arrays.asList(new Object[][]{
				{testExpected1,testData1},
				{testExpected2,testData2},
				{testExpected3,testData3},
				{testExpected4,testData4}
				
		});
	}
	
	/**
	 * 定义一个待测试的类，并且定义两个变量，一个用于存放参数，一个用于存放语气结果
	 * @param result
	 * @param params
	 */
	public ContiguousLargestProductTest(int result,int[] params) {
		// TODO Auto-generated constructor stub
		this.result = result;
		this.params = params;
	}
	
	@Test
	public void testMaxProduct() {
		assertEquals(result, clp.maxProduct(params));
	}

}
