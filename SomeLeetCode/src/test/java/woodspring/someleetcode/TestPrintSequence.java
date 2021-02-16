package woodspring.someleetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.PrintSequence;

public class TestPrintSequence {
	
	private static final Logger logger = LoggerFactory.getLogger(TestPrintSequence.class);
	
	@Test 
	public void testPrintSequence1() {
		//List<Integer> test = new ArrayList<>();
		//test.add(1);test.add(2);test.add(3);
		int[] test= {1,2,3};
		PrintSequence pSeq = new PrintSequence();
		pSeq.printSeq(test);
		logger.info("testPrintSequence1 running:{}", test);
	}
	
//	@Test 
//	public void testPrintSequence2() {
//		List<Integer> test = new ArrayList<>();
//		test.add(1);test.add(2);test.add(3);
//		PrintSequence pSeq = new PrintSequence();
//		pSeq.printSeq(test);
//		logger.info("testPrintSequence2 running:{}", test);
//	}
//	
//
//	@Test 
//	public void testPrintSequence3() {
//		List<Integer> test = new ArrayList<>();
//		test.add(3);test.add(2);test.add(1);
//		PrintSequence pSeq = new PrintSequence();
//		pSeq.printSeq(test);
//		logger.info("testPrintSequence3 running:{}", test);
//	}
//
//
//	@Test 
//	public void testPrintSequence4() {
//		List<Integer> test = new ArrayList<>();
//		test.add(2);test.add(1);test.add(3);
//		PrintSequence pSeq = new PrintSequence();
//		pSeq.printSeq(test);
//		logger.info("testPrintSequence4 running:{}", test);
//	}


}
