package woodspring.someleetcode.HackerRank;

import java.util.Collections;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUnique {
	private static final Logger logger = LoggerFactory.getLogger(StringUnique.class);
	
	public boolean isUniqueStringN2(String theString) {
		boolean bRet = true;
		if ( theString == null || theString.isBlank() || theString.isEmpty()) return false;
		int lenStr = theString.length();
		for ( int indX = 0; indX < lenStr; indX++ ) {
			for ( int indY = indX; indY < lenStr; indY++) {
				if ( theString.charAt( indX) == theString.charAt( indY) ) {
					bRet =false;
					break;
				}
			}
		}
		return bRet;
		
	}
	
	public boolean isUniqueString1( String theStr) {
		boolean bRet = true;
		if ( theStr == null || theStr.isBlank() || theStr.isEmpty()) return false;
		
		char[] theArr = new char[1024];
		for ( int indX =0; indX < theArr.length; indX++) {
			theArr[indX] = '~';
		}
		int lenS = theStr.length();
		for ( int indX=0; indX < lenS; indX++) {
			char indY = theStr.charAt( indX);
			if ('~' == theArr[indY] ) {
				theArr[indX] = 'X';
			} else {
				bRet = false;
				break;
			}
		}
		return bRet;	
	}
	
	public boolean isUniqueStringS(String theStr) {
		boolean bRet = true;
		bRet = theStr.chars().filter(  con -> Collections.frequency( theStr.chars().boxed().collect( Collectors.toList()), con) > 1).count() > 1 ? false : true; 
		return bRet;
	}
	

}
