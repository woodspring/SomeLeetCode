package woodspring.someleetcode.codity;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BTRelative {
	private final static Logger logger = LoggerFactory.getLogger( BTRelative.class);
	
	public List<Integer> findBTRelatives( int N, int M) {
		if ( N < M || N < 1) return null;
		List<Integer> retList = new ArrayList<>();
		if ( N < 3) return retList;
		double log2 =  Math.log(2.0);
		int levelN = (int)( Math.log( N) / log2);
		int levelM = (int)(Math.log(M) / log2);
		logger.info( "int N:{}, level:{} int M:{}, levelM:{}", N, levelN, M, levelM);
		
		int endPos = 0, startPos =0; 
		if (levelN == levelM) {
			startPos = (int)Math.pow(2,  levelN);
			endPos = N;
			logger.info("in == , startPos:{}, endPos:{}", startPos, endPos);
		} else {
			startPos = (int) Math.pow(2,  (levelM));
			endPos = (int) (Math.pow(2,  (levelM+1)) -1 );
			logger.info("in levelM , startPos:{}, endPos:{}", startPos, endPos);
		}
		for ( int ind = startPos; ind <= endPos; ind++) {
			if ( ind == M) continue;
			
			//retList.add( ind); 
		}
		return retList;

		
	}

}
