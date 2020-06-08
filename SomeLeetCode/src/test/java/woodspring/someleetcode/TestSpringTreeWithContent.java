package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import woodspring.someleetcode.entity.SpringTree;
import woodspring.someleetcode.entity.SpringTreeIn;

public class TestSpringTreeWithContent {
	private SpringTreeIn springTree = new SpringTreeIn();
	
	@Test
	public void testBuildandToString() {
		List<Integer> testList = new ArrayList<>();
		testList.add( 30);testList.add(1);
		testList.add( 20);testList.add(2);
		testList.add( 70);testList.add(3);
		testList.add( 10);testList.add(4);
		testList.add( 90);testList.add(7);
		testList.add( 25);testList.add( 5);
		testList.add(50);testList.add(6);
//		testList.add( 35);testList.add( 29);testList.add( 73);testList.add( 1);testList.add( 91);
//		testList.add( 39);testList.add( 23);testList.add( 79);testList.add( 9);testList.add( 97);
//		testList.add( 38);testList.add( 37);testList.add( 39);testList.add( 29);testList.add( 13);
		
		springTree = springTree.build( testList);
		String treeMap = springTree.toString();
		System.out.println(" SpringMap:["+ treeMap+"]");
		assertNotNull(springTree);
		assertEquals( treeMap, "  1   9   10   13   20   23   29   30   35   37   38   39   70   73   79   90   91   97 ");
	}
	
}
