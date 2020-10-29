package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.IslandNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIslandNumber {
	private static final Logger logger = LoggerFactory.getLogger( TestIslandNumber.class);
	
	
	@Test
	public void testIslandNumber() {
		IslandNumber iNum = new IslandNumber();
		int[][] map = { {1,1,0,0,0},
						{0,1,0,0,1},
						{0,0,0,1,1},
						{0,0,0,0,0},
						{0,0,0,0,1}
		};
		int k=5, m =5;
		int retInt = iNum.findIslandNumber(map,  k,  m);
		assertEquals( 3, retInt);
	}
	
	@Test
	public void testIslandNumber1() {
		IslandNumber iNum = new IslandNumber();
		int[][] map = { {1,1}};
		
		int k=1, m =1;
		int retInt = iNum.findIslandNumber(map,  k,  m);
		assertEquals( 1, retInt);
	}
	
	@Test
	public void testIslandNumberOnly4() {
		IslandNumber iNum = new IslandNumber();
		int[][] map = { {1,1,1,1,0},
						{1,1,0,1,0},
						{1,1,0,0,0},
						{0,0,0,0,0}
		};
		int k=4, m =5;
		int retInt = iNum.findIslandNumberOnly4(map,  k,  m);
		assertEquals( 1, retInt);
	}
	@Test
	public void testIslandNumberOnly41() {
		IslandNumber iNum = new IslandNumber();
		int[][] map = { {1,1,0,0,0},
						{1,1,0,0,0},
						{0,0,1,0,0},
						{0,0,0,1,1}
		};
		int k=4, m =5;
		int retInt = iNum.findIslandNumberOnly4(map,  k,  m);
		logger.info("testIslandNumberOnly41->result:{}", retInt);
		//assertEquals( 3, retInt);
	}

}
