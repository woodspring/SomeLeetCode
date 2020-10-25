package woodspring.someleetcode.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsecutiveChar {
	private static final Logger logger = LoggerFactory.getLogger(ConsecutiveChar.class);
	
	
	public int numberConsecutiveChar(String theString) {
		int retInt =0;
		boolean stop = false;
		int ind=0;
		while (!stop) {
			int theLen = 0;
			if ( theString.charAt(ind) == theString.charAt(ind +1)) {
				theLen = 2;
				int offset = 2;
				boolean stop2 = false;
				while (!stop2 ) {
					//logger.info("char:{}-0-  ind:{}, offset:{} theLen:{}, retInt:{}", theString.charAt(ind), ind, offset, theLen, retInt);
					if ( ind+ offset > theString.length() -1) {
						if ( theLen > retInt) retInt = theLen;
						stop2 = true; stop = true;
						break;
					}
					//logger.info("char:{}-0-  ind:{}, offset:{} theLen:{}, retInt:{}", theString.charAt(ind), ind, offset, theLen, retInt);
					if ( theString.charAt(ind) == theString.charAt( ind+ offset) ) {
						offset++;
						theLen++;
					} else {
						stop2 = true;
						ind += (offset-1);								
						if (theLen > retInt )		retInt = theLen;
					}									
				}
			} else {
				ind++;
			}
			if ( !(ind < (theString.length()-1)) ) {
				stop = true;
			}
			
		}
		logger.info( "retInt:{}", retInt);
		return retInt;
	}
	
	public int reWriteCC(String str) {
		if ( str == null || str.length() ==0) return 0;
		if ( str.length() == 1) return 1;
		int retMax = 1;
		boolean stop = false;
		int ind =0;
		int offset =1;
		while ( !stop ) {
			
			if ( str.charAt(ind) == str.charAt(ind+offset)) {
				if ((offset+1) > retMax) {
					retMax = offset+1;
				}
				offset++;
			} else {
				ind++;
				offset =1;
				
			}
			
			if ( !((ind+ offset) < (str.length()))) {
				stop = true;
			}
			
		}
		logger.info( "rewrite ---- retInt:{}", retMax);
		return retMax;
	}

}
