package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.NotLeetReplaceDigits;

public class TestReplaceDigit {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private NotLeetReplaceDigits digits = new NotLeetReplaceDigits();

	@Test
	public void testReplaceWith() {
		int result = digits.replaceAWithB(103,0,  5);
		logger.info(" 103 result:{}", result);
		assertEquals( result, 153);
		result = digits.replaceAWithB(190802 ,0,  5);
		logger.info(" 190802 result:{}", result);
		assertEquals( result, 195852);
		result = digits.replaceAWithB(1765476, 6,  9);
		logger.info(" 1765476 result:{}", result);
		assertEquals( result, 1795479);
		result = digits.replaceAWithB(196696699, 9,6);
		logger.info(" 196696699 result:{}", result);
		assertEquals( result, 166666666);
	}
	
	@Test
	public void testHighestPower2() {
		int result = digits.highestPower2( 1);
		logger.info(" 1 result:{}", result);
		assertEquals( result, 1);
		result = digits.highestPower2( 2);
		logger.info(" 2 result:{}", result);
		//assertTrue( result == 2);
		assertEquals( result, 2);
		result = digits.highestPower2( 3);
		logger.info(" 3 result:{}", result);
		assertEquals( result, 2);
		result = digits.highestPower2( 9);
		logger.info(" 9 result:{}", result);
		assertEquals( result, 8);
		result = digits.highestPower2( 31);
		logger.info(" 31 result:{}", result);
		assertEquals( result, 16);
		
		result = digits.highestPower2( 1023);
		logger.info(" 1023 result:{}", result);
		assertEquals( result, 512);
		
		result = digits.highestPower2( 1024);
		logger.info(" 1024 result:{}", result);
		assertEquals( result, 1024);
		
		result = digits.highestPower2( 1025);
		logger.info(" 1025 result:{}", result);
		assertEquals( result, 1024);
	}
}
