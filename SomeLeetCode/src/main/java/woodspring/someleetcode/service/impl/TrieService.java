package woodspring.someleetcode.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.TrieNode;

public class TrieService {
	private final static Logger logger = LoggerFactory.getLogger(TrieService.class);
	
	private TrieNode root;
	private int index =0;
	
	public TrieService() {
		root = new TrieNode();
		index =0;
	}
	
	
	
	public boolean  insert(String theStr) {
		boolean bRet = true;

		root.put( theStr,  0,  ++index);;
		//root.insert(root, theStr, 0, index, aNode)
		logger.info("root toString:{}", root.toString());
		return bRet;
		
		
	}
	
	public TrieNode search(String theStr) {
		TrieNode theNode = root.findString(root, theStr, 0);
		
		return theNode;
	}

}
