package woodspring.someleetcode.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.BTNode;
import woodspring.someleetcode.entity.LLNode;

public class LinkedList {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	private LLNode< Integer> list = null;
	private int length = 0;
	
	public LinkedList() {
		
	}
	public LinkedList( Integer value) {
		 LLNode< Integer> node = new LLNode<Integer>( value);
		 if ( list == null) list = node;
		 length++;
	}
	
	public void putAtHead(Integer value) {
		LLNode<Integer> theNode = new LLNode<>(value);
		theNode.setNext( list);
		list = theNode;
		length++;
	}
	public void putAtTail(Integer value) {
		LLNode<Integer> theNode = new LLNode<>(value);
		LLNode<Integer> nodeItr = list;
		if ( list == null) {
			list = theNode;
		} else {
			while ( nodeItr != null) {
				if ( nodeItr.next() == null) break;
				nodeItr = nodeItr.next();
				//if (nodeItr == null) break;
				
			}
			nodeItr.setNext(theNode);
		}
		length++;
	}
	
	public void putAtPosition(int index, Integer value) {
		LLNode<Integer> theNode = new LLNode<>(value);
		
		if ( index > length) {
			logger.info(" index:{} larger than length:{}, put it to tail", index, length);
			putAtTail( value);
		} else {
			LLNode<Integer> nodeItr = list;
			int nowIndex = 1;
			while ( nodeItr != null) {
				nodeItr = nodeItr.next();
				if (nodeItr == null) break;
				nowIndex++;
				if ( nowIndex == index) {
					theNode.setNext(nodeItr.next());
					nodeItr.setNext(theNode);
					break;
				}
								
			}
			nodeItr.setNext(theNode);
			length++;
			
		}
		
	}
	
	
	
	public String toString() {
		String str = ( list == null) ? "null||" : list.toString();
		return str;
	}
	
	public String toString( LLNode<Integer> currNode)  {
		StringBuffer strBuf = new StringBuffer();
		if (currNode == null) {
			strBuf.append("null||");
		} else {
			strBuf.append( "{"+ currNode.value() +"}|{"+ this.toString( currNode.next() ));
		}
		return strBuf.toString();
	}


}
