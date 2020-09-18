package woodspring.someleetcode.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongCommonSequence {
	private final static Logger logger = LoggerFactory.getLogger(LongCommonSequence.class);
	
	private int[][] intResult;
	
	public int getLCS(String S, String T) {
		int retInt =0;
		
		int indT =0;
		for ( int indS=0; indS < S.length(); indS++) {
			char theCharS = S.charAt( indS);
			int insideT = indT;
			//if ( !(indT < T.length())) break;
			for ( ; insideT < T.length(); insideT++) {
				char theCharT = T.charAt( insideT);
				if ( Character.compare(theCharS, theCharT) == 0) {
					// find the char
					indT = insideT;
					retInt++;
					logger.info("find the same char S at:{}, T at:{}", indS, indT);
					break;
				} else {
					// NOT the char, next
					//logger.info("NOT the char S:{}, T:{}", theCharS, theCharT);
				}
			}			
		}		
		return retInt;
	}
	
	public int theLCS( String S, int intS, String T , int intT) {
		
		int retInt = 0;
		if (intS <0 || intT < 0) return 0;
		if (0 == (Character.compare( S.charAt( intS), T.charAt(intT))) ) {
			retInt = 1 + theLCS( S, intS-1, T, intT-1);
		} else {
			retInt = Math.max( theLCS(S, intS-1, T, intT) , theLCS( S, intS, T, intT-1));
		}
		return retInt;
		
	}
	
	public int theLCSWithMemorized(String S, String T) {
		int retInt = 0;
		intResult = new int[S.length()][T.length()];
		for (int indX=0; indX < S.length(); indX++) {
			for ( int indY = 0; indY < T.length(); indY++) {
				intResult[indX][indY] = -99;
			}
		}
		retInt = theLCSM( S, S.length()-1, T, T.length() -1);
		return retInt;
		
		
	}
	
	private int theLCSM( String S, int indS, String T, int indT) {
		int retInt = 0;
		if ( indS < 0 || indT < 0) return retInt;
		if ( -99 != intResult[indS][ indT]) {
			// get result already;
			return intResult[indS][ indT];
		}
		if ( Character.compare( S.charAt( indS),  T.charAt(indT)) ==0 ) {
			// the same char
			retInt = 1 + theLCSM( S, indS-1, T, indT-1);
		} else {
			retInt = Math.max( theLCSM(S, indS-1, T, indT),  theLCSM(S, indS, T, indT-1));
		}
		intResult[indS][indT] = retInt;
		return retInt;
	}

}
