package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.leetcode.BinaryTree;

public class TestBinaryTree {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private BinaryTree bTree = new BinaryTree();
	
	@Test 
	public void testBinaryTreeBuild() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(50);testList.add(20);
		testList.add(150);testList.add(19);
		testList.add(120);testList.add(14);
		testList.add(250);testList.add(10);
		testList.add(120);testList.add(14);
		
		testList.stream()
		.forEach(item -> bTree.put( item.intValue()));
		logger.info( "BinaryTree:{}", bTree.toString());
		assertNotNull( bTree);
	}

	
	@Test 
	public void testBinaryTreeFound() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(50);testList.add(20);
		testList.add(150);testList.add(19);
		testList.add(120);testList.add(14);
		testList.add(250);testList.add(10);
		testList.add(120);testList.add(14);
		
		testList.stream()
		.forEach(item -> bTree.put( item.intValue()));
		logger.info( "BinaryTree:{}", bTree.toString());
		
		logger.info( "BinaryTree find:{}", bTree.find(20));
		assertTrue( bTree.find( 250) );
	}
	
	@Test 
	public void testBinaryTreeNotFound() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(50);testList.add(20);
		testList.add(150);testList.add(19);
		testList.add(120);testList.add(14);
		testList.add(250);testList.add(10);
		testList.add(120);testList.add(14);
		
		testList.stream()
		.forEach(item -> bTree.put( item.intValue()));
		logger.info( "BinaryTree:{}", bTree.toString());
		
		logger.info( "BinaryTree find:{}", bTree.find(220));
		assertFalse( bTree.find( 220) );
	}
}
