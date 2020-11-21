package woodspring.someleetcode;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.HackerRank.Solution;

public class TestSolution {
	private final static Logger logger = LoggerFactory.getLogger( TestSolution.class );
	
//	@Test
//	public void testSolutiopn() {
//		Solution sol = new Solution();
//		String test = new String("42 \n 235345345345.234534 \n New world come in.!");
//		sol.main1(test);
//	}
//	
//	@Test
//	public void testSolutionType() {
//		Solution sol = new Solution();
//		StringBuffer strBuf = new StringBuffer();
//		strBuf.append("5\n"
//				+ "-150\n"
//				+ "150000\n"
//				+ "1500000000\n"
//				+ "213333333333333333333333333333333333\n"
//				+ "-100000000000000\n");
//		Scanner scanner = new Scanner( strBuf.toString());
//		while ( scanner.hasNext()) {
//			String theStr = scanner.nextLine();
//			logger.info( "Result:[{}]", sol.find( theStr));
//		}
//	}
//		
		@Test
		public void testSolutionType01() {
			Solution sol = new Solution();
			StringBuffer strBuf = new StringBuffer();
			strBuf.append(
					"		9223372036854775808\n"
					+ "		9223372036854775807\n"
					+ "		-9223372036854775808\n"
					+ "		-9223372036854775807\n"
					+ "		4294967296\n"
					+ "		4294967295\n"
					+ "		-4294967296\n"
					+ "		-4294967295\n"
					+ "		65536\n"
					+ "		65535\n"
					+ "		-65536\n"
					+ "		-65535\n"
					+ "		256\n"
					+ "		255\n"
					+ "		-256\n"
					+ "		-255\n"
					+ "		12222222222222222222222222222222222222222221");
			Scanner scanner = new Scanner( strBuf.toString());
			while ( scanner.hasNext()) {
				String theStr = scanner.nextLine();
				logger.info( "testSolutionType01           Result:[{}]", sol.find( theStr));
			}
			
	   		int y =2020, month = 11, day = 20;
	   		SimpleDateFormat sdf  =new SimpleDateFormat("yyyy-MM-dd");
	   		String dateStr = String.format("%4d-%02d-%02d",  y, month, day);
	   		try {
				Date theDate = sdf.parse( dateStr);
				String whichDate = String.format("%tA", theDate);
				whichDate.toUpperCase();
				logger.info("whichDste:[{}]", whichDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		
	   		double money = 1123456789.234;
	   		Locale locale = new Locale("fr", "FR");
	   		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
	   		//symbols.setDecimalSeparator(';');
	   		symbols.setGroupingSeparator(' ');
	   		DecimalFormat df = new DecimalFormat("###,###,###,###.##", symbols);
	   		String moneyStr = df.format(money);
	   		String currStr = String.format("France %s  €", moneyStr);
	   		logger.info("currStr:[{}]", currStr);
	   		

	}

}
