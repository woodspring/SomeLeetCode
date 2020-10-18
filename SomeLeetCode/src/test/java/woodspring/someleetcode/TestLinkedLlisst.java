package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.LinkedList;

public class TestLinkedLlisst {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private LinkedList linkedList = new LinkedList();
	
	@Test
	public void testNullLinkedList() {
		assertNotNull( linkedList.toString());
	}

	@Test
	public void testLinkedListPutAtHead() {
		linkedList.putAtHead(100);
		logger.info("LinkedList:{}", linkedList.toString());
		assertNotNull( linkedList.toString());
	}
	
	@Test
	public void testLinkedListPutAtTail() {
		linkedList.putAtHead(100);
		linkedList.putAtHead(110);
		linkedList.putAtHead(120);
		//linkedList.putAtHead(130);
		linkedList.putAtTail(430);
		logger.info("LinkedList:{}", linkedList.toString());
		assertNotNull( linkedList.toString());
	}
	
	@Test
	public void testLinkedListPutAtPosition() {
		linkedList.putAtHead(100);
		linkedList.putAtHead(110);
		linkedList.putAtHead(120);
		linkedList.putAtHead(130);
		linkedList.putAtTail(430);
		linkedList.putAtPosition(2, 720);
		logger.info("testLinkedListPutAtPosition->LinkedList:{}", linkedList.toString());
		assertNotNull( linkedList.toString());
	}
}
