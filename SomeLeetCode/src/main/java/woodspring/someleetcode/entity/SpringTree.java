package woodspring.someleetcode.entity;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SpringTree {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private TreeNode<Integer> root = null;
	
	public SpringTree() {
		//root = new TreeNode<>();;
		root = null;
	}

	
	
	public SpringTree build(List<Integer> theList) {
		theList.stream().forEach( item -> addNode( root,  new TreeNode( item)));
		return this;
	}
	
	
	public TreeNode<Integer> addNode(TreeNode<Integer> currentNode, TreeNode<Integer> node) {
		if (this.root == null) {
			this.root = node;
			return node;
		}
		if ( currentNode == null) {
			//currentNode = node;
			return node;
		}
		//logger.info("currentNode:"+  currentNode.getValue()+" node:"+ node.getValue());
		if (currentNode.getValue().compareTo( node.getValue()) > 0) {
			//logger.info("head.getValue().compareTo( node.getValue()) > 0; currentNode:"+  currentNode.getValue()+" node:"+ node.getValue());
			currentNode.setLeft(addNode(currentNode.left(), node));
		} else if (currentNode.getValue().compareTo( node.getValue()) < 0) {
			//logger.info("head.getValue().compareTo( node.getValue()) < 0; currentNode:"+ currentNode.getValue()+" node:"+ node.getValue());
			currentNode.setRight(addNode(currentNode.right(), node));
		} else {
			logger.info("DO nothig; head.getValue().compareTo( node.getValue()) < 0; currentNode:"+ currentNode.getValue()+" node:"+ node.getValue());
		}
		
		return currentNode;		
	}
	
	public String toString() {
		//return toPrefixString( root);
		return toString( root);
		//return toPostfixString( root);
	}
	
	public String toString(TreeNode<Integer> currentNode) {
		if (currentNode == null) return "";
		StringBuffer strBuf = new StringBuffer();
		
		strBuf.append(  ( (currentNode.left() == null) ? "" : toString(currentNode.left() ))+ " ");
		strBuf.append(" "+ currentNode.getValue()+" ");
		strBuf.append( currentNode.right() == null ? "" : toString( currentNode.right()));
		
		return strBuf.toString();
	}
	
	public String toPrefixString(TreeNode<Integer> currentNode) {
		if (currentNode == null) return "";
		StringBuffer strBuf = new StringBuffer();
		strBuf.append(" "+ currentNode.getValue()+" ");
		strBuf.append(  ( (currentNode.left() == null) ? "" : toString(currentNode.left() ))+ " ");		
		strBuf.append( currentNode.right() == null ? "" : toString( currentNode.right()));
		
		return strBuf.toString();
	}
	
	public String toPostfixString(TreeNode<Integer> currentNode) {
		if (currentNode == null) return "";
		StringBuffer strBuf = new StringBuffer();
		
		strBuf.append(  ( (currentNode.left() == null) ? "" : toString(currentNode.left() ))+ " ");		
		strBuf.append( currentNode.right() == null ? "" : toString( currentNode.right()));
		strBuf.append(" "+ currentNode.getValue()+" ");
		
		return strBuf.toString();
	}
	
	public TreeNode<Integer> getHead() {
		return root;
	}
}
