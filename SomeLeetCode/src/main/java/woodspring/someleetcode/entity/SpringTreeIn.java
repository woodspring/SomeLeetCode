package woodspring.someleetcode.entity;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SpringTreeIn {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private TreeNodeIn<Integer, Integer> root = null;
	
	public SpringTreeIn() {
		//root = new TreeNode<>();;
		root = null;
	}

	
	
	public SpringTreeIn build(List<Integer > theList) {
		int size = theList.size();
		for ( int ind=0; ind < size; ind +=2) {
			addNode( root, new TreeNodeIn( theList.get(ind), theList.get(ind+1)) );
		}
		return this;
	}
	
	
	public TreeNodeIn<Integer, Integer> addNode(TreeNodeIn<Integer, Integer> currentNode, TreeNodeIn<Integer, Integer> node) {
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
	
	public String toString(TreeNodeIn<Integer, Integer> currentNode) {
		if (currentNode == null) return "";
		StringBuffer strBuf = new StringBuffer();
		
		strBuf.append(  ( (currentNode.left() == null) ? "" : toString(currentNode.left() ))+ " ");
		strBuf.append(" "+ currentNode.getValue()+"-C-"+currentNode.content()+" ");
		strBuf.append( currentNode.right() == null ? "" : toString( currentNode.right()));
		
		return strBuf.toString();
	}

}
