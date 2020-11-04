package woodspring.someleetcode;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.HackerRank.CharTest;

public class TestCharTest {
	private final static Logger logger = LoggerFactory.getLogger(TestCharTest.class);
	
	@Test
	public void testCharTest() {
		CharTest ct = new CharTest();
		String test="dabc";
		int n = 4;
		int k = 3;
		char theC = ct.FindChar(n, k, test);
		logger.info("k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest01() {
		CharTest ct = new CharTest();
		String test="dabc";
		int n = 0;
		int k = 4;
		char theC = ct.FindChar(n, k, test);
		logger.info("01 k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest02() {
		CharTest ct = new CharTest();
		String test="dabc";
		int n = 4;
		int k = 0;
		char theC = ct.FindChar(n, k, test);
		logger.info("02 k:{}  testCharTest:{}", k, theC);
		
	}
	
	@Test
	public void testCharTest03() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 120;
		int k = 100;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("03 k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest04() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 50 ;
		int k = 100;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("04 k:{}  testCharTest:{}", k, theC);
		
	}

	@Test
	public void testCharTest05() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 50 ;
		int k = 101;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("05 k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest06() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 2 ;
		int k = 3;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("06 k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest08() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 2 ;
		int k = 4;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("08 k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest07() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 2 ;
		int k = 10;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("07 k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest09() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 2 ;
		int k = 5;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("09 k:{}  testCharTest:{}", k, theC);
		
	}
	@Test
	public void testCharTest10() {
		CharTest ct = new CharTest();
		String test="dabcwxyzop";
		StringBuffer strBuf = new StringBuffer();
		int n = 100 ;
		int k = 100;
		for ( int ind = 0; ind < 20; ind++)
			strBuf.append( test);
		char theC = ct.FindChar(n, k, strBuf.toString());
		logger.info("10 k:{}  testCharTest:{}", k, theC);
		
	}

}
