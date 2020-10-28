package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OneTest {
private static final Logger logger = LoggerFactory.getLogger(  OneTest.class);

	public int[] testOne(int num, int[] theArr, int one) throws Exception{
		
		
		if ( one > num) throw new  Exception("ONE larger NUM");
		int[] retList;
		if ( (1 == one)  ) {
			retList = new int[1];
			retList[0] = -1;
		} else {
			int iLen = theArr.length;
			int startPos =0;
			int endPos = 0;
			for ( int ind=0; ind < iLen; ind++) {
				startPos = endPos+1;
				endPos += (int)Math.pow(2,  ind);
				if ( endPos >= num || endPos >= one) {
					if ( endPos >= num ) endPos = num;
					break;
				}				
			}
			logger.info("  startPos:{}, endPos:{}, ", startPos, endPos);
			
			endPos = Math.max( one,  endPos);		
			//endPos = ( iLen < endPos) ? iLen : Math.max( one,  endPos);
			int size = endPos - startPos +1;
			if ( 1 == size) {
				retList = new int[1];
				retList[0] = -1;
				return retList;
			}
			retList = new int[ size-1];
			//logger.info("  startPos:{}, endPos:{}, size:{}, retSize:{}", 
			//		startPos, endPos, size,  retList.length);
			for ( int ind =0, indS = startPos; indS <= endPos; indS++) {
				//logger.info( "ind:{}, indS:{} endPos:{} one:{}", ind, indS, endPos, one);
				if (indS == one) continue;
				retList[ind++] = theArr[ indS-1]; 
			}
			logger.info("retList:{}", retList);
			
		}
		return retList;
	}
}
