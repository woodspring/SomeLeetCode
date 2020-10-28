package woodspring.someleetcode.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PythagoreanTriplet {
	private final static Logger logger = LoggerFactory.getLogger(PythagoreanTriplet.class);
	
	public String findPythagoreanTriplet(String... inputList) {
		int listLen = inputList.length;
		String retStr = "No";
		int input1 = Integer.valueOf(inputList[0]); //testCase
		int input2 = Integer.valueOf( inputList[1]);
		retStr = getPT( input2, inputList[2]);
		logger.info(" input1{}, input2:{} input3:[{}], retStr:{}", input1, input2, inputList[2], retStr);
		return retStr;
	}
	
	
	private String getPT( int input2, String input3) {
		String retStr = "No";
		
		String[] strList = input3.split(" ");
		List<Long> longList = Arrays.asList( strList).stream()
							.map( item -> { 
								Long longV = Long.valueOf( item);
								return longV * longV;
							})
							.sorted()
							.collect( Collectors.toList());
		
		boolean retB = true;
		for ( int ind= longList.size()-1; (ind >= 2 && retB); ind--) 
			for (int  ind2 = ind-1; (ind2 >= 1 && retB); ind2-- )
				for ( int ind3 = ind2 -1; (ind3 >=0 && retB); ind3--) 
					if ( longList.get( ind) == ( longList.get(ind2) + longList.get(ind3))) {
						retStr = "Yes"; 
						retB = false;
					}
		return retStr;
	}

}
