package woodspring.someleetcode.leetcode;

public class NotLeetReplaceDigits {
	
	public int replaceAWithB( int num, int A, int B) {
		String strA = Integer.valueOf(A).toString();
		//String strB = Integer.valueOf(B).toString();
		char charB = Integer.valueOf(B).toString().charAt(0);
		//char charA = strA.charAt(0), charB = strB.charAt(0);
		String strNumber = Integer.valueOf(num).toString();
		StringBuffer numberStrBuf = new StringBuffer( strNumber);
		int strLen = strNumber.length();
		
		//boolean loop = true;
		while (true) {
			int index = numberStrBuf.indexOf(strA);
			if (index == -1) break;
			numberStrBuf.setCharAt(index, charB);
		}
		//for ( int ind =0; ind < strLen; ind++) {			 
			//if ( strNumber.charAt(ind) == charA) 
			//	numberStrBuf.setCharAt(ind, charB);
		//}
		return Integer.valueOf(numberStrBuf.toString()).intValue();
		
	}
	
	public int highestPower2( int num) {
		int result = 1;
		if ( num ==1) return 1;
		for ( int ind =0; ind < (num /2); ind++) {
			int valid = result *2;
			if ( valid > num) break;
			else result = valid;				
		}
		return result;
	}

}
