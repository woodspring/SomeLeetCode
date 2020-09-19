package woodspring.someleetcode.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import woodspring.someleetcode.Exception.SpringException;
import woodspring.someleetcode.entity.LLNode;
import woodspring.someleetcode.service.LinkedListService;

@Service("LinkedListService")
public class LinkedListServiceImpl<Integer> implements LinkedListService<Integer> {
	private final static Logger logger = LoggerFactory.getLogger( LinkedListServiceImpl.class);
	
	private LLNode<Integer> lList = new LLNode(null);
	
	
	@Override
	public void add(Integer node) {
		LLNode<Integer> oneNode = new LLNode<>(node);
		if ( lList.getValue() == null) lList = oneNode;
		else oneNode.setNext( lList);;
		lList = oneNode;
		logger.info(" LinkedList -add{} : {} ", node,  lList.toString());
	}

	@Override
	public void addAtHead(Integer node) {
		this.add( node);		
	}

	@Override
	public void addAtTail(Integer node) {
		LLNode<Integer> currNode = lList;
		while( currNode.next() != null) {
			currNode = currNode.next();
		}
		LLNode<Integer> oneNode = new LLNode<>(node);
		currNode.setNext( oneNode );	
		logger.info(" LinkedList -addAtTail{} : {} ", node,  lList.toString());
	}

	@Override
	public void append(Integer node) {
		addAtTail( node);		
	}

	@Override
	public void addAtIndex(int index, Integer node) throws SpringException {
		if (index ==0) add( node) ;
		else {
			LLNode<Integer> currNode = lList;
			int currInd =0;
			boolean endLoop = true;
			while( currNode.next() != null) {
				
				if ( ++currInd  == index  ) {
					LLNode<Integer> oneNode = new LLNode<>( node);
					oneNode.setNext( currNode.next());
					currNode.setNext( oneNode);
					endLoop = false;
					break;
				}
				currNode = currNode.next();
			}
			if ( (index -1) == currInd) {
				// at tail
				currNode.setNext( new LLNode<Integer>(node));		
			} else
			if ( endLoop) throw new SpringException("CAN NOT insert ["+ node+"] on index:["+ index+"] LinkedList size:["+ currInd+"]");
		}
		logger.info(" LinkedList -add index:{} node{} : {} ", index, node,  lList.toString());
	}

	@Override
	public Integer get(int index) throws SpringException {
		LLNode<Integer> theNode = null;
		if (index ==0) return lList.getValue();
		else {
			LLNode<Integer> currNode = lList;
			int currInd =0;
			boolean endLoop = true;
			while( currNode.next() != null) {
				if ( ++currInd  == (index -1)  ) {
					theNode = currNode;
					endLoop = false;
					break;
				}
			}
			if ( endLoop) throw new SpringException("CAN NOT get index:["+ index+"] LinkedList size:["+ currInd+"]");
			
		}
		logger.info(" LinkedList -get index: {}, value:{} list : {} ", index, theNode.getValue(),  lList.toString());
		return theNode.getValue();
	}

	@Override
	public boolean deleteAtIndex(int index) throws SpringException {
		boolean bRet = false;
		logger.info(" LinkedList -0-delete index: {} list : {} ", index,  lList.toString());
		if (index ==0) {
			if ( lList.next() == null) 
				lList.setValue( null);
			bRet = true;
		} else {
			LLNode<Integer> currNode = lList;
			int currInd =0;
			boolean endLoop = true;
			while( currNode.next() != null) {
				if ( ++currInd  == index  ) {
					currNode.setNext( currNode.next().next());
					endLoop = false;
					bRet = true;
					break;
				}
				currNode = currNode.next();
			}
			if ( endLoop) throw new SpringException("CAN NOT delete index:["+ index+"] LinkedList size:["+ currInd+"]");
		}
		logger.info(" LinkedList -1-delete index: {} list : {} ", index,  lList.toString());
		return bRet;
	}

	@Override
	public Integer replaceAt(int index, Integer node) throws SpringException {
		logger.info(" LinkedList -0-replace index: {} list : {} ", index,  lList.toString());
		Integer iRet = node;
		if (index ==0) {
			lList.setValue( node);
		} else {
			LLNode<Integer> currNode = lList;
			int currInd =0;
			boolean endLoop = true;
			while( currNode.next() != null) {
				currNode = currNode.next();
				if ( ++currInd  == (index -1)  ) {
					currNode.setValue( node);
					endLoop = false;
					break;
				}
			}
			if ( endLoop) throw new SpringException("CAN NOT replace integer:["+ node+"  index:["+ index+"] LinkedList size:["+ currInd+"]");
		}
		logger.info(" LinkedList -1-replace index: {} list : {} ", index,  lList.toString());
		return iRet;
	}

	@Override
	public boolean swapNode(int index1, int index2) throws SpringException {
		logger.info(" LinkedList -0-swap index1:{}, index2:{} list : {} ", index1, index2,  lList.toString());
		boolean bRet = false;
		LLNode<Integer> node1 = null, node2 = null;
		LLNode<Integer> currNode = lList;
		int currInd =0;
		boolean endLoop = true;
		boolean n1Found = false, n2Found = false;
		while( currNode.next() != null) {
			currNode = currNode.next();
			++currInd;
			if ( ( currInd == index1) || (currInd == index2)  ) {
				if ( currInd == index1) {
					node1 = currNode;
					n1Found = true;
				} else {
					node2 = currNode;
					n2Found = true;
				}
				if ( n1Found && n2Found) {
					bRet = true;
					Integer temp = node1.getValue();
					node1.setValue( node2.getValue());
					node2.setValue( temp);
					endLoop = false;
					break;
				}
			}	
		}
		if ( endLoop) throw new SpringException("CAN NOT swap index1:["+ index1+"] index2:["+ index2+ "] LinkedList size:["+ currInd+"]");
		logger.info(" LinkedList -0-swap index1:{}, index2:{} list : {} ", index1, index2,  lList.toString());
		return bRet;
	}
	

}
