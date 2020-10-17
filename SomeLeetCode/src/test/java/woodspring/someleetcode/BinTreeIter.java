package woodspring.someleetcode;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.BinTreeNode;

public class BinTreeIter {
	private final static Logger logger = LoggerFactory.getLogger(BinTreeIter.class);
	
	private Stack<BinTreeNode<Integer>> stack = new Stack<BinTreeNode<Integer>>();
	
	public BinTreeIter(BinTreeNode root) {
		pushAllLeft( root);
	}
	
	public BinTreeNode<Integer> next() {
		BinTreeNode<Integer> currNode = ( stack.isEmpty()) ? null : stack.pop();
		if ( currNode != null) {
			this.pushAllLeft( currNode.getRight());
		}
		logger.info(" next value: {} from stack", (currNode==null)? "Null" : currNode.getValue());
		return currNode;
	}
	
	public boolean hasNext() {
		boolean bRet = false;
		if (stack.isEmpty()) {
			
		} else {
			bRet = true;
		}
		
		return bRet;
	}
	
	
	private  void pushAllLeft( BinTreeNode<Integer> currNode) {
		if ( currNode == null) return ;
		stack.push( currNode);
		if ( currNode.getLeft() != null) {
			//stack.push( currNode);
			logger.info(" push value {} into STACK", currNode.getValue());
			this.pushAllLeft(currNode.getLeft());
		}
	}
	

}
