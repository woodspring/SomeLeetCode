package woodspring.someleetcode.codity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inverse {
	
	private final static Logger logger = LoggerFactory.getLogger( Inverse.class);
	
	public int inverse(int[] theA) {
		int retInt =0 ;
		if ( theA.length < 1) return retInt;
		boolean breakAll = false;
		for ( int indX=0; !breakAll && (indX < theA.length-1); indX++) {
			if ( (theA[indX] > 2147483647) || (theA[indX] < -2147483647) || retInt > 1000000000) {
				retInt = -1;
				break;
			}
			for ( int indY = indX+1; indY < theA.length; indY++) {
				if ( (theA[indY] > 2147483647) || (theA[indY] < -2147483647)|| retInt > 1000000000) {
					retInt = -1;
					breakAll = true;
					break;
				}
				if ( theA[indX] > theA[indY]) { 
					logger.info(" [{}, {}]", indX, indY );
					retInt++;
				}
				
			}
		}
		
		return retInt;
	}
}
