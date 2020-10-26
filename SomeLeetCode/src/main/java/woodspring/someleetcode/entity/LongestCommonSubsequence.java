package woodspring.someleetcode.entity;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LongestCommonSubsequence {
	private static final Logger logger = LoggerFactory.getLogger(LongestCommonSubsequence.class );
	
	public int findLCS( String strA, String strB) {
		int retInt = 1;
		int lenA = strA.length(), lenB = strB.length();
		int[][] maxMatrix = new int[lenA+1][lenB+1];
		for (int indA = 0; indA < lenA; indA++) {
			maxMatrix[indA][0] = 0; //indA;
		}
		for ( int indB =0; indB < lenB; indB++) {
			maxMatrix[0][indB] = 0; //indB;
		}
		
		for ( int indA=1; indA <= lenA; indA++) {
			
			//for ( int indB = indA; indB < lenB+1; indB++) {
			for ( int indB = 1; indB <= lenB; indB++) {
				int item1 = maxMatrix[indA-1][indB];
				int item2 = maxMatrix[indA][indB-1];
				int item3 = maxMatrix[indA-1][indB-1] + ( (strA.charAt( indA-1) == strB.charAt( indB-1)) ? 1 : 0);
				int iMax = Math.max( item1,  item2);
				iMax = Math.max(iMax,  item3);
				maxMatrix[indA][indB] = iMax;
				//logger.info("indA:{}/{} indB:{}/{}, A:{} B:{} max1:{}, max2:{}, max3:{}  iMax:{}", indA, lenA, indB, lenB, strA.charAt( indA-1), strB.charAt(indB-1), item1, item2, item3, iMax);
			}
			
		}

		retInt = maxMatrix[lenA][lenB];
		//logger.info("  ------------------> LCS--result:{}", retInt);
		
		return retInt;
	}
	public int rewiteLCS(String strA, String strB) {
		int retInt = 1;
		int lenA = strA.length(), lenB = strB.length();
		int[][] matrix = new int[lenA+1][lenB+1];
		
		for ( int indA =0; indA <= lenA; indA++ ) {
			for ( int indB=0; indB <= lenB; indB++) {
				if ( 0==indA || 0 == indB) 
					matrix[indA][indB] =0;
				else if (strA.charAt( indA-1) == strB.charAt( indB-1))
					matrix[indA][indB] = matrix[indA-1][indB-1]+1;
				else 
					matrix[indA][indB] = Math.max( matrix[indA-1][indB],  matrix[indA][ indB-1]);
				
				//logger.info("rewrite: indA:{}/{}, indB:{}/{},  A:{}, B:{}, value:{}", indA, lenA, indB, lenB, (indA==0) ? " " : strA.charAt(indA-1), ((indB==0) ? " " : strB.charAt( indB-1)), matrix[indA][indB]);
			}
		}
		
		retInt = matrix[lenA][lenB];
		//logger.info(" rewriteLCS---- result:{}", retInt);
		return retInt;
	}

	
	public int biLCS( String strA, String strB) {
		int retInt =1;
		int lenA = strA.length(), lenB = strB.length();
		int[][] bM = new int[2][lenB+1];
		int bIndA=0;
		for ( int indA=0; indA <= lenA; indA++) {
			bIndA = indA & 1;
			for ( int indB =0; indB <= lenB; indB++) {
				if ( 0 == indA || 0 == indB) 
					bM[bIndA][indB] = 0;
				else if ( strA.charAt( indA-1) == strB.charAt(indB-1)) 
					bM[bIndA][indB] = bM[ 1- bIndA][indB-1] +1;
				else 
					bM[bIndA][indB] = Math.max( bM[1- bIndA][indB], bM[bIndA][indB-1]);
				
				
				//logger.info("biLCS: indA:{}/{}/{}, indB:{}/{},  A:{}, B:{}, value:{}", indA, bIndA, lenA, indB, lenB, (indA==0) ? " " : strA.charAt(indA-1), ((indB==0) ? " " : strB.charAt( indB-1)), bM[bIndA][indB]);
				
			}
		}
		
		retInt = bM[bIndA][lenB];
		//logger.info(" biLCS---- result:{}", retInt);
		return retInt;
	}
	
	public int findLCSwithDP(String strA, String strB) {
		int retInt = 1;
		int lenA = strA.length(), lenB = strB.length();
		int[][] dp = new int[lenA+1][lenB+1];
		for (int indA=0; indA <= lenA; indA++)
			for (int indB=0; indB <=lenB; indB++)
				dp[indA][indB] = -1;
		
		retInt = lcsWithDP( strA, strB, lenA, lenB, dp);
		return retInt;		
	}
	
	public int lcsWithDP(String strA, String strB, int posA, int posB, int[][] dp) {
		int retInt = 0; 
		int dist = -1;
		if ( 0 == posA  || 0 == posB) return 0;
		if ( dp[posA-1][posB-1] != -1) dist = dp[ posA-1 ][ posB -1]; 
		else { 
			if ( strA.charAt(posA-1) == strB.charAt( posB-1)) {
				dist = lcsWithDP( strA, strB, posA-1, posB-1, dp) +1;
			} else {
				dist = Math.max( lcsWithDP( strA, strB, posA-1, posB, dp),  lcsWithDP( strA, strB, posA, posB-1, dp));
			}
			dp[posA-1][posB-1] = dist;			
		} 
		retInt = dist;
		//logger.info("result:{} -> posA:{}, posB:{} ", retInt, posA, posB);
		return retInt;
	}
}
