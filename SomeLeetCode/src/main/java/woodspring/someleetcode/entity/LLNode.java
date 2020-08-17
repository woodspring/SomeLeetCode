package woodspring.someleetcode.entity;

public class LLNode<V> {
	private V value = null;
	private LLNode next = null;
	private LLNode previous = null;
	private String status = "NODE";
	public LLNode( V value) {
		this.value = value;
	}
	
	public void setValue( V value) {
		value = value;
	}
	public V value() {
		return value;
	}
	
	public void setNext( LLNode nextNode) {
		next = nextNode;
	}
	public LLNode next() {
		return next;
	}
	
	public void setPrevious( LLNode previousNode) {
		this.previous = previousNode;
	}
	public LLNode previous() {
		return this.previous;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String status() {
		return status;
	}
	
	public String toString() {
		return toString( this);
	}
	
	public String toString(LLNode<V> currNode) {
		StringBuffer strBuff = new StringBuffer();
		if (currNode == null) {
			strBuff.append("null||");
		} else {
			if ( currNode.value() != null) strBuff.append( currNode.value() +" "+" status:"+currNode.status()+"|");
			if ( currNode.next() != null) strBuff.append( currNode.toString(currNode.next()));
		}
		return strBuff.toString();
	}

}
