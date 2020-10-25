package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import woodspring.someleetcode.entity.ConsecutiveChar;

public class TestConsecutiveChar {
	
	@Test
	public void testConsecutiveChar() {
		ConsecutiveChar conChar = new ConsecutiveChar();
		String testStr = "findaaaabb";
		int iRet = conChar.numberConsecutiveChar(testStr);
		assertEquals( 4, iRet);
		
		
	}
	
	
	@Test
	public void testConsecutiveChar2() {
		ConsecutiveChar conChar = new ConsecutiveChar();
		String testStr = "findtttaaaabbcccccxaaaaaaayzttttttttttttaaabc";
		int iRet = conChar.numberConsecutiveChar(testStr);
		assertEquals( 12, iRet);
		
		
	}
	
	@Test
	public void testreqriteCC() {
		ConsecutiveChar conChar = new ConsecutiveChar();
		String testStr = "findtttaaaabbcccccxaaaaaaayzttttttttttttaaabc";
		int iRet = conChar.reWriteCC(testStr);
		assertEquals( 12, iRet);
		testStr = "leetcode";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 2, iRet);
		testStr = "abbcccddddeeeeedcba";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 5, iRet);
		testStr = "triplepillooooow";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 5, iRet);
		testStr = "hooraaaaaaaaaaay";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 11, iRet);
		testStr = "tourist";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 1, iRet);
		testStr = "cc";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 2, iRet);
		testStr = null;
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 0, iRet);
		testStr = "";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 0, iRet);
		testStr = "x";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 1, iRet);
		testStr = "bb";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 2, iRet);
		testStr = "abb";
		iRet = conChar.reWriteCC(testStr);
		assertEquals( 2, iRet);
		//testStr = "aabbbbbccccdddddddeffffffggghhhhhiiiiijjjkkkkkllllmmmmmnnnnnoopppqrrrrsssttttuuuuvvvvwwwwwwwxxxxxyyyzzzzzzzz";
		//iRet = conChar.reWriteCC(testStr);
		//
		//assertEquals( 8, iRet);
		
		//"aabbbbbccccdddddddeffffffggghhhhhiiiiijjjkkkkkllllmmmmmnnnnnoopppqrrrrsssttttuuuuvvvvwwwwwwwxxxxxyyyzzzzzzzz"
	}

}
