package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.OneTest;

public class TestOneTest {
	private final static Logger logger = LoggerFactory.getLogger(TestOneTest.class);
	
	@Test
	public void testOneTest() {
		OneTest oneTest = new OneTest();
		int input1 =6;
		int[] input2 = {1,2,3,4,5,6};
		int input3 =5;
		int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("result:{}", result);
		
	}
	
	@Test
	public void testOneTest1() {
		OneTest oneTest = new OneTest();
		int input1 =20;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int input3 =16;
		int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("result:{}", result);
		
	}
	@Test
	public void testOneTest01() {
		OneTest oneTest = new OneTest();
		int input1 =20;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int input3 =20;
		int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("result:{}", result);
		
	}
	@Test
	public void testOneTest02() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =16;
		int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("16: result:{}", result);
		
		
	}
	
	@Test
	public void testOneTest2() {
		OneTest oneTest = new OneTest();
		int input1 =2;
		int[] input2 = {1,2};
		int input3 =2;
		int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("result:{}", result);
		
	}

}
