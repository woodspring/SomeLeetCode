package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.codity.PermCheck;

public class TestPermCheck {
	private static final Logger logger = LoggerFactory.getLogger( TestPermCheck.class);
	
	@Test
	public void testPermCheck() {
		PermCheck pc = new PermCheck();
		int[]  test = { 4, 1, 2, 3};
		int result = pc.isPermCheck( test);
		logger.info("testPermCheck t size:{}, result:{} ", test.length, result);
	}

	@Test
	public void testPermCheckwhtiout3() {
		PermCheck pc = new PermCheck();
		int[]  test = { 5, 1, 3 };
		int result = pc.isPermCheck( test);
		logger.info("testPermCheckwhtiout3 t size:{}, result:{} ", test.length, result);
	}
	
	@Test
	public void testPermCheckwhtioutMax() {
		PermCheck pc = new PermCheck();
		int size = 100000; //Integer.MAX_VALUE;
		int[]  test = new int[size];
		for ( int ind =0; ind < size; ind++) 
			test[ind] = (ind+ 1);
		int result = pc.isPermCheck( test);
		logger.info("testPermCheckwhtioutMax t size:{}, result:{} ", test.length, result);
	}
	
	
	@Test
	public void testPermCheckwhtioutMaxMissed1() {
		PermCheck pc = new PermCheck();
		int size = 100000; // Integer.MAX_VALUE;
		int[]  test = new int[size];
		for ( int ind =0; ind < size; ind++) {
			if ( ind == 12345) {
				test[ind] = 1000000000;
				continue;
			}
			if ( ind == 1345) {
				test[ind] = 1000000000 -1;
				continue;
			}
			test[ind] = (ind+1);
		}
		int result = pc.isPermCheck( test);
		int theM  = Integer.MAX_VALUE;
		logger.info("testPermCheckwhtioutMaxMissed1 t size:{}, result:{} max:{}", test.length, result, theM);
	}
	

	@Test
	public void testPermCheckSumCorrectButMissOne() {
		PermCheck pc = new PermCheck();
		int[]  test = { 5, 1, 3,1 };
		int result = pc.isPermCheck( test);
		logger.info("testPermCheckSumCorrectButMissOne t size:{}, result:{} ", test.length, result);
	}
	
	@Test
	public void testPermCheckSumCorrectButMisstwo() {
		PermCheck pc = new PermCheck();
		int[]  test = { 4, 2, 2, 2 };
		int result = pc.isPermCheck( test);
		logger.info("testPermCheckSumCorrectButMisstwo t size:{}, result:{} ", test.length, result);
	}
}
