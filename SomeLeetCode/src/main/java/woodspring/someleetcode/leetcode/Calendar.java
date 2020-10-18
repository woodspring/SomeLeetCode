package woodspring.someleetcode.leetcode;

public class Calendar {

	
	private int times =0;
	private int size = 256;
	private int[] calendar = new int[this.size];;

	
	public Calendar(int times) {
		this.times = times;
		resetCalendar();
	}
	
	public boolean book(int start, int end) {
		boolean bRet = true;
		int realEnd =0;
		for ( int ind = start; ind < end; ind++) {
			bRet = setBooked( ind);
			if (!bRet) break;
			realEnd = ind;
		}
		if (!bRet) {
			// some of them full book; roll back
			for ( int ind = start; ind <= realEnd; ind++) {
				rollback( ind) ;
			}
		}
		
		return bRet;
	}
	private boolean setBooked(int ind) {
		boolean bRet = true;
		if ( calendar[ind] < (times-1)) {
			// not full book
			calendar[ind] = calendar[ind] +1;
		} else {
			// overbook
			bRet = false;			
		}
		
		return bRet;
	}
	
	private boolean rollback(int ind) {
		boolean bRet = true;
		if (calendar[ind] >  0)
			calendar[ind] = calendar[ind] -1;
		return bRet;
	}
	
	public boolean resetCalendar() {
		for (int ind =0; ind < size; ind++)
			calendar[ind]=0;
		return true;
	}
	
	public String toString() {
		StringBuffer strBuf = new StringBuffer();
		for (int ind=0; ind < calendar.length; ind ++) {
			strBuf.append(Integer.valueOf( calendar[ind])+", ");
		}
		return strBuf.toString();
	}
}
