package woodspring.someleetcode.codity;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChocolatesByNumbers {

	private static final Logger logger = LoggerFactory.getLogger( ChocolatesByNumbers.class);
	
	
	public int eatChocolatesByNumbers(int N, int M) {
		int retInt = 1;
		if ( 1 > N || 1 > M) return retInt;
		StringBuffer aten = new StringBuffer();
		logger.info("N:{}  M:{}", N, M);
		
		//char[] aten = new char[N];
		int ind =0;
		int size = N;
		for (; ind < N; ind++) {//System.out.print("-"+ind+"-");
			aten.append(' ');
		}
		//for ( ; ind < aten.length; ind++) 	aten[ind] = ' ';
		
		//boolean done = false;
		ind =0;
		while ( true) {
			//logger.info( "eat:{} ind:{}, size:{}, M:{}, ind+M:{} next:", retInt, ind, size, M, (ind+M));
			
			aten.setCharAt( ind, 'X');
			//aten[ind] = 'X';

			ind = (ind + M) % size;
			if ( 'X' == aten.charAt( ind)) break;
			retInt++; 
			
		}
		
		logger.info(" Eat: {}", retInt);
		return retInt;
	}
			
	public int eatChocolatesByNumbersByte(int N, int M) {
		int retInt = 1;
		int ind =0;
		if ( 1 > N || 1 > M) return retInt;
		
		logger.info("N:{}  M:{}", N, M);
		byte zeroByte = 0x00000000;
		byte[] baseByte = { 1, 2, 4, 8, 16, 32, 64, (byte) 128 };
		int byteNum = (int)(N / 8);
		int bytePos = N % 8;
		Byte[] aten = new Byte[ byteNum + 1 ] ;
		for (; ind < aten.length; ind++) {
			aten[ ind] = zeroByte;
		}
		
		//char[] aten = new char[N];

		int size = N;
		ind =0;
		while ( true) {

			int byteInd = (int)(ind / 8);
			int bytePosInd = ind % 8;
			byte result = (byte) (aten[ byteInd] | baseByte[ bytePosInd]); // set posInd ON
						
			//logger.info( "eat:{} ind:{}, byteInd:{}, bytePosInd:{}, aten[ byteInd]:{} result:{} , M:{} ", retInt, ind, byteInd, bytePosInd, aten[ byteInd], result,  M);
			
			aten[byteInd] = result;
			long tmpInd = (long)ind + (long)M;
			ind = (int)(tmpInd % size);
			
			byteInd = (int)(ind /8);
			bytePosInd = ind % 8;
			//logger.info( "--ind:{}  byteInd:{} bytePosInd:{}  byteNum:{} bm-bi:{}", ind, byteInd, bytePosInd, byteNum + 2 , byteNum + 2 - byteInd);
			
			try {
			result = (byte)(aten[ byteInd] & baseByte[bytePosInd]);
			} catch (Exception ex) {
				logger.info( "--  in catch ex:{}  ind:{}  byteInd:{} bytePosInd:{}  byteNum:{} bm-bi:{}, aten:{}, aten size:{}", 
						ex.getMessage(), ind, byteInd, bytePosInd, byteNum + 2 , byteNum + 2 - byteInd, aten[ byteInd], aten.length);
			}
			//logger.info( "after ----> eat:{} ind:{}, byteInd:{}, bytePosInd:{}, aten[ byteInd]:{} result:{} , M:{} ", retInt, ind, byteInd, bytePosInd, aten[ byteInd], result,  M);
			if ( 0 != result) {
				logger.info( "  eating overlaped ind:{}, byte:Ind:{}, pos:{}, result:{}, tmpInd:{}", ind, byteInd, bytePosInd, result, tmpInd);
				break;
			}
			
			//if ( 'X' == aten1.charAt( ind)) break;
			retInt++; 
			
		}
		
		logger.info(" Eat: {}", retInt);
		return retInt;
	}
			
			
}
