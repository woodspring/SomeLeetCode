package woodspring.someleetcode.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.TNode;
import woodspring.someleetcode.service.LeetCodeService;

public class TNodeService {// implements LeetCodeService {
	private final static Logger logger = LoggerFactory.getLogger( TNodeService.class);
	
	private TNode<Integer> head = null;

	private List<Integer> intList  =new ArrayList<>();
	
	public TNodeService() {
		
	}
	public TNodeService(int value) {
		head = new TNode(value);
	}
	

	public void doProcess() {
		for (Integer item : intList) logger.info( "intList value:{}", item);
		intList.stream().forEach( item -> addOneNode( item));		
	}
	
	private void addNode( TNode<Integer> currNode, Integer value) {
		logger.info("value:{}, left:{}, currValue:{}, right():{}", value, (currNode.left() != null)? currNode.getLeft().getValue():"NULL", currNode.getValue(), (currNode.right() != null) ? currNode.getRight().getValue() :"NULL");
		if ( currNode.getValue().compareTo( value) > 0 ) {
			if ( currNode.left() == null) {
				currNode.setLeft(new TNode(value));
			} else {
				addNode( currNode.left(), value);
			}
		} if (currNode.getValue().compareTo( value) < 0) {
			if ( currNode.right() == null) {
				currNode.setRight(new TNode(value));				
			} else {
				addNode( currNode.right(), value);
			}
		}
	}
	
	public void addOneNode(Integer value) {
		if (head ==null) head = new TNode( value);
		else {
			addNode( head, value);
		}
	}
	public TNodeService setInt(int value) {
		if (head == null) {
			head = new TNode( value);			
		} else {
			intList.add( value);
		}
		return this;
	}
	public String toString() {
		return head.toString();
	}
	public void reset() {
		head = null;
	}
	public TNode<Integer> getHead() {
		return this.head;
	}
	
//
//	public class TNodeItr {
//		
//		private List<TNode<Integer>> nodeList = new ArrayList<>();
//		private TNode<Integer> head;
//		
//		public TNodeItr( TNode<Integer> head) {
//			readNode( head);
//		}
//		
//		public Integer next() {
//			TNode<Integer> currNode = nodeList.get(0);
//			nodeList.remove(0);
//			readNode(currNode.right());
//			return currNode.getValue();
//		}
//		public boolean hasNext() {
//			boolean retCode = ( nodeList.isEmpty()) ? false : true;
//			return retCode;
//		}
//		
//		private void readNode( TNode<Integer> currNode) {
//			if ( currNode != null && currNode.getValue() != null) {
//					nodeList.add(0, currNode);
//					if ( currNode.left() != null) 
//						readNode( currNode.left());	
//			}
//
//		}
//	}
}
