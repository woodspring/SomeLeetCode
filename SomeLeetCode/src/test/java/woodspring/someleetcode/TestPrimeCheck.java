package woodspring.someleetcode;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.HackerRank.PrimeCheck;

public class TestPrimeCheck {
	private final static Logger logger = LoggerFactory.getLogger( TestPrimeCheck.class);
	@Test
	public void testPrimeCheck() {
		PrimeCheck pc = new PrimeCheck();
		String test = "2 \n 1 \n 3 \n 4 \n 5 \n";
		String retStr = pc.checkPrimary( test);
		
		test = "2 \n 1 \n 3 \n 4 \n 13 \n";
		retStr = pc.checkPrimary( test);
		
		
	}

}
