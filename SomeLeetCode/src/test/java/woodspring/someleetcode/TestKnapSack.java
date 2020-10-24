package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import woodspring.someleetcode.entity.KnapSack;

public class TestKnapSack {
	private static final Logger logger  = LoggerFactory.getLogger(TestKnapSack.class);
	
	
	@Test
	public void testKnapSackWithMemo() {
		KnapSack knapSack = new KnapSack();
		int[]  testValues = {20, 5, 10, 40, 15, 25};
		int[] testWeights = { 1 ,2,  3,  8,  7,  4};
		int packWeight = 10;
		int testResult = knapSack.knapSackWithMemo( testWeights,  testValues,  packWeight, testValues.length -1);
		logger.info("====================result:{}", testResult);
		assertEquals( testResult, 60);
	}
	
	@Test
	public void testKnapSackWithMemo2() {
		KnapSack knapSack = new KnapSack();
		int[]  testValues = {20, 55, 10, 40, 15, 25};
		int[] testWeights = { 11 ,12,  3,  8,  7,  4};
		int packWeight = 25;
		int testResult = knapSack.knapSackWithMemo( testWeights,  testValues,  packWeight, testValues.length -1);
	logger.info("======2==============result:{}", testResult);
		assertEquals( testResult, 140);
	}
	
	@Test
	public void testKnapSackWithMemoMap() {
		KnapSack knapSack = new KnapSack();
		int[]  testValues = {20, 55, 10, 40, 15, 25};
		int[] testWeights = { 11 ,12,  3,  8,  7,  4};
		int packWeight = 25;
		int testResult = knapSack.startKnapsackWithMemo( testWeights,  testValues,  packWeight);
	logger.info("======startKnapsackWithMemo==============result:{}", testResult);
		assertEquals( testResult, 140);
	}

}
