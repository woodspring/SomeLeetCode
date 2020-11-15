package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.codity.MaxProductOfThree;

public class TestMaxProductOfThree {
	private final static Logger logger = LoggerFactory.getLogger(TestMaxProductOfThree.class);
	
	@Test
	public void testMaxProductOfThree() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] test = { -3, 1, 2, -2, 5, 6};
		int result = mpt.solution(test);
		assertEquals( 60, result);
	}
	
	@Test
	public void testMaxProductOfThree001() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] test = { -9, 1, 2, -2, 5, 6};
		int result = mpt.solution(test);
		assertEquals( 60, result);
	}
	
	@Test
	public void testMaxProductOfThree002() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] test = { -9, 1, 2, -8, 5, 6};
		int result = mpt.solution(test);
		logger.info(" testMaxProductOfThree002, result:{}", result);
		assertEquals( 432, result);
	}

	@Test
	public void testMaxProductOfThree003() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] test = { -1000, 1, -2, -999, 1000, 998};
		int result = mpt.solution(test);
		logger.info(" testMaxProductOfThree003, result:{}", result);
		assertEquals( 999000000, result);
	}
	
	@Test
	public void testMaxProductOfThree004() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] test = { -1000, 1, -2, 999, 1000, 998};
		int result = mpt.solution(test);
		assertEquals( 997002000, result);
	}
	
	@Test
	public void testMaxProductOfThree005() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] test = { -1000, 1, -2, 100, 200, 98, -1001, 1002,-300, -400, 22};
		int result = mpt.solution2(test);
		assertEquals( 80000000, result);
	}
	
	@Test
	public void testMaxProductOfThree006() {
		MaxProductOfThree mpt = new MaxProductOfThree();
		int[] test = { -1000, 1, -2, 100, 200, 98, -1001, 1002,-300, -400, 22, -250};
		long startTime = System.nanoTime();
		int result = mpt.solution2(test);
		long endTime = System.nanoTime();
		logger.info("testMaxProductOfThree006-1-, result:{}, time:{}", result, endTime - startTime);
		assertEquals( 80000000, result);
		
		startTime = System.nanoTime();
		result = mpt.solution(test);
		endTime = System.nanoTime();
		logger.info("testMaxProductOfThree006-2-, result:{}, time:{}", result, endTime - startTime);
		startTime = System.nanoTime();
		result = mpt.solution2(test);
		endTime = System.nanoTime();
		logger.info("testMaxProductOfThree006-3-, result:{}, time:{}", result, endTime - startTime);
		startTime = System.nanoTime();
		result = mpt.solution(test);
		endTime = System.nanoTime();
		logger.info("testMaxProductOfThree006-4-, result:{}, time:{}", result, endTime - startTime);
	}
}
