package woodspring.someleetcode.entity;



public class LLNode<T> {
	private T value = null;;
	private LLNode<T> prev = null, next = null;
	private String status;
	
	public LLNode( T value) {
		this.value = value;
		//left = right = null;
	}

	public T getValue() {
		return value;
	}
	public T value() {
		return this.value;
	}
	public void setValue(T value) {
		this.value = value;
	}

	public LLNode<T> getPrev() {
		return prev;
	}

	public void setPrev(LLNode<T> prev) {
		this.prev = prev;
	}

	public LLNode<T> getNext() {
		return next;
	}
	public LLNode<T> next() {
		return this.next;
	}

	public void setNext(LLNode<T> next) {
		this.next = next;
	}

	public String getStatus() {
		return status;
	}
	public String status() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
