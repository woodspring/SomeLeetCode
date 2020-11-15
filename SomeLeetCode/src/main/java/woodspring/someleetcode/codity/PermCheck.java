package woodspring.someleetcode.codity;

import java.util.concurrent.ConcurrentSkipListSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PermCheck {
	private final static Logger logger = LoggerFactory.getLogger( PermCheck.class);
	
	public int isPermCheck(int[] theArr) {
		ConcurrentSkipListSet<Integer> list = new ConcurrentSkipListSet<Integer>(); 
		if ( theArr.length == 1) return 1;
		int retInt = 0; 
		int aLen = theArr.length;
		long m2 = (long)aLen * ( (long)aLen /2);
		long expected = m2 + (long)aLen / 2;
		
		long result = 0L;

		for ( int ind = 0; ind < theArr.length; ind++) {
			if ( list.contains( theArr[ind]) ) break;
			result += (long)(theArr[ind]);
			list.add( theArr[ind]);
		}
		logger.info(" expected:{} result:{}", expected, result);
		retInt = ( (expected - result) == 0L ) ? 1 : 0;
		
		return retInt;
	}

}
