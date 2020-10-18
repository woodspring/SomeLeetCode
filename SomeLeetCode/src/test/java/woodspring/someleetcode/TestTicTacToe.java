package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import woodspring.someleetcode.leetcode.TicTacToe;
import woodspring.someleetcode.leetcode.TicTacToe1;


public class TestTicTacToe {
	
//	@Test
//	public void testTicTacToe() {
//		TicTacToe ttt = new TicTacToe(3);
//		int winner = ttt.put(1,  1,  1);
//		assertEquals(0,  winner);
//		winner = ttt.put(0,  0,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(0,  1,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(2,  1,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(1,  2,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(1,  0,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(2,  0,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(0,  2,  2);
//		assertEquals( 0, winner);
//		
//		
//	}
//	
//	@Test
//	public void testTicTacToe1() {
//		TicTacToe1 ttt = new TicTacToe1(3);
//		int winner = ttt.put(1,  1,  1);
//		assertEquals(0,  winner);
//		winner = ttt.put(0,  0,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(0,  1,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(2,  1,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(1,  2,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(1,  0,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(2,  0,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(0,  2,  2);
//		assertEquals( 0, winner);
//		
//	}
//
//	@Test
//	public void testTicTacToe01() {
//		TicTacToe ttt = new TicTacToe(3);
//		int winner = ttt.put(2,  1,  1);
//		assertEquals(0,  winner);
//		winner = ttt.put(0,  1,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(1,  1,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(0,  2,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(0,  0,  1);
//		assertEquals( 0, winner);
//		winner = ttt.put(1,  2,  2);
//		assertEquals( 0, winner);
//		winner = ttt.put(2,  2,  1);
//		assertEquals( 1, winner);
////		winner = ttt.put(2,  2,  2);
//		//assertEquals( 0, winner);
//		
//		
//	}
	
	@Test
	public void testTicTacToe11() {
		TicTacToe1 ttt = new TicTacToe1(3);
		int winner = ttt.put(2,  1,  1);
		assertEquals(0,  winner);
		winner = ttt.put(0,  1,  2);
		assertEquals( 0, winner);
		winner = ttt.put(1,  1,  1);
		assertEquals( 0, winner);
		winner = ttt.put(0,  2,  2);
		assertEquals( 0, winner);
		winner = ttt.put(0,  0,  1);
		assertEquals( 0, winner);
		winner = ttt.put(1,  2,  2);
		assertEquals( 0, winner);
		winner = ttt.put(2,  2,  1);
		assertEquals( 1, winner);

		
	}


}
