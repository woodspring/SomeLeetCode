package woodspring.someleetcode.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxHeap {
	private static final Logger logger = LoggerFactory.getLogger(MaxHeap.class);
	
	private int[] theHeap = null;
	private int capicity =0;
	private int level =0;
	private int size =0;
	private int currentPos;
	private static final int MAX_INT=9999999;
	
	public MaxHeap( int level) {
		this.level = level;
		capicity =1 ;
		for ( int ind=1; ind < (level +1); ind++) {
			capicity *= 2;
		}
		theHeap = new int[ capicity];
		capicity -= 1; 
		theHeap[0] = MAX_INT;
		this.size = 0;
		currentPos = 0;
	}
	
	private int parent(int currInd) {
		return (currInd / 2);
	}
	
	private int leftChild(int currInd) {
		return ( currInd*2);
	}
	private int rihgtChild( int currInd) {
		return ( currInd*2 +1);
	}
	private boolean isLeaf( int currInd) {
		return ( (currInd > (int)(Math.pow( 2.0,  level -1)) && (currInd < this.capicity)) ? true : false);
	}
	private boolean swap( int ind1, int ind2) {
		if ( ind1 > capicity || ind2 > capicity) return false;
		int temp = theHeap[ind1];
		theHeap[ind1] = theHeap[ ind2];
		theHeap[ind2] = temp;
		return true;	
	}
	
	private boolean maxHeapify(int currInd) {
		if  (currInd > capicity) return false;
		if ( isLeaf( currInd) ) return true;
		
		int leftInd = leftChild( currInd), rightInd = rihgtChild( currInd);
		if ( ( theHeap[ currInd] < theHeap[leftInd]) ||
		     ( theHeap[ currInd] < theHeap[rightInd]) ) {
			
			//if ( theHeap[currInd] < theHeap[ rightInd]) {
			//	if ( !swap( currInd , rightInd) ) return false; // swap may be is currInd with leftInd
			//	logger.info( "value swap currInd:{}-{}, rightInd:{}-{}", currInd, theHeap[rightInd], rightInd, theHeap[currInd]);
			//	maxHeapify( rightInd);
			
			
			
			
			if ( theHeap[leftInd] > theHeap[ rightInd]) {
				if ( !swap( leftInd , rightInd) ) return false; // swap may be is currInd with leftInd
				logger.info( "value swap leftInd:{}-{}, rightInd:{}-{}", leftInd, theHeap[rightInd], rightInd, theHeap[leftInd]);
				
				maxHeapify( currInd);
				//maxHeapify( rightInd);
				
				
			} else {
				if ( !swap( currInd, rightInd)) return false;
				logger.info("value swap between current:{}-{} with rightChild:{}-{}", currInd, theHeap[rightInd], rightInd,theHeap[currInd]);
				maxHeapify( rightInd);
			}
		}
		return true;
	}
	
	public boolean insert(int value) {
		boolean bRet = true;
		theHeap[ ++size ] = value;
		logger.info("insert:{},  size:{}", value, size);
		int currInd = size;
		while ( currInd > 0) {
			int parentInd = parent( currInd);
			if ( theHeap[parentInd] < theHeap[ currInd]) {
				if ( !swap( parentInd, currInd)) return false;
				logger.info("insert:{}, value swap between current:{}-{} with parent:{}-{}", value, currInd, theHeap[parentInd], parentInd, theHeap[currInd]);
			}
			currInd = parentInd;
		}
		return bRet;	
	}
	
	public int getMax() {
		int retValue = theHeap[1];
		theHeap[1] = theHeap[ size--];
		maxHeapify( 1);		
		return retValue;
	}
	
	public String toString() {
		StringBuffer strBuf = new StringBuffer();
		logger.info("toString:{}, size/2:{}", size, size/2);
		for ( int ind=1; ind <= (size /2); ind++) {
			strBuf.append(" ind:"+ind+" value:"+ theHeap[ ind]+ "| -> leftChild:"+ ind*2 + " value:" + theHeap[ ind*2]+" => rightChild:"+ (ind*2+1)+" value:"+ theHeap[ind*2+1]+" \n");
			
		}
		return strBuf.toString();
	}

}
