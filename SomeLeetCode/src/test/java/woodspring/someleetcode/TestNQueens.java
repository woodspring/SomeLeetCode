package woodspring.someleetcode;

import org.junit.jupiter.api.Test;

import woodspring.someleetcode.entity.NQueens;

public class TestNQueens {
	
	private NQueens nQueen;
	
	@Test 
	public void testNQueen() {
		nQueen = new NQueens();
		
		nQueen.build8Queens();
	}

}
