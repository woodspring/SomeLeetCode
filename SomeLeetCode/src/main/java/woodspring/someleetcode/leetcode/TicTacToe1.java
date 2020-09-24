package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicTacToe1 {
	private static final Logger logger = LoggerFactory.getLogger( TicTacToe1.class);

	private int[] rows;
	private int[] cols;
	private int diag = 0;
	private int antiDiag = 0;
	private int size =0;
	
	public TicTacToe1(int size) {
		this.size = size;
		rows = new int[size];
		cols = new int[size];
		for ( int ind=0; ind < size; ind++) {
			rows[ind] = 0; cols[ind] =0;
		}
	}
	
	public int put ( int row, int col, int player) {
		int iPlayer =0; // return play 1 or 2 is player 1, 2 ; return 0 no winer
		boolean bRet = false;
		int value = (player == 1) ? 1 : -1;
		
		rows[ row ] += value;
		cols[ col ] += value;
		if ( row == col) diag += value;
		if ( row == (size - col -1)) antiDiag += value;
		
		if ( (size == Math.abs( rows[row])) || (size == Math.abs( cols[ col ])) ||
				(size == Math.abs( diag)) || (size == Math.abs( antiDiag))	) {
			iPlayer = player;
			bRet = true;
		}
		
		if ( bRet ) iPlayer = player;
		
		logger.info( "row:{}, col:{}, player:{}", row, col, player);
		logger.info("rows:[ {} {} {}]", rows[0], rows[1], rows[2]);
		logger.info("cold:[ {} {} {}]", cols[0], cols[1], cols[2]);
		logger.info("diag:{}  antiDiag:{}", diag, antiDiag);
		logger.info("bRet:{}  winer:{}", bRet, iPlayer);
		
		return iPlayer;
	}
}
