package woodspring.someleetcode;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.HackerRank.StringUnique;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestUniqueString {
	private static final Logger logger = LoggerFactory.getLogger( TestUniqueString.class);
	
	@Test
	public void testUniqueStringN2() {
		StringUnique uStr = new StringUnique();
		String testStr = "abcdefghijklmnopqrssstuvwxyz0987654321ABCDEFGHIJKLMNOPQRSTUVWXYZ?><=-";
		long startTime = System.nanoTime();
		boolean bRet = uStr.isUniqueStringN2(testStr);
		long endTime = System.nanoTime();
		logger.info(" UniqueStringN2: ret:{}, time:{}", bRet, endTime - startTime);
		
		assertTrue( bRet);
		
	}
	
	
	@Test
	public void testUniqueString1() {
		StringUnique uStr = new StringUnique();
		String testStr = "abcdefghijklmnopqrssstuvwxyz0987654321ABCDEFGHIJKLMNOPQRSTUVWXYZ?><=-";
		long startTime = System.nanoTime();
		boolean bRet = uStr.isUniqueString1(testStr);
		long endTime = System.nanoTime();
		logger.info(" testUniqueString1: ret:{}, time:{}", bRet, endTime - startTime);
		
		assertTrue( bRet);
		
	}
	
	@Test
	public void testUniqueStringS() {
		StringUnique uStr = new StringUnique();
		String testStr = "abcdefghijklmnopqrssstuvwxyz0987654321ABCDEFGHIJKLMNOPQRSTUVWXYZ?><=-";
		long startTime = System.nanoTime();
		boolean bRet = uStr.isUniqueStringS(testStr);
		long endTime = System.nanoTime();
		logger.info(" testUniqueStringS: ret:{}, time:{}", bRet, endTime - startTime);
		
		assertTrue( bRet);
		
	}

	
	@Test
	public void testUniqueStringN201() {
		StringUnique uStr = new StringUnique();
		String testStr = "abcdefghijklmnopqrssstuvwxyz0987654321ABCDEFGHIJKLMNOPQRSTUVWXYZ?><=-!v";
		long startTime = System.nanoTime();
		boolean bRet = uStr.isUniqueStringN2(testStr);
		long endTime = System.nanoTime();
		logger.info(" UniqueStringN2: ret:{}, time:{}", bRet, endTime - startTime);
		
		assertFalse( bRet);
		
	}
	
	
	@Test
	public void testUniqueString101() {
		StringUnique uStr = new StringUnique();
		String testStr = "abcdefghijklmnopqrssstuvwxyz0987654321ABCDEFGHIJKLMNOPQRSTUVWXYZ?><=-!v";
		long startTime = System.nanoTime();
		boolean bRet = uStr.isUniqueString1(testStr);
		long endTime = System.nanoTime();
		logger.info(" testUniqueString1: ret:{}, time:{}", bRet, endTime - startTime);
		
		assertFalse( bRet);
		
	}
	
	@Test
	public void testUniqueStringS01() {
		StringUnique uStr = new StringUnique();
		String testStr = "abcdefghijklmnopqrssstuvwxyz0987654321ABCDEFGHIJKLMNOPQRSTUVWXYZ?><=-!v";
		long startTime = System.nanoTime();
		boolean bRet = uStr.isUniqueStringS(testStr);
		long endTime = System.nanoTime();
		logger.info(" testUniqueStringS: ret:{}, time:{}", bRet, endTime - startTime);
		
		assertFalse( bRet);
		
	}
}
