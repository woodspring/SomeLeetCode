package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IslandNumber {
	private final static Logger logger = LoggerFactory.getLogger(IslandNumber.class);
	int[] dirX = { -1,  0, 1,-1, 1, -1, 0, 1};
	int[] dirY = { -1, -1,-1, 0, 0,  1, 1, 1};
	
	int[] dir4X = { 0, 1, 0, 1};
	int[] dir4Y = {-1, 0, 1, 0};
	public int findIslandNumber( int[][] map, int k, int m) {
		int retInt = 0;
		char[][] islandMap = new char[k][m];
		
		for (int indK =0; indK < k; indK++) 
			for ( int indM=0; indM < m; indM++) {
//				logger.info("indK:{}/{} indM:{}/{}", indK, k, indM, m);
				islandMap[indK][indM] = ( 1== map[indK][indM] ) ? '1' : '0';
				
			}

		for ( int indK =0; indK < k; indK++) 
			for ( int indM=0; indM < m; indM++) {
				if ( '1' == islandMap[indK][indM]) {
					retInt++;
					indexMap( islandMap, indK, indM);
				}
			}
		
		for ( int indK =0; indK < k; indK++) {
			StringBuffer strBuf = new StringBuffer();
			for ( int indM=0; indM < m; indM++) {
				strBuf.append(islandMap[indK][indM]+ " " );
			}
			logger.info("line{} :[{}]", indK, strBuf.toString());
		}
		logger.info( " island number:{}",retInt);
		return retInt;
	}
	
	
	
	public int findIslandNumberOnly4( int[][] map, int k, int m) {
		int retInt = 0;
		char[][] islandMap = new char[k][m];
		
		for (int indK =0; indK < k; indK++) 
			for ( int indM=0; indM < m; indM++) {
				islandMap[indK][indM] = ( 1== map[indK][indM] ) ? '1' : '0';
			}

		for ( int indK =0; indK < k; indK++) 
			for ( int indM=0; indM < m; indM++) {
				if ( '1' == islandMap[indK][indM]) {
					logger.info("================================getIsland:{} {} ", indK, indM);
					retInt++;
					index4Map( islandMap, indK, indM);
				}
			}
		
		for ( int indK =0; indK < k; indK++) {
			StringBuffer strBuf = new StringBuffer();
			for ( int indM=0; indM < m; indM++) {
				strBuf.append(islandMap[indK][indM]+ " " );
			}
			logger.info("line{} :[{}]", indK, strBuf.toString());
		}
		logger.info( " island number:{}",retInt);
		return retInt;
	}
	
	public void indexMap(char[][] islandMap, int k, int m  ) {

		int lenK = islandMap.length;
		int lenM = islandMap[0].length;
		if ( k < 0 || k >= lenK || m < 0 || m >= lenM || ('1' != islandMap[k][m]) ) return;
		islandMap[k][m] = 'X';
		
		for ( int ind =0; ind < 8; ind++) 			
			indexMap(islandMap,  k+ dirX[ind], m + dirY[ind]);
	}
	
	public void index4Map(char[][] islandMap, int k, int m) {

		int lenK = islandMap.length;
		int lenM = islandMap[0].length;
		
		if ( k < 0 || k >= lenK || m < 0 || m >= lenM || ('1' != islandMap[k][m]) ) return;
		logger.info("--k: {}/{} m:{}/{}", k, lenK, m,  lenM);
		islandMap[k][m] = 'X';
		
		for ( int ind =0; ind < 4; ind++) {
			logger.info("--{}-- k: {}/{} m:{}/{}, value:{}",ind, k, k+ dir4X[ind], m,  m + dir4Y[ind], islandMap[k][m]);
			index4Map(islandMap,  k+ dir4X[ind], m + dir4Y[ind]);
		}
	}

}
