package woodspring.someleetcode;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.service.impl.MaxHeap;

public class TestMaxHeap {
	private final static Logger logger = LoggerFactory.getLogger(TestMaxHeap.class);
	
	//@Test
	public void testInsert() {
		int level = 5;
		MaxHeap maxHeap = new MaxHeap(level);
		
		maxHeap.insert(20);
		maxHeap.insert(30);
		maxHeap.insert(8);
		
		String theStr = maxHeap.toString();
		logger.info(" MaxHeap:{}", theStr);
		assertNotNull( theStr);
		int max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "30");
		maxHeap.insert(230);
		maxHeap.insert(3);
		maxHeap.insert(19);
		maxHeap.insert(58);
		maxHeap.insert(97);
		maxHeap.insert(81);
		theStr = maxHeap.toString();
		logger.info(" MaxHeap:{}", theStr);
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "230");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "97");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "81");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "58");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "20");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "19");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "8");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
//		assertEquals( Integer.valueOf(max).toString(), "3");
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		//assertEquals( Integer.valueOf(max).toString(), "1");
	}
	@Test
	public void testInsertOnly3() {
		int level = 3;
		MaxHeap maxHeap = new MaxHeap(level);
		
		maxHeap.insert(20);
		maxHeap.insert(30);
		maxHeap.insert(8);
		int max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "30");
		
		maxHeap.insert(100);
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "100");
		
		maxHeap.insert(9);
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "20");
		
		maxHeap.insert(19);
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "19");
		maxHeap.insert(7);
		max = maxHeap.getMax();
		logger.info(" MaxHeap: max:{}, heap:\n{}", max, maxHeap.toString());
		assertEquals( Integer.valueOf(max).toString(), "8");
	}
	
}
