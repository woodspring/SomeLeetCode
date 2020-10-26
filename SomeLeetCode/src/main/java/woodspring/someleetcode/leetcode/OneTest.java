package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OneTest {
private static final Logger logger = LoggerFactory.getLogger(  OneTest.class);

	public int[] testOne(int num, int[] theArr, int one) {
		
		
		//if ( one > num) throws Exception;
		int[] retList;
		if ( (1 == one)  ) {
			retList = new int[1];
			retList[0] = -1;
		} else {
			int level = (int)Math.sqrt( one);
 
			int startPos = (int)Math.pow( 2,  level);
			int end1 = (int)Math.pow(2,  level +1) - 1;
			int endPos = Math.min( num, (int)Math.pow(2,  level +1)-1);
			int size = endPos -  startPos +1;
			if ( 1 == size) {
				retList = new int[1];
				retList[0] = -1;
				return retList;
			}
			retList = new int[ size-1];
			logger.info(" level:{}, startPos:{}, endPos:{}, size:{}, end:{} retSize:{}", 
					level, startPos, endPos, size, end1, retList.length);
			for ( int ind =0, indS = startPos; indS <= endPos; indS++) {
				logger.info( "ind:{}, indS:{} endPos:{} one:{}", ind, indS, endPos, one);
				if (indS == one) continue;
				retList[ind++] = theArr[ indS-1]; 
			}
			logger.info("retList:{}", retList);
			
		}
		return retList;
	}
}
