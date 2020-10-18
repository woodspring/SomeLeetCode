package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.LLNode;

public class CircleLinkedList {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private LLNode< Integer> list = null;
	private int length = 0;
	public CircleLinkedList() {
		
	}
	public CircleLinkedList(Integer headValue) {
		LLNode<Integer> theNode = new LLNode<>(headValue);
		theNode.setStatus("HEAD");
		theNode.setNext(list);
		list = theNode;
		list.setNext(list);
		length++;
	}
	
	public void putAtHead(Integer nodeValue) {
		LLNode<Integer> theNode = new LLNode<>(nodeValue);
		theNode.setStatus("HEAD");
		LLNode<Integer> nodeItr = list;
		while ( true) {
			if ( nodeItr.next().status().equals( "HEAD")) {
				nodeItr.setNext( theNode);
				break;
			} else {
				nodeItr = nodeItr.next();
			}
		}
		list.setStatus("NODE");
		theNode.setNext(list);
		list = theNode;
		length++;
	}
	
	public void putAtTail(Integer nodeValue) {
		LLNode<Integer> theNode = new LLNode<>(nodeValue);
		LLNode<Integer> nodeItr = list;
		while (true) {
			if ( nodeItr.next().status().equals("HEAD")) {
				theNode.setNext(nodeItr.next());
				nodeItr.setNext(theNode);
				length++;
				break;
			} else {
				nodeItr = nodeItr.next();
			}
		}		
	}
	
	public void putAtPosition(int index, Integer nodeValue) {
		if ( index > length) {
			logger.info("position :{} is larger than current length:{}, put it at tail", index, length);
			putAtTail( nodeValue);
		} else {
			if (index ==0) {
				putAtHead( nodeValue);
			} else {
				LLNode<Integer> theNode = new LLNode<>(nodeValue);
				LLNode<Integer> nodeItr = list;
				int pIndex = 1;
				while (true) {
					
					if ( pIndex == (index-1)) {
						theNode.setNext(nodeItr.next());
						nodeItr.setNext( theNode);
						length++;
						break;
					}
					nodeItr = nodeItr.next();
					pIndex++;
				}
			}
		}
	}
	
	
	public String toString() {
		StringBuffer strBuf = new StringBuffer();
		
		LLNode<Integer> nodeItr = list;
		while (true) {
			strBuf.append(" value:"+nodeItr.value()+" status:"+ nodeItr.status()+"|");
			if ( nodeItr.next().status().equals("HEAD")) break;
			nodeItr = nodeItr.next();
		}
		return strBuf.toString();
		
	}

}
