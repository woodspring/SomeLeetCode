package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.Exception.LeetcodeException;

public class TicTacToe {

	private static final Logger logger = LoggerFactory.getLogger( TicTacToe.class);
	
	private int[][] board;
	private int size =0;

	
	public TicTacToe(int size) {
		board = new int[size][size];
		for ( int indX=0; indX < size; indX++) 
			for ( int indY = 0; indY < size; indY++)
				board[indX][indY] =0;
		this.size = size;
		
	}
	
	public int put(int row, int col, int player) throws LeetcodeException {
		int winner =0;
		boolean bRet = true;
		logger.info( "row:{}, col:{}, player:{} board：{}", row, col, player, board[row][col]);
		if ( 0 !=   board[row][col]) throw new LeetcodeException( "40009");
		board[row][col] = player;
int iTest=0;		
int i=0;
		for ( int indY =0; indY < size; indY++, i++) {
			
			if ( player != board[row][indY]) {
				// not win even board[row][col] ==0
				bRet = false;
				
				break;
			}
		}
		logger.info( "iTest:{}, bRet：{}-{} row:{}, col:{}, player:{} ", iTest++, bRet, i, row, col, player);
		if ( bRet) return player;
		else bRet = true;
		
		for ( int indX =0; indX < size; indX ++) {
			if ( player != board[indX ][col]) {
				// not win even board[row][col] ==0
				bRet = false;
				break;
			}
		}
		logger.info( "iTest:{}, row:{}, col:{}, player:{} bRet：{}", iTest++, row, col, player, bRet);
		if ( bRet) return player;
		else bRet = true;
		for ( int indX =0; indX < size; indX ++) {
			if ( player != board[indX ][col]) {
				// not win even board[row][col] ==0
				bRet = false;
				break;
			}
		}
		logger.info( "iTest:{}, row:{}, col:{}, player:{} bRet：{}", iTest++, row, col, player, bRet);
		if ( bRet) return player;
		else bRet = true;
		for ( int indX =0; indX < size; indX ++) {
			if (  ( board[indX][indX] != player)) {
				// not win even board[row][col] ==0
				bRet = false;
				break;
			}
		}
		logger.info( "iTest:{}, row:{}, col:{}, player:{} bRet：{}", iTest++, row, col, player, bRet);
		if ( bRet) return player;
		else bRet = true;
		for ( int indX =0; indX < size; indX++) {
			if ( ( board[indX][size - indX - 1] != player) ) {
				// diag and antiDiag
				bRet = false;
				break;
			}
		}
		logger.info( "iTest:{}, row:{}, col:{}, player:{} bRet：{}", iTest++, row, col, player, bRet);
		if ( bRet) winner = player;
		
		logger.info( "row:{}, col:{}, player:{}", row, col, player);
		for ( int ind=0; ind < size; ind++) {
			logger.info("board:[ {} {} {}]", board[ind][0], board[ind][1], board[ind][2]);
		}
		logger.info("===================winner:{}==============================", winner);
		return winner;
	}
}
