package woodspring.someleetcode.leetcode;

class Foo {

	
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
    
    
    public class FooPrint implements Runnable {
    	private Foo aFoo = new Foo();
    	private int taskId;
    	private int[] runReqList;
    	private int runInd =0;
    	
    	public void setRunReqList(int[] theList) {
    		runReqList = theList;
    		runInd =0;
    	}
    	
		@Override
		public void run() {
			boolean isBreak = false;
			taskId = Integer.valueOf( Thread.currentThread().getName()).intValue();
			
			while (!isBreak) {
				synchronized( aFoo) {
					while ( taskId != runReqList[runInd]) {
						try {
							aFoo.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					switch( taskId) {
					case 1:
					}
					
				}
				
			}
			
			
		}
    	
    }
    
    public void solution(int[] runSeq) {
    	FooPrint theFooPrint = null;
    	
    }
}