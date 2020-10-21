package woodspring.someleetcode;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import woodspring.someleetcode.Exception.SpringException;
import woodspring.someleetcode.service.impl.LinkedListServiceImpl;

public class TestLinkedList {
	
	@Test
	public void testAddAtHead() {
		LinkedListServiceImpl lList = new LinkedListServiceImpl();
		lList.add( 100);
		lList.add( 120);
		lList.append( 1120);
		try {
			lList.addAtIndex(1, 700);
			lList.addAtIndex(1, 1700);
			lList.addAtIndex(4, 4700);
			lList.addAtIndex(5, 5700);
			lList.addAtIndex(7, 6700);
			lList.addAtIndex(8, 8700);
			lList.addAtIndex(9, 9700);
			lList.replaceAt(0, 99);
			lList.replaceAt(9, 1234567);
			lList.swapNode(1,  8);
			lList.swapNode(1,  8);
			lList.deleteAtIndex(8);
		} catch (SpringException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		assertNotNull( lList);
		
		
		
	}

}
