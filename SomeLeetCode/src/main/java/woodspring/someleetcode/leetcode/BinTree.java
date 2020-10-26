package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.BTNode;
import woodspring.someleetcode.entity.BinTreeNode;

public class BinTree {
	private final static Logger logger = LoggerFactory.getLogger(BinTree.class);
	
	private BinTreeNode<Integer> root;
	
	
	public BinTree( int root) {
		this.root  = new BinTreeNode<Integer>( root);
	}
	
	
	public BinTree put( Integer value) {
		BinTreeNode<Integer> aNode = new BinTreeNode<>( value);
		this.insert( root,  aNode );
		return this;
	}
	
	public void insert(BinTreeNode<Integer> currNode, BinTreeNode<Integer> newNode) {
		if ( currNode == null) return ;
		if ( currNode.compare( currNode.value(),  newNode.value()) > 0) {
			if ( currNode.left() == null) {
				currNode.left( newNode);
			} else {
				insert( currNode.left(), newNode);
			}
		} else if ( currNode.compare( currNode.value(),  newNode.value()) < 0) {
			if ( currNode.right() == null) {
				currNode.right( newNode);
			} else {
				insert( currNode.right(), newNode);
			}
		} else {
			logger.info(" insert node:{} DUPLICATED",  newNode.value());
		}
		
	}
	
	public BinTreeNode<Integer> getRoot( ) {
		return this.root;
	}

	public String toString() {
		return root.toString();
	}
}
