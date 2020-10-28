package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.OneTest;

public class TestOneTest {
	private final static Logger logger = LoggerFactory.getLogger(TestOneTest.class);
	
//	@Test
//	public void testOneTest() {
//		OneTest oneTest = new OneTest();
//		int input1 =6;
//		int[] input2 = {1,2,3,4,5,6};
//		int input3 =5;
//		try { int[] result = oneTest.testOne( input1,  input2,  input3);
//		logger.info("result:{}", result); } catch (Exception e) {}
//		
//	}
//	
//	@Test
//	public void testOneTest1() {
//		OneTest oneTest = new OneTest();
//		int input1 =20;
//		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//		int input3 =16;
//		try { int[] result = oneTest.testOne( input1,  input2,  input3);
//		logger.info("result:{}", result); } catch (Exception e) {}
//		
//	}
//	@Test
//	public void testOneTest01() {
//		OneTest oneTest = new OneTest();
//		int input1 =20;
//		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//		int input3 =20;
//		try { int[] result = oneTest.testOne( input1,  input2,  input3);
//		logger.info("result:{}", result); } catch (Exception e) {}
//		
//	}
//	@Test
//	public void testOneTest02() {
//		OneTest oneTest = new OneTest();
//		int input1 =16;
//		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
//		int input3 =16;
//		try { int[] result = oneTest.testOne( input1,  input2,  input3);
//		logger.info("16: result:{}", result); } catch (Exception e) {}
//		
//		
//	}
	
	@Test
	public void testOneTest00() {
		OneTest oneTest = new OneTest();
		int input1 =2;
		int[] input2 = {1,2};
		int input3 =2;
		
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest000() {
		OneTest oneTest = new OneTest();
		int input1 =3;
		int[] input2 = {1,2,3};
		int input3 =2;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest0000() {
		OneTest oneTest = new OneTest();
		int input1 =3;
		int[] input2 = {1,2,3};
		int input3 =3;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest01() {
		OneTest oneTest = new OneTest();
		int input1 =6;
		int[] input2 = {1,2,3,4,5,6};
		int input3 =4;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest02() {
		OneTest oneTest = new OneTest();
		int input1 =6;
		int[] input2 = {1,2,3,4,5,6};
		int input3 =5;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest03() {
		OneTest oneTest = new OneTest();
		int input1 =6;
		int[] input2 = {1,2,3,4,5,6};
		int input3 =6;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest04() {
		OneTest oneTest = new OneTest();
		int input1 =6;
		int[] input2 = {1,2,3,4,5,6};
		int input3 =5;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest05() {
		OneTest oneTest = new OneTest();
		int input1 =6;
		int[] input2 = {1,2,3,4,5,6};
		int input3 =5;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	
	@Test
	public void testOneTest06() {
		OneTest oneTest = new OneTest();
		int input1 =9;
		int[] input2 = {1,2,3,4,5,6,7,8,9};
		int input3 =2;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9}{}  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	
	@Test
	public void testOneTest08() {
		OneTest oneTest = new OneTest();
		int input1 =9;
		int[] input2 = {1,2,3,4,5,6,7,8,9};
		int input3 =4;

		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest09() {
		OneTest oneTest = new OneTest();
		int input1 =9;
		int[] input2 = {1,2,3,4,5,6,7,8,9};
		int input3 =5;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest10() {
		OneTest oneTest = new OneTest();
		int input1 =9;
		int[] input2 = {1,2,3,4,5,6,7,8,9};
		int input3 =8;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest11() {
		OneTest oneTest = new OneTest();
		int input1 =9;
		int[] input2 = {1,2,3,4,5,6,7,8,9};
		int input3 =9;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest12() {
		OneTest oneTest = new OneTest();
		int input1 =12;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12};
		int input3 =9;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}

	@Test
	public void testOneTest158() {
		OneTest oneTest = new OneTest();
		int input1 =15;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int input3 =8;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,15}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest1512() {
		OneTest oneTest = new OneTest();
		int input1 =15;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int input3 =12;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest1515() {
		OneTest oneTest = new OneTest();
		int input1 =15;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int input3 =15;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest161() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =1;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest162() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =2;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest163() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =3;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest164() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =4;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest167() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =7;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest168() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =8;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
@Test
	public void testOneTest1615() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =15;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}
	@Test
	public void testOneTest1616() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =16;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); } catch (Exception e) {}
		
	}

	@Test
	public void testOneTestException() {
		OneTest oneTest = new OneTest();
		int input1 =16;
		int[] input2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int input3 =17;
		try { int[] result = oneTest.testOne( input1,  input2,  input3);
		logger.info("{}{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}{}=>  result:{}", input1, input3, result); 
		} 
		catch (Exception e) {
			
			logger.info("EXCEPTION:{}", e.getMessage()); }
		
	}


}
