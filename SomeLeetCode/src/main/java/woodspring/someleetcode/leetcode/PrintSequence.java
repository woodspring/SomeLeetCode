package woodspring.someleetcode.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.tomcat.jni.Lock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintSequence {
	private final static Logger logger = LoggerFactory.getLogger(PrintSequence.class );
	
	
	public class PrintMeth {
		public String printMethod1() { 
			System.out.println("                                                                                                                                    output    printMethod1 ");
			return ("printMethod1");
		}
		
		public String printMethod2() { 
			System.out.println("                                                                                                                                    output    printMethod2 ");
			return ("printMethod2");
		}

		public String printMethod3() { 
			System.out.println("                                                                                                                                    output    printMethod3 ");
			return ("printMethod3");
		}

		
	}
	
	public class PrintClass implements Runnable {
		ThreadLocal<Integer> taskId = new ThreadLocal<>(); 
		//private int taskId;
		//private List<Integer> runningSeq = new ArrayList<Integer>();
		private int[] runningSeq;
		AtomicInteger runInd;
		PrintMeth outPrint = new PrintMeth();
		private Lock lock = new Lock();
		//private ReentrantLock aLock = new ReentrantLock();
		//private PrintMeth doPrint = new PrintMeth();
		
		//private Lock lock = new Lock();
		//private long lockInd = 1L;
		
		public PrintClass( int id) {
			taskId.set( Integer.valueOf(id)); 
		}
		
		public void setRunningSeq(int[]  runSeq) {
//			public void setRunningSeq(List<Integer> runSeq) {
			this.runningSeq = runSeq;
			runInd = new AtomicInteger(0);
		}
		
		@Override		
		public void run() {
			boolean isBreak = false;
			
			Thread th = Thread.currentThread();
			taskId.set(Integer.valueOf( th.getName() ));
			logger.info("test taskId:{} runningSeq:{}", taskId.get(), runningSeq );
			while (!isBreak) {
				synchronized( outPrint) { //outPrint) {
					logger.info("taskId:{} -0-, runInd:{}, curr:{} threadName:{} isBreak:{}", taskId.get(), runInd.get(), runningSeq[runInd.get()], Thread.currentThread().getName(), isBreak	);
				while ( !taskId.get().equals( runningSeq[runInd.get()]) ) {
					try {
						logger.info("test taskId:{} -1.0-, runInd:{}, curr:{} threadName:{}", taskId.get(), runInd.get(), runningSeq[runInd.get()], Thread.currentThread().getName()	);
						outPrint.wait();
						//outPrint.wait();
						logger.info("test taskId:{} -1-, runInd:{}, curr:{}                                                             threadName:{}", taskId.get(), runInd.get(), runningSeq[runInd.get()], Thread.currentThread().getName()	);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						logger.info("test taskId:{} -1.1-, runInd:{}, curr:{} threadName:{}", taskId.get(), runInd.get(), runningSeq[runInd.get()], Thread.currentThread().getName()	);
					}
				}
				logger.info("taskId:{},-2.1- runId:{}, runSeq:{}=={}========", taskId.get(), runInd, runningSeq, runningSeq[runInd.get()]);
					switch( taskId.get()) { // % 3) {
					case 1:
						outPrint.printMethod1();
						isBreak = true;
						break;
					case 2:
						outPrint.printMethod2();
						isBreak = true;
						break;
					case 3:
						outPrint.printMethod3();
						isBreak = true;
						break;						
					}
					runInd.addAndGet(1);
					//logger.info("test taskId:{} -9.0-, runInd:{}, curr:{} threadName:{}", taskId.get(), runInd.get(), runningSeq[runInd.get()], Thread.currentThread().getName()	);
					outPrint.notifyAll();
					//outPrint.notifyAll();
					//logger.info("test taskId:{} -9.1-, runInd:{}, curr:{} threadName:{}", taskId.get(), runInd.get(), runningSeq[runInd.get()], Thread.currentThread().getName()	);
				}
			}	
			
		}

		
	}
	
	PrintClass printClass = null;
	Thread aThread = null;
	public int[] printSeq( int[] runSeq) {
//		public List<Integer> printSeq(List<Integer> runSeq) {
		
		List<Thread> threadList = new ArrayList<>();
		
		int threadNum = runSeq.length +1;
		
		printClass = new PrintClass(1);
		printClass.setRunningSeq( runSeq);
		for ( int ind =1; ind < threadNum; ind++) {

			aThread  = new Thread(printClass, Integer.valueOf(ind).toString());
			threadList.add(aThread);
		}
		
		
//		PrintClass printClass1 = new PrintClass(1);
//		printClass1.setRunningSeq( runSeq);
//		Thread td1 = new Thread(printClass1, "1");
//		threadList.add(td1);
//		
//		PrintClass printClass2 = new PrintClass(2);
//		printClass2.setRunningSeq( runSeq);
//		Thread td2 = new Thread(printClass1, "2");
//		threadList.add(td2);
//		
//		PrintClass printClass3 = new PrintClass(3);
//		printClass3.setRunningSeq( runSeq);
//		Thread td3 = new Thread(printClass1, "3");
//		threadList.add(td3);
		
		
//		PrintClass printClass1 = new PrintClass(1);
//		printClass1.setRunningSeq( runSeq);
//		Thread td1 = new Thread(printClass1, "1");
//		threadList.add(td1);
//		
//		PrintClass printClass2 = new PrintClass(2);
//		printClass2.setRunningSeq( runSeq);
//		Thread td2 = new Thread(printClass1, "2");
//		threadList.add(td2);
//		
//		PrintClass printClass3 = new PrintClass(3);
//		printClass3.setRunningSeq( runSeq);
//		Thread td3 = new Thread(printClass1, "3");
//		threadList.add(td3);

		
		for ( Thread thread : threadList) {
			thread.start();
//			logger.info("test");
		}
		

		return runSeq;
	}

}
