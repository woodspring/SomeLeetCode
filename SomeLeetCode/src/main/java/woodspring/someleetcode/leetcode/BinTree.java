package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.BinTreeNode;

public class BinTree {
	private static final Logger logger = LoggerFactory.getLogger( BinTree.class);
	private BinTreeNode<Integer> root;
	
	public BinTree(Integer value) {
		root = new BinTreeNode( value);
	}
	
	public BinTree put( Integer value) {
		this.put( root, value);
		
		return this;
	}
	
	private  BinTreeNode<Integer> put( BinTreeNode currNode, Integer value) {
		BinTreeNode<Integer> retNode = null;
		if (currNode == null) return currNode = new BinTreeNode(value);
		if ( ((Integer)currNode.getValue()).compareTo( value) > 0) {
			if ( currNode.getRight() == null) {
				currNode.setRight( this.put( currNode.getRight(), value));
			} else 
				retNode = this.put(currNode.getRight(), value);
		} else 
		if ( ((Integer)currNode.getValue()).compareTo( value) < 0) {
			if ( currNode.getLeft() == null) {
				currNode.setLeft( this.put( currNode.getLeft(), value));
			} else {
				retNode = this.put( currNode.getLeft(), value);
			}
		} else {
			logger.warn(" WARNING: value {} duplicated.", value);
			
		}
		
		//logger.info("DONE for node:{} value {}", currNode.getValue(), value);
		return retNode;
	}
	
	
	public String toString() {
		return root.toString();
	}
	
	public BinTreeNode<Integer> getRoot() {
		return root;
	}

}
