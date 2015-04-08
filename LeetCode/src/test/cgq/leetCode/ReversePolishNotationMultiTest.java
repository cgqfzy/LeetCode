package test.cgq.leetCode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cgq.leetCode.ContiguousLargestProduct;
import com.cgq.leetCode.ReversePolishNotation;

@RunWith(Parameterized.class)
public class ReversePolishNotationMultiTest {
	private ReversePolishNotation rpn = new ReversePolishNotation();
	private int result;
	private String[] params;
	
	@Parameters
	public static Collection testData(){
		String[] testData1 = {"-2","3","-"};
		int testExpected1 = -5;
		
		String[] testData2 = {"2", "1", "+", "3", "*"};
		int testExpected2 = 9;
		
		String[] testData3 = {"4", "13", "5", "/", "+"};
		int testExpected3 = 6;
		
		String[] testData4 = {"0", "-3", "/"};
		int testExpected4 = 0;
		
		return Arrays.asList(new Object[][]{
				{testExpected1,testData1},
				{testExpected2,testData2},
				{testExpected3,testData3},
				{testExpected4,testData4}
		});
	}
	
	
	public ReversePolishNotationMultiTest(int result,String[] params){
		this.result = result;
		this.params = params;
	}
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
	public void testEvalRPN(){
		
		assertEquals(result, rpn.evalRPN(params));
	}
	
}
