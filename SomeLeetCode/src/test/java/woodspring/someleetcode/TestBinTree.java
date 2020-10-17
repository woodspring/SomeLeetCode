package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.BinTreeNode;
import woodspring.someleetcode.leetcode.BinTree;
import woodspring.someleetcode.leetcode.BinTreeIter;

public class TestBinTree {
	private final static Logger logger = LoggerFactory.getLogger(TestBinTree.class);
	
	@Test 
	public void testInitialBinTree() {
		BinTree testTree = new BinTree(50);
logger.info("testBtree:{}", testTree.toString());
		assertNotNull( testTree);
	}
	
	@Test 
	public void testBinTreePutValue() {
		BinTree testTree = new BinTree(50);
		testTree.put(70).put(10).put(110).put(35);
logger.info("testBtree:{}", testTree.toString());
		assertNotNull( testTree);
	}
	@Test 
	public void testBinTreePutDuplicatedValue() {
		BinTree testTree = new BinTree(50);
		testTree.put(70).put(10).put(110).put(35).put(70).put(90);
logger.info("testBtree:{}", testTree.toString());
		assertNotNull( testTree);
	}
	
	@Test
	public void testBinTreeIter() {
		BinTree testTree = new BinTree(50);
		testTree.put(70).put(10).put(110).put(35).put(37).put(90);
logger.info("testBtree:{}", testTree.toString());
		BinTreeIter btItr = new BinTreeIter( testTree.getRoot());
assertNotNull( btItr);
StringBuffer strBuf = new StringBuffer();
		while( btItr.hasNext()) {
			BinTreeNode<Integer> btNode = btItr.next();
			logger.info( "BinTreeItr, value:{}", btNode.getValue());
			strBuf.append( " "+btNode.getValue());
			
		}
		logger.info("------------------Iter list:{}", strBuf.toString());
		assertNull( btItr.next());		
	}
	
}
