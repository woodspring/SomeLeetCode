package woodspring.someleetcode.service.impl;

import java.util.ArrayList;
import java.util.List;

import woodspring.someleetcode.entity.TNode;

public class TNodeItr {
	
	private List<TNode<Integer>> nodeList = new ArrayList<>();
	private TNode<Integer> head;
	
	public TNodeItr( TNode<Integer> head) {
		readNode( head);
	}
	
	public Integer next() {
		TNode<Integer> currNode = nodeList.get(0);
		nodeList.remove(0);
		readNode(currNode.right());
		return currNode.getValue();
	}
	public boolean hasNext() {
		boolean retCode = ( nodeList.isEmpty()) ? false : true;
		return retCode;
	}
	
	private void readNode( TNode<Integer> currNode) {
		if ( currNode != null && currNode.getValue() != null) {
				nodeList.add(0, currNode);
				if ( currNode.left() != null) 
					readNode( currNode.left());	
		}

	}
	
	

}
