package woodspring.someleetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import woodspring.someleetcode.service.impl.StatisticsOfList;

public class TestStatisticsOfList {
	private StatisticsOfList theList = new StatisticsOfList();
	
	@SuppressWarnings("deprecation")
	@Test
	public void testOnProcess() {
		List<Integer> count = new ArrayList<>();
		count.add(0);
		count.add(1);count.add(3);count.add(4);
		count.add(0);count.add(0);count.add(0);count.add(0);
		count.add(0);count.add(0);count.add(0);count.add(0);count.add(0);
		
		List<Float> result = theList.onProcess( count);
		assertEquals( result.get(0), new Float(1.0));
		assertEquals( result.get(1), new Float(3.0));
		assertEquals( result.get(2), new Float(2.375000));
		assertEquals( result.get(3), new Float(2.5000));
		assertEquals( result.get(4), new Float(3.000));
		

		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testOnProcess2() {
		List<Integer> count = new ArrayList<>();
		count.add(0);
		count.add(4);count.add(3);count.add(2);count.add(2);
		count.add(0);count.add(0);count.add(0);count.add(0);
		count.add(0);count.add(0);count.add(0);count.add(0);count.add(0);
		
		List<Float> result = theList.onProcess( count);
		assertEquals( result.get(0), new Float(1.0));
		assertEquals( result.get(1), new Float(4.0));
		assertEquals( result.get(2), new Float(2.1818182));
		assertEquals( result.get(3), new Float(2.000));
		assertEquals( result.get(4), new Float(1.000));
		

		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testOnProcess3() {
		List<Integer> count = new ArrayList<>();
		count.add(0);
		count.add(4);count.add(3);count.add(2);count.add(2);
		count.add(14);count.add(23);count.add(79);count.add(27);
		count.add(24);count.add(13);count.add(201);count.add(29);
		count.add(49);count.add(37);count.add(12);count.add(122);
		count.add(43);count.add(39);count.add(162);count.add(12);
		count.add(0);count.add(0);count.add(0);count.add(0);
		count.add(0);count.add(0);count.add(0);count.add(0);count.add(0);
		
		List<Float> result = theList.onProcess( count);
		assertEquals( result.size(), 5);


		
	}
}
