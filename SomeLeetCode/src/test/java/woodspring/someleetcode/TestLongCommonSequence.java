package woodspring.someleetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.service.impl.LongCommonSequence;


public class TestLongCommonSequence {
	private final static Logger logger = LoggerFactory.getLogger(TestLongCommonSequence.class);
	
	@Test 
	public void testLCSNotContinuse() {
		LongCommonSequence lcs = new LongCommonSequence();
		String S = "ABAZDC";
		String T = "BACBAD";
		boolean varB = ( 4 == lcs.getLCS(S,  T) ? true : false);
		assertTrue( varB);
		S = "AAAAAAAA";
		T = "BBBBBBBBBBBBBBB";
		varB = ( 0 == lcs.getLCS(S,  T) ? true : false);
		assertTrue( varB);
		
		S = "AA";
		T = "BBBABBBBBBBBaBBBBBBA";
		varB = ( 2 == lcs.getLCS(S,  T) ? true : false);
		logger.info("Result:{}",lcs.getLCS(S,  T) );
		assertTrue( varB);
		
		S = "AAAAAA";
		T = "BBBABBBBBBBBaBBBBBBA";
		varB = ( 6 == lcs.getLCS(S,  T) ? true : false);
		logger.info("Result:{}",lcs.getLCS(S,  T) );
		assertTrue( varB);

		
		
	}

	@Test 
	public void testTheLCS() {
		LongCommonSequence lcs = new LongCommonSequence();
		String S = "ABAZDC";
		String T = "BACBAD";
		long sTime = System.nanoTime();
		lcs.theLCS(S, S.length()-1,  T, T.length()-1);
		logger.info("LCS time:{}",System.nanoTime() - sTime);
		
		logger.info( "testTheLCS-1-:{}",lcs.theLCS(S, S.length()-1,  T, T.length()-1) );
		boolean varB = ( 4 == lcs.theLCS(S, S.length()-1,  T, T.length()-1) ? true : false);
		assertTrue( varB);
		S = "AAAAAAAA";
		T = "BBBBBBBBBBBBBBB";
		logger.info( "testTheLCS-2-:{}",lcs.theLCS(S, S.length()-1,  T, T.length()-1) );
		varB = ( 0 == lcs.theLCS(S, S.length()-1,  T, T.length()-1)  ? true : false);
		assertTrue( varB);
	}
	
	
	@Test 
	public void testTheLCSM() {
		LongCommonSequence lcs = new LongCommonSequence();
		String S = "ABAZDC";
		String T = "BACBAD";
		long sTime = System.nanoTime();
		lcs.theLCSWithMemorized(S,  T);
		logger.info("LCSM time:{}",System.nanoTime() - sTime);
		logger.info( "testTheLCS-1-:{}",lcs.theLCSWithMemorized(S,  T));
		boolean varB = ( 4 == lcs.theLCSWithMemorized(S,  T) ? true : false);
		assertTrue( varB);
		S = "AAAAAAAA";
		T = "BBBBBBBBBBBBBBB";
		logger.info( "testTheLCS-2-:{}",lcs.theLCSWithMemorized(S,  T) );
		varB = ( 0 == lcs.theLCSWithMemorized(S,  T)  ? true : false);
		assertTrue( varB);
	}
}
