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
		this.value = value;
	}
	public V value() {
		return this.value;
	}
	
	public void setNext( LLNode nextNode) {
		this.next = nextNode;
	}
	public LLNode next() {
		return this.next;
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
		return this.status;
	}
	
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		if ( value != null) strBuff.append( this.value +" "+" status:"+this.status+"|");
		if ( next != null) strBuff.append( this.next.toString());
		
		return strBuff.toString();
	}

}
