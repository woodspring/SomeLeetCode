package woodspring.someleetcode.service.impl;

import org.springframework.stereotype.Service;

@Service
public class Shift2DGrid1260 {
	
	public int[][] doProcess( int[][] grid, int k) throws Exception {
		if  (grid == null || grid.length == 0 )  return null;
		if (k == 0) return grid; if (k > 100) return null;
		int m = grid.length;		
		int n = grid[0].length;
		if ( n > 50) return null;
		
		/*
		int loopTimes = 0;
		while ( loopTimes < k) {
			int tmpValue = grid[m-1][n-1];
			
			for ( int ind =0; ind < m; ind++) {
				int iValue = 0;
				boolean endLoop = false;
				for ( int inj =0; inj < n; inj++ ) {
					iValue = grid[ind][inj];
					grid[ind][inj] = tmpValue;
					tmpValue = iValue;
					if ( (inj == n-1) && (ind == (m-1))) {
						endLoop = true;
						break;
					}
				}
				if (endLoop) break;
			}
for ( int i =0; i < m; i++ ) {
	System.out.print("-"+loopTimes+"- grid:[ ");
	for ( int jj =0; jj < n; jj++) {
		int one = grid[i][jj];
		System.out.print( one+" ");
	}
	System.out.println("]");
}
			loopTimes++;
		}
*/		

		int[][] vGrid = new int[m][n];
		int km = k / m;
		int kn = k % n;
		int tmpI = m - km, tmpJ = (kn ==0) ? kn :n-kn;
		for (int ini = 0; ini < m; ini++) {
			for ( int inj =0; inj < n; inj++) {
				tmpI = ini + km;
				if (!( tmpI < m)) tmpI = tmpI -m;
				tmpJ = inj + kn;
				if ( !(tmpJ < n)) {
					if ( tmpI == (m-1)) {
						tmpI = 0;
						tmpJ=0;
					} else {
						tmpI++;
						tmpJ = tmpJ -n;
					}
				}
				vGrid[tmpI][tmpJ] = grid[ini][inj];
			}
		}
		
		for ( int i =0; i < m; i++ ) {
			System.out.print("k:"+k+" grid:[ ");
			for ( int jj =0; jj < n; jj++) {
				int one = grid[i][jj];
				System.out.print( one+" ");
			}
			System.out.println("]");
		}		
System.out.println("k:"+k+" m:"+ m+" km:"+km+" n:"+n+" kn:"+ kn);		
		for ( int i =0; i < m; i++ ) {
			System.out.print("k:"+k+" vGrid:[ ");
			for ( int jj =0; jj < n; jj++) {
				int one = vGrid[i][jj];
				System.out.print( one+" ");
			}
			System.out.println("]");
		}		

		
		return vGrid;
	}

}
