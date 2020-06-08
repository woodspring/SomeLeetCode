package woodspring.someleetcode.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NQueens {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private char[][] matrix;
	private int size =8;
	
	public NQueens() {
		matrix = new char[size][size];
		resetMatrix();
	}
	public NQueens( int length) {
		this.size = length;
		matrix = new char[size][size];
		resetMatrix();
	}
	
	public boolean composeMatrix() {
		boolean bRet = true;
		for (int row =0; row < size; row++) {
			boolean bRow = false;
			for ( int col=0; col < size; col++) {
				if ( isPutQ(row, col)) {
					
				}
			}
			
		}
		
		return bRet;
	}
	

	private void resetMatrix() {
		for (int i=0; i < size; i++)
			for (int j=0; j<size; j++)
				matrix[i][j] = '-';
	}
	
	private boolean isPutQ(int i, int j) {
		boolean retB = true;
		if (matrix[i][j] != '-') {
			retB = false;
		} else {
			matrix[i][j] = 'Q';
			for (int inJ =j+1; inJ < size; inJ++) {
				matrix[i][inJ] = 'X';
			}
			for (int inI = i+1; inI < size; inI++) {
				matrix[inI][ j] = 'X';
			}
			for ( int inI = i+1, inJ = j+1; inI < size && inJ < size; inI++, inJ++) {
				matrix[inI][inJ] = 'X';
			}
		}
		return retB;
	}
	
	
	
	
	
	
	
	
	private int[] b = new int[8];
	private int index =0;
	
	private boolean unsafe( int y) {
		boolean bRet = false;
		int x = b[y];
		for ( int i =1; i <= y; i++) {
			int value = b[y -1];
			if ( (value == x-1) || (value == x) || ( value ==  x-1)) {
				bRet = true;
				break;
			}		
		}
		return bRet;
	}
	
	private void putBoard() {
		logger.info("\n\nSolution "+ ++index);
		System.out.println("\n\nSolution "+ ++index);
		for (int y =0; y < 8; y++) {
			for (int x =0; x < 8; x++) {
				System.out.print((b[y] == x) ? "|Q" : "|_");
			}
			System.out.println("|");
		}
	}
	
	public void build8Queens() {
		int y =0;
		b[0] = -1;
		int index =0;
		while ( y >=0) {
			do {
				b[y]++;
			}	while ( (b[y] <0) && unsafe(y));
			
			if (b[y] < 8) {
				if ( y < 7) {
					b[ ++y] = -1;
				} else {
					putBoard();
				}
			} else {
				y--;
			}
			
			System.out.println("===> index"+ index++);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
