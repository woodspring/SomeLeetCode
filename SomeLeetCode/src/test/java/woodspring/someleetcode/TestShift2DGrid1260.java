package woodspring.someleetcode;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import woodspring.someleetcode.service.impl.Shift2DGrid1260;

//@ExtendWith(SpringExtension.class)
//@SpringBootTest(classes =)
public class TestShift2DGrid1260 {
	private Shift2DGrid1260 testObj = new Shift2DGrid1260();
	
	@Test 
	public void testDoProcess() {
		int[][]  grid = { {1,2,3}, {4,5,6}, {7,8,9}};
		int k = 1;
		try {
			int[][] result= testObj.doProcess( grid, k);
			int m = result.length;
			int n = result[0].length;
			System.out.println("result, m:["+m+"] n:["+n+"]");
			System.out.println("result, m:["+m+"] n:["+n+"]");
			for (int i =0; i < m; i++) {
				System.out.print(i+" :[");
				for (int j =0; j < n; j++)
					System.out.print(" "+ result[i][j]);
				System.out.println("]");
			}
			
			assertNotNull(result);
			assertEquals(result[0][0], 9);
			assertEquals(result[0][1], 1);
			assertEquals(result[0][2], 2);
			assertEquals(result[1][0], 3);
			assertEquals(result[1][1], 4);
			assertEquals(result[1][2], 5);
			assertEquals(result[2][0], 6);
			assertEquals(result[2][1], 7);
			assertEquals(result[2][2], 8);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Test 
	public void testDoProcess2() {
		int[][]  grid = { {3,8,1,9}, {19,7,2,5}, {4,6,11,10}, {12,0,21,13}};
		int k = 4;
		try {
			int[][] result= testObj.doProcess( grid, k);
			int m = result.length;
			int n = result[0].length;
			System.out.println("result, m:["+m+"] n:["+n+"]");
			System.out.println("result, m:["+m+"] n:["+n+"]");
			for (int i =0; i < m; i++) {
				System.out.print(i+" :[");
				for (int j =0; j < n; j++)
					System.out.print(" "+ result[i][j]);
				System.out.println("]");
			}
			assertNotNull(result);
			assertEquals(result[0][0], 12);
			assertEquals(result[0][1], 0);
			assertEquals(result[0][2], 21);
			assertEquals(result[0][3], 13);
			assertEquals(result[1][0], 3);
			assertEquals(result[1][1], 8);
			assertEquals(result[1][2], 1);
			assertEquals(result[1][3], 9);
			assertEquals(result[2][0], 19);
			assertEquals(result[2][1], 7);
			assertEquals(result[2][2], 2);
			assertEquals(result[2][3], 5);
			assertEquals(result[3][0], 4);
			assertEquals(result[3][1], 6);
			assertEquals(result[3][2], 11);
			assertEquals(result[3][3], 10);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testDoProcess3() {
		int[][]  grid = { {1,2,3}, {4,5,6}, {7,8,9}};
		int k = 9;
		try {
			int[][] result= testObj.doProcess( grid, k);
			int m = result.length;
			int n = result[0].length;
			System.out.println("result, m:["+m+"] n:["+n+"]");
			for (int i =0; i < m; i++) {
				System.out.print(i+" :[");
				for (int j =0; j < n; j++)
					System.out.print(" "+ result[i][j]);
				System.out.println("]");
			}
			assertNotNull(result);
			assertEquals(result[0][0], 1);
			assertEquals(result[0][1], 2);
			assertEquals(result[0][2], 3);
			assertEquals(result[1][0], 4);
			assertEquals(result[1][1], 5);
			assertEquals(result[1][2], 6);
			assertEquals(result[2][0], 7);
			assertEquals(result[2][1], 8);
			assertEquals(result[2][2], 9);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
