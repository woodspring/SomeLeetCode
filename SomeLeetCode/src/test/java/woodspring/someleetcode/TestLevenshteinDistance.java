package woodspring.someleetcode;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.LevenshteinDistance;
import woodspring.someleetcode.entity.LongestCommonSubsequence;

public class TestLevenshteinDistance {
	private final static Logger logger = LoggerFactory.getLogger(TestLevenshteinDistance.class);
	
//	@Test
//	public void testLC() {
//		LevenshteinDistance lc = new LevenshteinDistance();
//		String strA = "OneDay";
//		String strB = "ThisMayBeOneOfTheDay";
//		int result = lc.valueLeven(strA,  strB);
//		logger.info("---LC:{}", result);
//		
//		
//	}
	
//	@Test
//	public void testLC2() {
//		LevenshteinDistance lc = new LevenshteinDistance();
//		String strA = "man";
//		String strB = "machine";
//		int result = lc.valueLeven(strA,  strB);
//		logger.info("---LC:{}", result);
//		
//		
//	}
//	
//	@Test
//	public void testLCS() {
//		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//		String strA = "MICE";
//		String strB = "MINCE";
//		int result = lcs.findLCS( strA,  strB);
//		assertEquals(4, result);
//		
//	}
//	
//	
//	@Test
//	public void testLCS2() {
//		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//		String strA = "MICE";
//		String strB = "MIABNCXZW";
//		int result = lcs.findLCS( strA,  strB);
//		assertEquals(3, result);
//		
//	}
//
//	@Test
//	public void testLCS3() {
//		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//		String strA = "Hillfinger";
//		String strB = "Hilfiger";
//		int result = lcs.findLCS( strA,  strB);
//		assertEquals(8, result);
//		
//		strA = "AGGTAB";
//		strB = "GXTXAYB";
//		result = lcs.findLCS( strA,  strB);
//		assertEquals(4, result);
//		
//	}
//	
//	@Test
//	public void testRewriteLCS3() {
//		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//		String strA = "Hillfinger";
//		String strB = "Hilfiger";
//		int result = lcs.rewiteLCS( strA,  strB);
//		assertEquals(8, result);
//		
//		strA = "AGGTAB";
//		strB = "GXTXAYB";
//		result = lcs.rewiteLCS( strA,  strB);
//		assertEquals(4, result);
//		
//	}
//	
//	@Test
//	public void testBiLCS3() {
//		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//		String strA = "Hillfinger";
//		String strB = "Hilfiger";
//		int result = lcs.biLCS(strA,  strB);
//		assertEquals(8, result);
//		
//		strA = "AGGTAB";
//		strB = "GXTXAYB";
//		result = lcs.biLCS( strA,  strB);
//		assertEquals(4, result);
//		
//	}
//	
	
	@Test
	public void testComparCS3() {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();

		String strA = "Hillfinger";
		String strB = "Hilfiger";
		long startTime = System.nanoTime();
		int result = lcs.biLCS(strA,  strB);
		long endTime =  System.nanoTime();
		logger.info( "strA:{} --biLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(8, result);
		
		startTime = System.nanoTime();
		result = lcs.rewiteLCS(strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --rewriteLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(8, result);
		
		startTime = System.nanoTime();
		result = lcs.findLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --first findLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(8, result);
		
		startTime = System.nanoTime();
		result = lcs.findLCSwithDP( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --findLCSwithDP----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(8, result);
		
		
		
		
		strA = "AGGTAB";
		strB = "GXTXAYB";
		startTime = System.nanoTime();
		result = lcs.findLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --second findLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(4, result);
		

		startTime = System.nanoTime();
		result = lcs.rewiteLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --rewriteLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(4, result);
		
		
		startTime = System.nanoTime();
		result = lcs.biLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --biLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(4, result);
		
		startTime = System.nanoTime();
		result = lcs.findLCSwithDP( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --findLCSwithDP----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(4, result);
		
		
		
		
		
		strA = "ABCDEFGHIJKLMN";
		strB = "OPQRSTUVWXYZOPQRSTUVWXYZOPQRSTUVWXYZOPQRSTUVWXYZabcdefgOPQRSTUVWXYZOPQRSTUVWXYZOPQRSTUVWXYZOPQRSTUVWXYZabcdefg";
		startTime = System.nanoTime();
		result = lcs.findLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --second findLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(0, result);
		

		startTime = System.nanoTime();
		result = lcs.rewiteLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --rewriteLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(0, result);
		
		startTime = System.nanoTime();
		result = lcs.biLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --biLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(0, result);
		
		startTime = System.nanoTime();
		result = lcs.findLCSwithDP( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --findLCSwithDP----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(0, result);

		
		
		
		strA = "AGGTABAGGTAB";
		strB = "GXTXAYBAGGTAB";
		startTime = System.nanoTime();
		result = lcs.findLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --second findLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(10, result);
		
		startTime = System.nanoTime();
		result = lcs.rewiteLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --rewriteLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(10, result);
		
		startTime = System.nanoTime();
		startTime = System.nanoTime();
		result = lcs.biLCS( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --biLCS----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(10, result);
		
		startTime = System.nanoTime();
		startTime = System.nanoTime();
		result = lcs.findLCSwithDP( strA,  strB);
		endTime =  System.nanoTime();
		logger.info( "strA:{} --findLCSwithDP----nanoTime:{}", strA, ( endTime-startTime));
		assertEquals(10, result);
	}
	
	@Test
	public void testLCSwithDP() {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String strA = "Hillfinger";
		String strB = "Hilfiger";
		int result = lcs.findLCSwithDP(strA, strB);
		logger.info("testLCSwithDP, ===> result:{}", result);
		assertEquals(8, result);
		
		strA = "AGGTAB";
		strB = "GXTXAYB";
		result = lcs.findLCSwithDP( strA,  strB);
		logger.info("testLCSwithDP, ====> result:{}", result);
		assertEquals(4, result);
		
	}
}
