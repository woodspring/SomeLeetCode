package woodspring.someleetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.HackerRank.QueensAttack;

public class TestQueensAttack {
	private final static Logger  logger = LoggerFactory.getLogger( TestQueensAttack.class);
	
	
	@Test
	public void testQueensAttach() {
		QueensAttack qAttack = new QueensAttack() ;
		
		List<String> testStr = new ArrayList<>();
		
		testStr.add("4 0");
		testStr.add("4 4");
		List<String> result = qAttack.findQueensAttach(testStr);
		logger.info(" result:{}", result);
		
	}
	
	@Test
	public void testQueensAttach01() {
		QueensAttack qAttack = new QueensAttack() ;
		
		List<String> testStr = new ArrayList<>();
		
		testStr.add("1 0");
		testStr.add("1 1");
		List<String> result = qAttack.findQueensAttach(testStr);
		logger.info(" result:{}", result);
		
	}
	
	@Test
	public void testQueensAttach02() {
		QueensAttack qAttack = new QueensAttack() ;
		
		List<String> testStr = new ArrayList<>();
		
		testStr.add("5 3");
		testStr.add("4 3");
		testStr.add("5 5");
		testStr.add("4 2");
		testStr.add("2 3");
		List<String> result = qAttack.findQueensAttach(testStr);
		logger.info(" result:{}", result);
		
	}

}
