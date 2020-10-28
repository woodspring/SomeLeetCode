package woodspring.someleetcode;

import org.junit.jupiter.api.Test;

import woodspring.someleetcode.leetcode.PythagoreanTriplet;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPythagoreanTriplet {
	
	@Test
	public void testPythagoreanTriplet() {
		PythagoreanTriplet pt = new PythagoreanTriplet();
		String inStr1 ="1";
		String inStr2 ="5";
		String inStr3 ="3 2 4 6 5";
		
		String retStr = pt.findPythagoreanTriplet(inStr1, inStr2, inStr3);
		assertEquals( retStr, "Yes");
		
		inStr1 ="1";
		inStr2 ="6";
		inStr3 ="3 2 4 6 5 9";
		
		retStr = pt.findPythagoreanTriplet(inStr1, inStr2, inStr3);
		assertEquals( retStr, "Yes");
		
		
		inStr1 ="1";
		inStr2 ="6";
		inStr3 ="3 2 7 6 5 9";
		
		retStr = pt.findPythagoreanTriplet(inStr1, inStr2, inStr3);
		assertEquals( retStr, "No");
	}

}
