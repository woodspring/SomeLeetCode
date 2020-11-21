package woodspring.someleetcode.HackerRank;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Solution {
	private static final Logger logger = LoggerFactory.getLogger( Solution.class);
    //private static List<String> theStrList = new ArrayList<String>(3);
    private static String[] theStrList = new String[3];
    public static int identify(String str) {
      int retInt = 0;
      str = str.trim();
      int strLen = str.length();
      boolean inDigit = false;

      for ( int ind =0; ind < strLen; ind++) {
        if ( Character.isDigit( str.charAt(ind))) {
            inDigit = true;
            retInt =2;            
            continue;
        };
        if ( inDigit && ( str.charAt(ind) == '.')) {
            retInt = 1;
            break;
        };
      }
      System.out.println("RetInt:"+ retInt+" S:"+ str);
      theStrList[retInt] = str;
      //theStrList.add(retInt, str);
      return retInt;
    
    }
    
    public static int identify(String str, int index) {
        int retInt = 0;
        str = str.trim();
        int strLen = str.length();
        boolean inDigit = false;

        if ( index == 0) {
        	String regex = "[0-9]+";
        	Pattern pattern=Pattern.compile( regex);
        	Matcher matcher=pattern.matcher(str);
        	while( matcher.find()) {
        		String theStr = matcher.group();
        		theStr.trim();
        		logger.info("index:{}, str:{}, theStr:{}", index, str, theStr);
        		retInt=2;
        		theStrList[retInt]= theStr;
        		break;
        	}
       
        }
        else if (index == 1) {
        	String regex = "([0-9]+[.]+[0-9]+)";
        	Pattern pattern=Pattern.compile( regex);
        	Matcher matcher=pattern.matcher(str);
        	while( matcher.find()) {
        		String theStr = matcher.group();
        		logger.info("index:{}, str:{}, theStr:{}", index, str, theStr);
        		retInt=1;
        		theStrList[retInt]= theStr;
        		break;
        	}
        	
        } else {
        	logger.info("index:{}, str:{}", index, str);
        	theStrList[retInt] = str;
        }
        logger.info("index:{}, Str:{}, retInt:{}", index, str, retInt);
        return retInt;
      
      }
    
    
    public static int solutionV(String str, int index) {
    	        str = str.trim();
    	      int retInt = 0;
    	      int strLen = str.length();
    	      boolean inDigit = false;
    	      if ( index ==0) {
    	          Pattern pattern = Pattern.compile("-?[0-9]+");
    	          Matcher matcher = pattern.matcher( str);
    	          while ( matcher.find()) {
    	              String theStr = matcher.group(0).trim();
    	              retInt = 2;
    	              theStrList[retInt] = theStr;
    	              break;
    	          }
    	      } else if ( index == 1) {
    	          Pattern pattern = Pattern.compile("-?([0-9]+[.][0-9]+)");
    	          Matcher matcher = pattern.matcher( str);
    	          boolean found = false;
    	          String theStr = new String();;
    	          while ( matcher.find()) {
    	              theStr = matcher.group().trim();
    	              found = true;
    	              break;
    	          }
    	          if ( !found) { // digit only
    	            pattern = Pattern.compile("-?(.)([0-9]+)");
    	            matcher = pattern.matcher( str);    
    	            while ( matcher.find()) {
    	                theStr = matcher.group(0).trim();
    	                if ( theStr.contains("."))
    	                    theStr = "0" + theStr;
    	                else theStr = theStr+".0";
    	                break;
    	            }            
    	          }
    	          retInt = 1;
    	          Math.pow(retInt,  retInt);
    	          theStrList[retInt] = theStr;
    	 
    	      } else {
    	          theStrList[ retInt] = str;
    	      }
    	      return retInt;
    }
    
    public String find(String theStr) {
    	int retInt =0;
    	long maxLong = Long.MAX_VALUE, minLong = Long.MIN_VALUE;
    	BigDecimal maxBG = new BigDecimal(maxLong), minBG = new BigDecimal( minLong); 
    	int maxInt = Integer.MAX_VALUE, minInt = Integer.MIN_VALUE;
    	BigDecimal maxBGInt = new BigDecimal(maxInt), minBGInt = new BigDecimal( minInt);
    	short maxShort = Short.MAX_VALUE, minShort = Short.MIN_VALUE;
    	BigDecimal maxBGShort = new BigDecimal(maxShort), minBGShort = new BigDecimal( minShort);
    	byte maxByte = Byte.MAX_VALUE, minByte = Byte.MIN_VALUE;
    	BigDecimal maxBGByte = new BigDecimal(maxByte), minBGByte = new BigDecimal( minByte);
    	
    	BigDecimal bgValue = new BigDecimal( theStr.trim());
    	StringBuffer strBuf = new StringBuffer();
    	strBuf.append(theStr);
    	boolean inType = true;
    	StringBuffer strBuf2 = new StringBuffer();
   		if ( (bgValue.compareTo( maxBGByte) <= 0) && ( bgValue.compareTo( minBGByte) >= 0)) {
   			strBuf2.append("* byte \n");
   		}
   		if ( (bgValue.compareTo( maxBGShort) <= 0) && ( bgValue.compareTo( minBGShort) >= 0)) {
   			strBuf2.append("* short \n");
   		}
   		if ( (bgValue.compareTo( maxBGInt) <= 0) && ( bgValue.compareTo( minBGInt) >= 0)) {
   			strBuf2.append("* int \n");
   		}
   		if ( (bgValue.compareTo( maxBG) <= 0) && ( bgValue.compareTo( minBG) >= 0)) {
   			strBuf2.append("* long \n");
   		} else {
   			inType = false;
   		}
   		
   		if ( inType) {
   			strBuf.append( " can be fitted in: \n");
   			strBuf.append( strBuf2.toString());    			
   		} else {
   			strBuf.append(" can't be fitted anywhere.");
   		}


   		
    	return strBuf.toString();
    	
    }
    	    
    public static void main1(String args) {
        //for (int ind=0; ind< 3; ind++) {
       //     theStrList.add(" ");
        //}
        Scanner scan = new Scanner( args);
        //Scanner scan = new Scanner(System.in);
        int ind =0;
        while ( scan.hasNext()) {
            String S = scan.nextLine();
            int index = identify( S, ind);
            ind++;
        }
        scan.close();
        for ( ind =0; ind < 3; ind++) {
            String lead= (ind==0) ? "String: " : ((ind==1)? "Double: " :"Int: ") ;
            lead +="%s";
            //BigDecimal.valueOf(theStrList[ind] );
            //System.out.println(String.format(lead, theStrList[ind]));
            //System.out.println("ind:"+ind+" lead:"+lead);
            //System.out.println("theStr: "+ theStrList[ind]);
            //System.out.println("theStr:"+ theStrList.get(ind));
            if ( ind == 1) System.out.println("-1-"+String.format(lead, (new BigDecimal(theStrList[ind])).doubleValue())); //Float.valueOf(theStrList[ind])));
            else   System.out.println(String.format(lead, theStrList[ind]));
            //System.out.println(String.format(lead, theStrList.get(ind)));//
        }    
        //    "String: " + s);
        //System.out.println("Double: " + d);
        //System.out.println("Int: " + i);
        //scan.close();
    }
}