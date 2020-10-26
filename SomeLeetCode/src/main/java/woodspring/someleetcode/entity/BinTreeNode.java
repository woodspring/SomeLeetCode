package woodspring.someleetcode.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BinTreeNode<T> {
	private static final Logger logger = LoggerFactory.getLogger(BinTreeNode.class);
	
	private T value;
	private BinTreeNode<T> left = null, right = null;
	public BinTreeNode(T value) {
		this.value = value;
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
	public BinTreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(BinTreeNode<T> left) {
		this.left = left;
	}
	
	public BinTreeNode<T> left() {
		return left;
	}
	public void left(BinTreeNode<T> left) {
		this.left = left;
	}
	
	
	public BinTreeNode<T> getRight() {
		return right;
	}
	public void setRight(BinTreeNode<T> right) {
		this.right = right;
	}
	
	public BinTreeNode<T> right() {
		return right;
	}
	public void right(BinTreeNode<T> right) {
		this.right = right;
	}
	@Override
	public String toString() {
		StringBuffer strBuf = new StringBuffer();
		strBuf.append("{");
		if ( this.getLeft() != null) strBuf.append(" "+ this.getLeft().toString());
		strBuf.append("["+ this.getValue()+"]");
		if ( this.getRight() != null) strBuf.append(" "+ this.getRight().toString());
		strBuf.append("}");
		return strBuf.toString();
	}
	
	 
	public int compare( T v1, T v2) {
		int result = 0;
		int diff = (int)v1 - (int)v2;
		if ( diff > 0) result = 1;
		if ( diff < 0) result = -1;
		
		return result;
		
	}
	
	

}
