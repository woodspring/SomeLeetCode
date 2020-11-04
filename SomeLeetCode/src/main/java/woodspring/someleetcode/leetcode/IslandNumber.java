package woodspring.someleetcode.leetcode;

import java.util.List;

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
					//logger.info("================================getIsland:{} {} ", indK, indM);
					retInt++;
					index4Map( islandMap, indK, indM);
				}
			}
		
		for ( int indK =0; indK < k; indK++) {
			StringBuffer strBuf = new StringBuffer();
			for ( int indM=0; indM < m; indM++) {
				strBuf.append(islandMap[indK][indM]+ " " );
			}
			//logger.info("line{} :[{}]", indK, strBuf.toString());
		}
		logger.info( " island number:{}",retInt);
		return retInt;
	}
	
	
	
	public int findGroup(List<String> stringList) {
		int groupCount =0;
		int lenX = stringList.size();
		int lenY = stringList.get(0).length();
		char[][] islandMap = new char[lenX][lenY];
		for ( int indX =0; indX < lenX; indX++) {
			String numStr = stringList.get(indX);
			if ( lenY != numStr.length() ) {
				groupCount = -1;
				logger.info("ERROR; number is not the same length for line:{}, number:{}", numStr.length(), numStr);
				break;
			}
			for ( int indY =0; indY < numStr.length(); indY++) {
				islandMap[ indX][indY] = ( '1' == numStr.charAt(indY)) ? '1' : '0';
			}
		}
		if ( groupCount < 0) return groupCount;

		for ( int indX =0; indX < lenX; indX++) {
			for ( int indY=0; indY < lenY; indY++) {
				if ( '1' == islandMap[ indX][indY] ) {
					groupCount++;
					index4Map( islandMap, indX, indY);
				}
			}
		}

		
		for ( int indX =0; indX < lenX; indX++) {
			StringBuffer strBuf = new StringBuffer();
			for ( int indY=0; indY < lenY; indY++) {
				strBuf.append(islandMap[indX][indY]+ " " );
			}
			logger.info("line{} :[{}]", indX, strBuf.toString());
		}
		logger.info( " island number:{}", groupCount);
		return groupCount;
	}
	
	public void indexMap(char[][] islandMap, int k, int m  ) {

		int lenK = islandMap.length;
		int lenM = islandMap[0].length;
		if ( 0 > k  || k >= lenK || 0 > m  || m >= lenM || ('1' != islandMap[k][m]) ) return;
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
			//logger.info("--{}-- k: {}/{} m:{}/{}, value:{}",ind, k, k+ dir4X[ind], m,  m + dir4Y[ind], islandMap[k][m]);
			index4Map(islandMap,  k+ dir4X[ind], m + dir4Y[ind]);
		}
	}

}
