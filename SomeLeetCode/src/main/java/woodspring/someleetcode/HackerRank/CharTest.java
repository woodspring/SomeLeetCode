package woodspring.someleetcode.HackerRank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharTest {
	private final static Logger logger = LoggerFactory.getLogger( CharTest.class);
	public char FindChar( int n, int k, String str) {
		if ( 0 >= n || n > 100 || 0 >= k|| k > 100) return '|';
		char retChar = ' ';
		int lenB =n; //str.length();
		StringBuffer strBuf = new StringBuffer();
		for ( int ind =0; ind < lenB; ind++) {
			StringBuffer strBuf1 = new StringBuffer();
			for ( int indB = ind+1; indB <= lenB; indB++) {
				String aStr = str.substring(ind, indB);
				//logger.info("aStr:{}", aStr);
				strBuf1.append(aStr);
			}
			strBuf.append(strBuf1.toString());
		}
		
		
		String theStr = strBuf.toString();
		if ( k > theStr.length()) return '|';
		logger.info("length:{} char:[{}] theString:[{}]  char:[{}]", theStr.length(), theStr.charAt( k-1), theStr);
		
		return theStr.charAt(k-1);
		
	}

}
