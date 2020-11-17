package woodspring.someleetcode.codity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WordCountInString {
	private final static Logger logger = LoggerFactory.getLogger( WordCountInString.class);
	

	public int countWordInString(String theStr) {
		int retInt =0;
		int sLen = theStr.length();
		if (theStr.isEmpty() || sLen < 1 || sLen > 1000) return retInt;
		String[] ses = theStr.split("\\.+|\\?+|!+");
		int sesNo = ses.length;
		int max = Integer.MIN_VALUE;
		boolean bRet = false;
		for (int ind=0; ind<sesNo && !bRet; ind++) {
			String sesStr = ses[ind].trim();
			//logger.info("ind:{}  sesStr:{}", ind, sesStr);
			for ( int indX =0; indX < sesStr.length(); indX++) {
				if ( Character.isDigit( sesStr.charAt(indX))) {
					max =0;
					bRet=true;
					break;
				}
			}
			if (!bRet) { 
				String[] words = sesStr.split("\\s+");
				int wordsNo = words.length;
			//logger.info("ind:{} words no:{}",ind, wordsNo);
				if ( max < wordsNo) max = wordsNo;
			}
		}
		
		retInt = (max < 0 ||  bRet) ? 0 : max;
		//logger.info( "retInt:{}", retInt);		
		return retInt;
	}
}
