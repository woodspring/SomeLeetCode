package woodspring.someleetcode.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevenshteinDistance {
	private final static Logger logger = LoggerFactory.getLogger( LevenshteinDistance.class);
	
	public  int valueLeven(String strA, String strB) {
		int retInt = 1;
		int lenA = strA.length(), lenB = strB.length();
		int[][] distM = new int[lenA+1][lenB+1];
		
		for (int indA=0; indA < lenA; indA++) {
			distM[indA][ 0] = indA;
		}
		for (int indB=0; indB < lenB; indB++) {
			distM[0][ indB] = indB;
		}
		
		int lev1 =0, lev2 =0, lev3 = 0, iMin = Integer.MIN_VALUE;
		for ( int indA =1; indA <= lenA; indA++) {
			for ( int indB = indA; indB <= lenB; indB++) {
				lev1 = distM[indA-1][indB] +1 ;
				lev2 = distM[indA][indB-1] +1 ;
				lev3 = distM[indA-1][indB-1] + (( strA.charAt(indA-1) == strB.charAt(indB-1) ) ? 0 :1 );
				iMin = Math.min( lev1, lev2);
				iMin = Math.min( iMin,  lev3);
				logger.info("indA:{}/lenA:{} indB:{}/lenB:{}:, lev1:{} lev2:{} lev3:{}; iMin:{}", indA, lenA, indB, lenB, lev1, lev2, lev3, iMin);
				distM[ indA][ indB] = iMin;
				
				
			}
		}
		retInt = distM[ lenA][lenB];
		logger.info(" retInt:{}", retInt);
		return retInt;
	}

}
