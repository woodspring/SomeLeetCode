package woodspring.someleetcode;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.HackerSequenceEquation;



public class TestHackerSequenceEquation {
	private static final Logger logger = LoggerFactory.getLogger(TestHackerSequenceEquation.class );
	
	@Test
	public void testHackerSequenceEquation() {
		HackerSequenceEquation hSeqEqu = new HackerSequenceEquation();
		List<String> theList = new ArrayList<String>();
		theList.add("3");
		theList.add("2 3 1");
		List<String> ret = hSeqEqu.findSeqEquation( theList);
		logger.info(" result:{}", ret );
	}

	
	@Test
	public void testHackerSequenceEquation01() {
		HackerSequenceEquation hSeqEqu = new HackerSequenceEquation();
		List<String> theList = new ArrayList<String>();
		theList.add("5");
		theList.add("4 3 5 1 2");
		List<String> ret = hSeqEqu.findSeqEquation( theList);
		logger.info(" result:{}", ret );
	}
	
	@Test
	public void testHackerSequenceEquation02() {
		HackerSequenceEquation hSeqEqu = new HackerSequenceEquation();
		List<String> theList = new ArrayList<String>();
		theList.add("7");
		theList.add("4 3 5 1 2");
		List<String> ret = hSeqEqu.findSeqEquation( theList);
		logger.info(" result:{}", ret );
	}
}
