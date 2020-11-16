package woodspring.someleetcode.codity;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxProductOfThree {
	private final static Logger logger = LoggerFactory.getLogger(MaxProductOfThree.class );
	
	public int solution(int[] A) {
		int retInt = 0;
		if ( A.length < 3 || A.length > 100000) return 0;
		//ConcurrentSkipListSet<Integer> theSet = new ConcurrentSkipListSet<Integer>();
		
		List<Integer> sortedList = IntStream.of( A).boxed()
				.filter( item -> (( -1000 <= item) && (item <= 1000)))
				.sorted()
				.collect( Collectors.toList()) ;
										//.stream()
										//.sorted()
										//.collect( Collectors.toList());
		int lSize = sortedList.size();
		logger.info("lSize:{} sortedList:{} ", lSize, sortedList);
		int max = sortedList.get( lSize-1), max1 = sortedList.get( lSize-2), max2 = sortedList.get( lSize-3);
		logger.info("max:{} max1:{} max2:{}", max, max1, max2);
		int min = sortedList.get( 0), min1 = sortedList.get( 1), min2 = sortedList.get( 2);
		logger.info("min:{} min1:{} min2:{}", min, min1, min2);
		int ngNum =0;
		if ( 0 > min) ngNum++;if ( 0 > min1) ngNum++;if ( 0 > min2) ngNum++;

		if ( 0 == ngNum || 1 == ngNum) {
			retInt = max * max1 * max2;
		} if ( 2 <= ngNum) {
			int abMin = (-1)*min, abMin1 = (-1)*min1; 
			if ( max*max1 > abMin*abMin1) {
					retInt =  max * max1 * max2;
			}else {
					retInt = abMin * abMin1 * max;
			}
		}
		logger.info( "retInt:{}", retInt);
		return retInt;
		
	}
	
	public int solution2(int[] A) {
		int retInt = 0;
		if ( A.length < 3 || A.length > 100000) return 0;
		//ConcurrentSkipListSet<Integer> theSet = new ConcurrentSkipListSet<Integer>();
		
		int[] maxA = new int[3];
		int[] minB = new int[3];
		int aLen = A.length;
		for ( int indA = 0; indA < 3; indA++) {
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			for ( int ind = 0; ind < aLen; ind++) {
				if (indA > 0) {
					if ( A[ind] == maxA[0]) continue; // skip 
					if ( A[ind] == minB[0]) continue; // skip
				}
				if ( indA > 1) {
					if ( A[ind] == maxA[1]) continue;
					if ( A[ind] == minB[1]) continue;
				}
				if ( (A[ind] < -1000) || (A[ind] > 1000)) continue;
				if ( A[ind] > max) max = A[ind];
				if ( A[ind] < min) min = A[ind];
				

			}
			maxA[ indA] = max;
			minB[ indA] = min;
		}


		logger.info("solution2 max:{} max1:{} max2:{}", maxA[0], maxA[1], maxA[2]);
		logger.info("solution2 min:{} min1:{} min2:{}", minB[0], minB[1], minB[2]);
		int ngNum =0;
		for ( int ind=0; ind < 3; ind++)
		if ( 0 > minB[ind]) ngNum++;
				
		if ( 0 == ngNum || 1 == ngNum) {
			retInt = maxA[0] * maxA[1]* maxA[2];
		} if ( 2 <= ngNum) {
			int maxInt = maxA[0]* maxA[1];
			int minInt = minB[0]*minB[1];
			if ( maxInt > minInt) {
				retInt = maxInt * maxA[2];
			} else {
				retInt = minInt * maxA[0];
				logger.info( "retInt:{} minInt:{}, maxA:{}", minInt, maxA[0], retInt);
			}
			
			
		}
		logger.info( "solution2 retInt:{}", retInt);
		return retInt;
		
	}

}
