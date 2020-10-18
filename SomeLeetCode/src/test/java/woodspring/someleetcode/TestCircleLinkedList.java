package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.CircleLinkedList;


public class TestCircleLinkedList {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private CircleLinkedList circleList = new CircleLinkedList(1000);
	
	@Test
	public void testNullcircleList() {
		assertNotNull( circleList.toString());
	}

	@Test
	public void testcircleListPutAtHead() {
		circleList.putAtHead(200);
		logger.info("testcircleListPutAtHead->circleList:{}", circleList.toString());
		assertNotNull( circleList.toString());
	}
	
	@Test
	public void testcircleListPutAtTail() {
		circleList.putAtHead(200);
		circleList.putAtHead(210);
		circleList.putAtHead(220);
		//circleList.putAtHead(230);
		circleList.putAtTail(530);
		logger.info("testcircleListPutAtTail->circleList:{}", circleList.toString());
		assertNotNull( circleList.toString());
	}
	
	@Test
	public void testcircleListPutAtPositionOutOflength() {
		circleList.putAtHead(200);
		circleList.putAtHead(210);
		circleList.putAtHead(220);
		circleList.putAtHead(230);
		circleList.putAtTail(2430);
		circleList.putAtPosition(12, 720);
		logger.info("testcircleListPutAtPositionOutOflength->circleList:{}", circleList.toString());
		assertNotNull( circleList.toString());
	}
	
	@Test
	public void testcircleListPutAtPosition() {
		circleList.putAtHead(200);
		circleList.putAtHead(210);
		circleList.putAtHead(220);
		circleList.putAtHead(230);
		circleList.putAtTail(2430);
		circleList.putAtPosition(2, 720);
		logger.info("testcircleListPutAtPosition->circleList:{}", circleList.toString());
		assertNotNull( circleList.toString());
	}
	
	
}
