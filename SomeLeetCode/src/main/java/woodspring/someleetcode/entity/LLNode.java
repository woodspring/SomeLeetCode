package woodspring.someleetcode.entity;



public class LLNode<T> {
	private T value;
	private LLNode next = null;
	
	public LLNode(T theV) {
		this.value = theV;
	}
	
//	public LLNode(LLNode theNode) {
//		if (theNode == null) return ;
//		
//		if ( theNode.getValue() == null) return;
//		
//		//if ( theNode.get)
//	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public LLNode getNext() {
		return next();
	}
	public LLNode next() {
		return this.next;
	}
	public void setNext(LLNode next) {
		this.next = next;
	}
	
	public String toString() {
		StringBuffer  strBuf = new StringBuffer();
		strBuf.append("->"+ value);
		if ( next == null) {}
		else strBuf.append( this.next.toString());
		return strBuf.toString();
	}

	
	

}
