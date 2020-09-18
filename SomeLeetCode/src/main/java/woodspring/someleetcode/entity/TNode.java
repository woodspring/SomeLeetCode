package woodspring.someleetcode.entity;


public class TNode<T> {
	
	private T value = null;;
	private TNode<T> left = null, right = null;
	
	public TNode( T value) {
		this.value = value;
		//left = right = null;
	}
	
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public TNode<T> getLeft() {
		return left();
	}
	public TNode<T> left() {
		return this.left;
		
	}
	public void setLeft(TNode<T> left) {
		this.left = left;
	}
	public TNode<T> getRight() {
		return right();
	}
	public TNode<T> right() {
		return this.right;
	}
	public void setRight(TNode<T> right) {
		this.right = right;
	}
	
	public String toString() {
		StringBuffer strBuf = new StringBuffer();
		if ( this.value !=null) {
		strBuf.append((this.left() !=null) ? this.left().toString() : "" );
		strBuf.append(" "+ this.value+" ");
		strBuf.append(((this.right() != null) ? this.getRight().toString() : "")+ " ");
		}
		
		return strBuf.toString();
	}

}
