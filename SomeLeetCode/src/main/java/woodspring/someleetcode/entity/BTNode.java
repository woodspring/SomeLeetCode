package woodspring.someleetcode.entity;

public class BTNode<V> {
	V value = null;
	BTNode left = null,  right = null;
	
	public BTNode(V value) {
		this.value = value;
	}
	
	public void setValue( V value) {
		this.value = value;
	}
	public V value() {
		return this.value;
	}
	
	public void setLeft( BTNode btNode) {
		this.left( btNode);
	}
	public void left( BTNode btNode) {
		this.left = btNode;
	}
	public BTNode left() {
		return left;
	}

	public void setRight( BTNode btNode) {
		this.right( btNode);
	}
	public void right( BTNode btNode) {
		this.right = btNode;
	}
	public BTNode right() {
		return right;
	}
	
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		if ( this.left != null) 
			strBuff.append(  this.left().toString());
		if ( this.value != null) 
			strBuff.append(" "+ this.value) ;
		if ( this.right != null) 
			strBuff.append( this.right().toString());		
		return strBuff.toString();
	}
	
	public int compare( V v1, V v2) {
		int result = 0;
		int diff = (int)v1 - (int)v2;
		if ( diff > 0) result = 1;
		if ( diff < 0) result = -1;
		
		return result;
		
	}
}
