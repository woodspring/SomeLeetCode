package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import woodspring.someleetcode.codity.WordCountInString;

public class TestCountWordInString {
	private final static Logger logger = LoggerFactory.getLogger(TestCountWordInString.class);
	
	@Test
	public void testCountWordInString() {
		WordCountInString cwis = new WordCountInString();
		String test = "This is a book. Is it a good day today? I hope to be good for tomorrow !";
		int retInt = cwis.countWordInString( test);
		logger.info("String:[{}], result:{}", test, retInt);
		assertEquals(7, retInt);
		
		test = "This is a book........ Is it a good day today??        .                    !??? I hope            to be good for tomorrow !!!!!";
		retInt = cwis.countWordInString( test);
		assertEquals(7, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
		
		test = "";
		retInt = cwis.countWordInString( test);
		assertEquals(0, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
		
		test = ".";
		retInt = cwis.countWordInString( test);
		assertEquals(0, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
		
		test = "1";
		retInt = cwis.countWordInString( test);
		assertEquals(0, retInt);
		test = "111111111111111111111111";
		retInt = cwis.countWordInString( test);
		logger.info("String:[{}], result:{}", test, retInt);
		assertEquals(0, retInt);
		test = "1AAAAAAAAAAAAAAAAA1";
		retInt = cwis.countWordInString( test);
		assertEquals(0, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
		test = "A";
		retInt = cwis.countWordInString( test);
		assertEquals(1, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
		test = "A!";
		retInt = cwis.countWordInString( test);
		assertEquals(1, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
		test = "A!B?C.";
		retInt = cwis.countWordInString( test);
		assertEquals(1, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
		test = "A!B C D E F?X Y Z P O .";
		retInt = cwis.countWordInString( test);
		assertEquals(5, retInt);
		logger.info("String:[{}], result:{}", test, retInt);
	}

}
