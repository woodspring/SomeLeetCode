package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import woodspring.someleetcode.leetcode.MaxFlow;

public class TestMaxFlow {
	private static final Logger logger = LoggerFactory.getLogger(TestMaxFlow.class);
	
	@Test
	public void testMaxFlow() {
		MaxFlow maxFlow = new MaxFlow(10);
		int[][] graph = new int[][] {  { 0, 16, 13, 0, 0, 0},
									{ 0,  0, 10, 12, 0, 0},
									{ 0,  4,  0, 0, 14, 0},
									{ 0,  0,  9, 0, 0, 20},
									{ 0,  0,  0, 7, 0, 4},
									{ 0,  0,  0, 0, 0, 0}};
			
										
		int result = maxFlow.getMaxFlow(graph, 0, 5);
		logger.info("result:{}", result);
		assertEquals( 23, result);
		
	}

}
