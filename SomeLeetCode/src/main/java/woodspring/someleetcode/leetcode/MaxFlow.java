package woodspring.someleetcode.leetcode;


import java.util.Queue;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxFlow {
	private static final Logger logger = LoggerFactory.getLogger(MaxFlow.class);
	
	private int vNumber;
	
	public MaxFlow( int vNum) {
		this.vNumber = vNum;
	}
	
	
	public int getMaxFlow(int[][] graph, int source, int dest) {
		int maxFlow = 0; // inital
		int currV, nextV;
		int vNum = graph[0].length;
		int[][] currGraph = new int[ vNum][vNum];
		for ( currV=0; currV < vNum; currV++) 
			for ( nextV=0; nextV < vNum; nextV++)
				currGraph[ currV][ nextV] = graph[ currV][ nextV];
		
		int[] parent = new int[ vNum];
		while ( bfs( currGraph, source, dest, parent)) {
			int pathFlow = Integer.MAX_VALUE;
			for ( nextV = dest; nextV != source; nextV= parent[ nextV]) {
				logger.info("in loop; nextV:{}, currV:{} parent:{}  pathFlow:{}",  // parent:{} currG:{} pathFlow:{}", 
						nextV, currV, parent[ nextV] 					//, currGraph[ currV][ nextV]
								, pathFlow);
				currV = parent[ nextV];
				pathFlow = Math.min( pathFlow,  currGraph[ currV][ nextV]);
			}
			
			for (nextV = dest; nextV != source; nextV = parent[ nextV]) {
				currV = parent[ nextV];
				currGraph[ currV][ nextV] -= pathFlow;
				currGraph[ nextV][ currV] += pathFlow;
			}
			logger.info(" maxFlow:{},  pathFlow:{}", maxFlow, pathFlow);
			maxFlow += pathFlow;
		}
		
		logger.info( "maxFlow:{}", maxFlow);
		return maxFlow;		
	}
	
	
	private boolean bfs( int[][] currGraph, int source, int dest, int[] parent) {
		boolean bRet = true;
		int currGraphLen = currGraph[0].length;
		Boolean[] visited = new Boolean[ vNumber];
		
		for (int ind =0; ind < currGraphLen; ind++) 
			visited[ind] = false;
		
		logger.info("---------------------------------------");
		Queue<Integer> queue   = new LinkedList<>(); 
		//LinkedList<Integer> queue = new LinkedList();
		queue.add(source);
		visited[source] = true;
		parent[ source] = -1;
		while( !queue.isEmpty()) {
			int currV = queue.poll();
			for ( int nextV=0; nextV < currGraphLen; nextV++) {
				logger.info(" currV:{}, nextV:{}, visited:{}, graphV:{} currGraphLen:{}", currV, nextV, visited[ nextV], currGraph[ currV ][nextV], currGraphLen);
				if ( !visited[ nextV] && ( currGraph[ currV ][nextV] > 0)) {
					queue.add( nextV);
					parent[ nextV] = currV;
					visited[ nextV] = true;
				}					
			}		 
		}
		logger.info("==0==>dest:{}, visisted:{} {} {} {} {} {}", dest, visited[0], visited[1], visited[2], visited[3], visited[4], visited[5] );
		logger.info("==1==>dest:{}, parent:{} {} {} {} {} {}", dest, parent[0], parent[1], parent[2], parent[3], parent[4], parent[5] );
		return ( visited[ dest]);	
	}
	

}
