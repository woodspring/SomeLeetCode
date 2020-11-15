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
			
//			logger.info("MAX_INT:{}" + Integer.MAX_VALUE);
//			int testV =0;
//			for (int ind =0; ind < Integer.MAX_VALUE; ind++) {
//				int  test = (int)Math.pow(2,  ind);
//				testV += test;
//				if ( test < Integer.MAX_VALUE) {
//					logger.info("testV: ind:{}; tesVt:{}", ind, testV);
//				} else {
//					logger.info(" ind:{} > MAX_VALUE; {}", ind, testV);
//					break;
//				}
//				if ( test < Integer.MAX_VALUE) {
//					logger.info("ind:{}; test:{}, log2:{}", ind, test, (int)(Math.log(test)/Math.log(2.0)));
//				} else {
//					logger.info(" ind:{} > MAX_VALUE; {}", ind, test);
//					break;
//				}
//			}
//
//			int num1 = 1073741818;
//			int one1 = 1073741809;
//
//			int levelNum = (int)(Math.log( num1)/Math.log(2.0));
//			int levelOne = (int)(Math.log( one1) / Math.log(2.0));
//			logger.info("levelNum:{}, levelOne:{}", levelNum, levelOne);;
//			if ( levelNum == levelOne) {
//				int endPos1 = num1;
//				logger.info( "== one:{}, endPos:{}", one1, endPos1);
//			} else {
//				int endPos1 = (int)(Math.pow(2,  levelOne +1)) -1;
//				logger.info( "one:{}, endPos:{}", one1, endPos1);
//			}
			for ( int ind=0; ind < iLen; ind++) {
				startPos = endPos+1;
				int  test = (int)Math.pow(2,  ind);
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
	
	
	
	
	
	public int[] testOne2(int num, int[] theArr, int one) throws Exception{
		if ( one > num) throw new  Exception("ONE larger NUM");
		double log2 = Math.log(2.0);
		int levelNum = (int)(Math.log(num)/log2);
		if (levelNum > 30) throw new  Exception("NUM is too large");
				int[] retList;
		if ( (1 == one)  ) {
			retList = new int[1];
			retList[0] = -1;
		} else {
			int iLen = theArr.length;
			int startPos =0;
			int endPos = 0;
			int levelOne = (int)(Math.log( one) / log2);
			if ( levelNum == levelOne) {
				endPos = num;
				startPos = (int)(Math.pow(2,  levelOne));
			} else {
				startPos = (int)(Math.pow(2,  levelOne));
				endPos = (int)(Math.pow(2,  levelOne+1)) -1;
			}
			
			logger.info("  startPos:{}, endPos:{}, ", startPos, endPos);
			
			//endPos = Math.max( one,  endPos);		
			//endPos = ( iLen < endPos) ? iLen : Math.max( one,  endPos);
			int size = endPos - startPos +1;
			if ( 1 == size) {
				retList = new int[1];
				retList[0] = -1;
				return retList;
			}
			logger.info("  startPos:{}, endPos:{}, size:{}", startPos, endPos, size);
			retList = new int[ size-1];
			//logger.info("  startPos:{}, endPos:{}, size:{}, retSize:{}", 
			//		startPos, endPos, size,  retList.length);
			for ( int ind =0, indS = startPos; indS <= endPos; indS++) {
				//logger.info( "ind:{}, indS:{} endPos:{} one:{}", ind, indS, endPos, one);
				if (indS == one) continue;
				retList[ind++] = indS-1; //theArr[ indS-1]; 
			}
			logger.info("retList:{}", retList.length);
			
		}
		return retList;
	}
}
