package woodspring.someleetcode.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeCheck {
	private final static Logger logger = LoggerFactory.getLogger( PrimeCheck.class);
	
	public String checkPrimary(String theStr) {
		StringBuffer strBuf = new StringBuffer();
		StringBuffer strBuf1 = new StringBuffer();
		Scanner scanner = new Scanner( theStr);
		List<Integer> intList = new ArrayList<>();
		String itemStr = new String();
		while ( scanner.hasNext() ) {
			String item = scanner.next().trim();
			Integer itemInt = Integer.valueOf( item);
			logger.info("item:[{}] itemInt:[{}]", item, itemInt);
			if ( itemInt.equals( 1)) continue;
			if ( itemInt.equals( 2)) {
				strBuf.append( String.format("%d \n", itemInt));
				strBuf1.append( String.format("%d ", itemInt));
				logger.info(" strBuf:{} strBuf1:{}", strBuf.toString(), strBuf1.toString());
				continue;
			}
			intList.add(itemInt);
			logger.info(" intList:[{}]", intList);
			
		}
		
		intList.stream().sorted().forEach(item -> {
			logger.info("-before-0- item:{} ", item);
			//if ( 0 != ( item % 2)) {
			int halfI = (int)(Math.floor(item /2));
			logger.info("-before- item:{} halfI:{}", item, halfI);
			boolean isPrime = true;
			int ind =2;
				for ( ; ind < item; ind++) {
					logger.info(" in loop ind:{} in halfI:[{}]", ind, halfI);
					if ( 0 == ( item % ind) ) {
						logger.info(" --in 0 == in loop ind:{} in halfI:[{}]", ind, halfI);
						isPrime = false;
						break;
					}
					
				}
				if ( isPrime) {
					strBuf1.append(String.format("%d ", item));
					strBuf.append(String.format("%s \n", strBuf1.toString()));

				}
				logger.info("the strBuf:[{}], strBuf1:[{}]", strBuf.toString(), strBuf1.toString());
			//}
		});
		logger.info(" result:[{}]", strBuf.toString() );
		return strBuf.toString();
	}

}
