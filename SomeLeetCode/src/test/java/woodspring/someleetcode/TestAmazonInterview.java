package woodspring.someleetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import woodspring.someleetcode.service.impl.AmazonInterview;

public class TestAmazonInterview {
	
	@Test
	public void testAmazonInterview() {
		AmazonInterview aint = new AmazonInterview();
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(4);testList.add(1);testList.add(9);testList.add(14);testList.add(24);
		testList.add(5);testList.add(15);testList.add(19);testList.add(214);testList.add(7);
		testList.add(16);testList.add(10);testList.add(6);testList.add(11);testList.add(20);
		Integer theKey = 25;
		List<AmazonInterview.PairObject> retList = aint.findPair(testList, theKey);
		assertNotNull( retList);
		
	}

}
