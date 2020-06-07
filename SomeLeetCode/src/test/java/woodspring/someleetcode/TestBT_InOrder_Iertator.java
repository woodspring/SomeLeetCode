package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import woodspring.someleetcode.entity.BT_InOrder_Iterator;
import woodspring.someleetcode.entity.SpringTree;
import woodspring.someleetcode.entity.TreeNode;

public class TestBT_InOrder_Iertator {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private SpringTree springTree = new SpringTree();
	
	@Test
	public void test1BT_Iterator_On_SpringTree() {
		List<Integer> testList = new ArrayList<>();
		testList.add( 30);testList.add( 20);testList.add( 70);testList.add( 10);testList.add( 90);
//		testList.add( 35);testList.add( 29);testList.add( 73);testList.add( 1);testList.add( 91);
//		testList.add( 39);testList.add( 23);testList.add( 79);testList.add( 9);testList.add( 97);
//		testList.add( 38);testList.add( 37);testList.add( 39);testList.add( 29);testList.add( 13);
		
		springTree = springTree.build(testList);
		String treeMap = springTree.toString();
		BT_InOrder_Iterator<TreeNode<Integer>> btIterator = new BT_InOrder_Iterator( springTree.getHead());
		logger.info(" TreeMap:["+treeMap+"]");
		while( btIterator.hasNext()) {
			TreeNode<Integer> theNode = btIterator.next();
			logger.info("the Node:["+ theNode.getValue()+"]");
			assertNotNull( theNode);
		}
	}
	
	@Test
	public void test2BT_Iterator_On_SpringTree() {
		List<Integer> testList = new ArrayList<>();
		testList.add( 30);testList.add( 20);testList.add( 70);testList.add( 10);testList.add( 90);
		testList.add( 35);testList.add( 29);testList.add( 73);testList.add( 1);testList.add( 91);
//		testList.add( 39);testList.add( 23);testList.add( 79);testList.add( 9);testList.add( 97);
//		testList.add( 38);testList.add( 37);testList.add( 39);testList.add( 29);testList.add( 13);
		
		springTree = springTree.build(testList);
		String treeMap = springTree.toString();
		BT_InOrder_Iterator<TreeNode<Integer>> btIterator = new BT_InOrder_Iterator( springTree.getHead());
		logger.info(" TreeMap:["+treeMap+"]");
		while( btIterator.hasNext()) {
			TreeNode<Integer> theNode = btIterator.next();
			logger.info("the Node:["+ theNode.getValue()+"]");
			assertNotNull( theNode);
		}
	}
	
	@Test
	public void test4BT_Iterator_On_SpringTree() {
		List<Integer> testList = new ArrayList<>();
		testList.add( 30);testList.add( 20);testList.add( 70);testList.add( 10);testList.add( 90);
		testList.add( 35);testList.add( 29);testList.add( 73);testList.add( 1);testList.add( 91);
		testList.add( 39);testList.add( 23);testList.add( 79);testList.add( 9);testList.add( 97);
		testList.add( 38);testList.add( 37);testList.add( 39);testList.add( 29);testList.add( 13);
		
		springTree = springTree.build(testList);
		String treeMap = springTree.toString();
		BT_InOrder_Iterator<TreeNode<Integer>> btIterator = new BT_InOrder_Iterator( springTree.getHead());
		logger.info(" TreeMap:["+treeMap+"]");
		while( btIterator.hasNext()) {
			TreeNode<Integer> theNode = btIterator.next();
			logger.info("the Node:["+ theNode.getValue()+"]");
			assertNotNull( theNode);
		}
	}

}
