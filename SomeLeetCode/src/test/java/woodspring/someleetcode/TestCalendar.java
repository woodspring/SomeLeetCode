package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.Calendar;

public class TestCalendar {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private Calendar calendar = null;
	
	@Test
	public void testCalendar() {
		calendar = new Calendar(2);
		assertTrue( calendar.book(10,  20));
		assertFalse( calendar.book(15,  25));
		assertTrue( calendar.book(20,  30));
		assertTrue( calendar.book(8,  10));
		assertFalse( calendar.book(6, 9));
		logger.info("Calendar 2 result:{}",calendar.toString());
	}

	
	@Test
	public void testCalendar2() {
		calendar = new Calendar(3);
		assertTrue( calendar.book(10,  20));
		assertTrue( calendar.book(50,  60));
		assertTrue( calendar.book(10,  40));
		assertFalse( calendar.book(5,  15));
		assertTrue( calendar.book(5,  10));
		assertTrue( calendar.book(25,  55));
		logger.info("Calendar 3 result:{}",calendar.toString());
	}

}
