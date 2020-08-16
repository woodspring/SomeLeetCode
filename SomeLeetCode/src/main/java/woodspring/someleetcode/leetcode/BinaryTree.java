package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.BTNode;

public class BinaryTree {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	public BTNode<Integer> head = null;
	public BinaryTree() {
		head = new BTNode(null);
	}
	
	public BinaryTree put(int value) {
		boolean inserted = false;
		if ( head.value() == null) {
			head.setValue(value);
			return this;
		}
		Integer theValue = Integer.valueOf( value);
		BTNode<Integer> theNode = new BTNode(theValue); 
		this.insert(head, theNode);
		return this;
	}
	
	public boolean find(int value) {
		boolean found = false;
		if ( head.value() == null) return found; // return new BTNode(null);
		
		Integer theValue = Integer.valueOf( value);
		BTNode<Integer> theNode = new BTNode(theValue);
		found = findNode( head, theNode);
		
		return found;
	}
	
	private boolean insert(BTNode currNode, BTNode theNode) {
		boolean done = false;
		logger.info(" currNode:{}, theNode:{}", (( currNode.value() == null)? "NULL" : currNode.value()), theNode.value());
		if (currNode.value() == null) {
			currNode.setValue( theNode.value());
			done = true;
		} else {
			if ( currNode.compare( currNode.value(), theNode.value()) > 0) {
				if ( currNode.left() == null) {
					currNode.setLeft(theNode);
					done = true;
				} else { 
					done = insert( currNode.left(), theNode);
				}
			} else if ( currNode.compare( currNode.value(), theNode.value()) < 0) {
				if ( currNode.right() == null) {
					currNode.setRight(theNode);
					done = true;
				} else { 
					done = insert( currNode.right(), theNode);
				}
			} else {
				logger.warn( " value duplicated : {}" , theNode.value());
				done = true;
			}
		}
		return done;
		
	}
	private boolean findNode(BTNode currNode, BTNode theNode) {
		boolean found = false;
		if ( currNode != null) {
			if (currNode.compare(currNode.value(), theNode.value()) == 0) {
				found = true;
			} else if (currNode.compare(currNode.value(), theNode.value()) > 0) {
				found = findNode( currNode.left(), theNode);
			} else {
				found = findNode( currNode.right(), theNode);
			}
		}
		
		return found;
	}
	public String toString() {
		return head.toString();
	}

}
