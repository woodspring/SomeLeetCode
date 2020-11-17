package woodspring.someleetcode;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.codity.BTRelative;

public class TestBTRelative {
	private final static Logger logger = LoggerFactory.getLogger(TestBTRelative.class );
	
	@Test
	public void testBTRelative() {
		BTRelative btr = new BTRelative();
		int test  = Integer.MAX_VALUE;
		int M = 2345;
		btr.findBTRelatives(test, M);
		
		test  = Integer.MAX_VALUE - 100 ;
		M = 1023;
		btr.findBTRelatives(test, M);
		
		test  = Integer.MAX_VALUE - 3 ;
		M = Integer.MAX_VALUE - 500;
		btr.findBTRelatives(test, M);
		test  = 1 ;
		M = 1;
		List<Integer> retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{} M:{} result:{}", test, M ,retList);
		test  = 2 ;
		M = 2;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{} M:{} result:{}", test, M ,retList);
		test  = 3 ;
		M = 2;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}",test,M, retList);
		test  = 4 ;
		M = 3;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}", test,M,retList);
		test  = 4 ;
		M = 4;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}", test,M,retList);
		test  = 7 ;
		M = 3;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}", test,M,retList);
		test  = 7 ;
		M = 4;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}", test,M,retList);
		test  = 8 ;
		M = 5;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}", test,M,retList);
		test  = 8 ;
		M = 7;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}", test,M,retList);
		test  = 8 ;
		M = 8;
		retList = btr.findBTRelatives(test, M);
		logger.info("TEST:{}, M:{} result:{}", test,M,retList);
		
		
	}

}
