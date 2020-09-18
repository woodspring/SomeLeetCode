package woodspring.someleetcode.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class LargestChar {
	private final static Logger logger = LoggerFactory.getLogger( LargestChar.class);
	
	
	public String getLargerDoubleChar(String S) {
		char retChar = '-';
		String theString = S;
		int strLen = theString.length();
		List<String> alreadyList = new ArrayList<String>();
		for (int ind=0; ind < strLen; ind++ ) {
			char theChar = theString.charAt(ind);
			if (alreadyList.contains(  Character.toUpperCase(theChar) ) ) {
				continue;
			}
			boolean isLower = Character.isLowerCase( theChar);
			char theChar2 = ( isLower ? Character.toUpperCase( theChar) : Character.toLowerCase( theChar));
			if ( theString.contains( String.valueOf( theChar2) )) {
				theChar = isLower ? theChar2 : theChar;
				if ( Character.compare( retChar,  theChar) < 0) 
					retChar = theChar;

				alreadyList.add( String.valueOf( theChar ));

			}
		}
		
		logger.info(" the result:{}", retChar);
		return ( ('-' ==  retChar) ? "NO" : String.valueOf( Character.toUpperCase(retChar)));
	}

}
