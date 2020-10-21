package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import woodspring.someleetcode.service.impl.LargestChar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLargestChar {
	//@Autowired
	//LargestChar lChar;
	
	
	@Test
	public void testLargestCharNO() {
		LargestChar lChar =  new 		LargestChar();
		String testStr = lChar.getLargerDoubleChar("abcdEFGHijnk");
		
		assertEquals( testStr, "NO");
		
	}
	
	@Test
	public void testLargestCharK() {
		LargestChar lChar =  new 		LargestChar();
		String testStr = lChar.getLargerDoubleChar("aKbcdAzyvksjjfmmsBjnk");
		
		assertEquals( testStr, "K");
		
	}
	
	@Test
	public void testLargestCharMoreB() {
		LargestChar lChar =  new 		LargestChar();
		String testStr = lChar.getLargerDoubleChar("aBBBBBopzybbbbscdazxtbcdAzyvksjjfmmsBjnk");
		
		assertEquals( testStr, "B");
		
	}


}
