package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.codity.Inverse;

public class TestInverse {
	private static final Logger logger = LoggerFactory.getLogger(TestInverse.class);
	
	@Test
	public void testInverse() {
		Inverse iv = new Inverse();
		int[] A = {-1, 6, 3, 4, 7, 4};
		int retsult = iv.inverse( A);
		logger.info("result:{}", retsult);
		
	}

	@Test
	public void testInverseFor0() {
		Inverse iv = new Inverse();
		int[] A = {} ;
		int retsult = iv.inverse( A);
		logger.info("testInverseFor0 result:{}", retsult);
		
	}
	
	@Test
	public void testInverseFor1() {
		Inverse iv = new Inverse();
		int[] A = {50} ;
		int retsult = iv.inverse( A);
		logger.info("testInverseFor1 result:{}", retsult);
		
	}
	@Test
	public void testInverseFor2_1() {
		Inverse iv = new Inverse();
		int[] A = {50, 51} ;
		int retsult = iv.inverse( A);
		logger.info("testInverseFor2_1 result:{}", retsult);
		
	}
	@Test
	public void testInverseFor2_2() {
		Inverse iv = new Inverse();
		int[] A = {50, 3} ;
		int retsult = iv.inverse( A);
		logger.info("testInverseFor2_2 result:{}", retsult);
		
	}
}
