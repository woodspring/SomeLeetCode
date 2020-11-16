package woodspring.someleetcode.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HackerSequenceEquation {
	private static final Logger logger = LoggerFactory.getLogger(HackerSequenceEquation.class);

	public List<String> findSeqEquation(List<String> numStr) {
		List<String> retList = new ArrayList<>();
		int[] A = new int[100];
		List<Integer> aList = Arrays.stream( A).boxed().collect( Collectors.toList());
		if ( numStr == null || numStr.size() < 2) return retList;
		int numOfList = Integer.valueOf( numStr.get(0));
		ConcurrentSkipListMap<Integer, Integer> theMap = new ConcurrentSkipListMap<>();
		List<String> strList = Arrays.asList(numStr.get(1).split(" ") );
		List<Integer> intList = strList.stream().map( item -> Integer.parseInt( item)).collect(Collectors.toList());
		logger.info("umber:{} list size:{}", numOfList, strList.size());
		if ( numOfList > intList.size() ) {
			retList.add("ERROR number list is too short. expected:"+ numOfList+ " numberList:"+ numStr.get(1));
			return retList;
		}
//		for ( int ind= 1; ind <= intList.size(); ind++) {
		for ( int ind= 1; ind <= numOfList; ind++) {
			theMap.put( intList.get(ind-1), ind);
			//logger.info("PUT: key:{} value:{}", intList.get(ind-1), ind );
		}
		for ( int ind=1; ind <= intList.size() ; ind++) {
			Integer theIndex = theMap.get( Integer.valueOf( ind));
			//logger.info("ind:{} theIndex:{}", ind, theIndex);
			
			Integer theResult = theMap.get( theIndex);
			
			//logger.info("ind:{} theIndex:{}, resuklt Y:{}", ind, theIndex, theResult);
			retList.add( theResult.toString()+"\n");
		}
		
		
		return retList;
		
	}
}
