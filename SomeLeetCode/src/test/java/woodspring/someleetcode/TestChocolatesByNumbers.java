package woodspring.someleetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.codity.ChocolatesByNumbers;

public class TestChocolatesByNumbers {
	private final static Logger logger = LoggerFactory.getLogger( TestChocolatesByNumbers.class);
	
	
	@Test
	public void testChocolatesByNumbers() {
		ChocolatesByNumbers cho = new ChocolatesByNumbers();
		int  N = 10, M =4;
		int result = cho.eatChocolatesByNumbers(N, M);
		
	}


	@Test
	public void testChocolatesByNumbers1() {
		ChocolatesByNumbers cho = new ChocolatesByNumbers();
		int  N = 1, M =4;
		int result = cho.eatChocolatesByNumbers(N, M);
		
	}
	
	@Test
	public void testChocolatesByNumbersFor2_1() {
		ChocolatesByNumbers cho = new ChocolatesByNumbers();
		int  N = 2, M =1;
		int result = cho.eatChocolatesByNumbers(N, M);
		
	}
	
	
	@Test
	public void testChocolatesByNumbersLarge() {
		ChocolatesByNumbers cho = new ChocolatesByNumbers();
		int  N = 2000000, M =2;
		int result = cho.eatChocolatesByNumbers(N, M);
		
	}
	
	@Test
	public void testChocolatesByNumbersExtremeLarge() {
		ChocolatesByNumbers cho = new ChocolatesByNumbers();
		int  X = (int) Math.pow(2,  31), M = (int)Math.pow(2,  30);
		int N = Integer.MAX_VALUE - 7;
		M = N / 5;
		logger.info("testChocolatesByNumbersExtremeLargeINT max N:{}, M:{}   X:{}",N,M, X);
		//N -= 10;
		int result = cho.eatChocolatesByNumbersByte(N, M);
		
		logger.info("testChocolatesByNumbersExtremeLarge INT result:{} N:{}, M:{}",result, N,M);
		
	}
	
	@Test
	public void testChocolatesByNumbersExtremeLargeDiff() {
		ChocolatesByNumbers cho = new ChocolatesByNumbers();
		
		
		int test = 6,  me = 3;
		int what = test / me;
		int and = test % me;
		logger.info("test:{}, me:{}, what:{} and:{}", test, me, what, and);
		test =7;
		what = test /me;
		and = test % me;
		logger.info("test:{}, me:{}, what:{} and:{}", test, me, what, and);
		test =8;
		what = test /me;
		and = test % me;
		logger.info("test:{}, me:{}, what:{} and:{}", test, me, what, and);

		int  X = (int) Math.pow(2,  31), M = (int)Math.pow(2,  30);
		int N = Integer.MAX_VALUE - 3;
		M = N - 10;
		logger.info("testChocolatesByNumbersExtremeLargeDiff INT max N:{}, M:{}   X:{}",N,M, X);
		//N -= 10;
		int result = cho.eatChocolatesByNumbersByte(N, M);
		logger.info("testChocolatesByNumbersExtremeLargeDiff result:{} N:{}, M:{}",result, N,M);
		
	}
}
