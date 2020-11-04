package woodspring.someleetcode.entity;

import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KnapSack {
	private static final Logger logger = LoggerFactory.getLogger(KnapSack.class);
	ConcurrentHashMap<String, Integer> memo = new ConcurrentHashMap<>();
	
	public int knapSackWithMemo(int[] weights, int[] values, int packWeight, int index) {
		if ( 0 >  index || 0 ==  packWeight  ) return 0;
		if ( 0 > packWeight ) return Integer.MIN_VALUE;
		String keyStr = String.format("%d|%d", index, packWeight);
		if ( !memo.contains(keyStr)) {
			int include = values[index] + knapSackWithMemo( weights, values, packWeight - weights[index], index -1);
			int exclude = knapSackWithMemo( weights, values, packWeight, index-1);
			memo.put( keyStr, Math.max( include,  exclude));
			logger.info(" key:{}, value:{} v:{}, w:{} pW:{} ", keyStr, Math.max( include,  exclude),
					 values[index], weights[index],  packWeight);
			
		}
		return memo.get( keyStr);
		
	}
	public int knapSackWithMemoMap(int[] weights, int[] values, int packWeight, int index, ConcurrentHashMap<String, Integer> memoirize) {
		if ( 0 >  index || 0 ==  packWeight  ) return 0;
		if ( 0 > packWeight ) return Integer.MIN_VALUE;
		String keyStr = String.format("%d|%d", index, packWeight);
		if ( !memoirize.contains(keyStr)) {
			int include = values[index] + knapSackWithMemoMap( weights, values, packWeight - weights[index], index -1, memoirize);
			int exclude = knapSackWithMemoMap( weights, values, packWeight, index-1, memoirize);
			memoirize.put( keyStr, Math.max( include,  exclude));
			logger.info("knapSackWithMemoMap: key:{}, value:{} v:{}, w:{} pW:{} ", keyStr, Math.max( include,  exclude),
					 values[index], weights[index],  packWeight);
			
		}
		return memoirize.get( keyStr);
		
	}
	
	public int startKnapsackWithMemo(int[] weights, int[] values, int packWeight) {
		ConcurrentHashMap<String, Integer> memoMap = new ConcurrentHashMap<>();
		int result_1 =  knapSackWithMemoMap(weights, values, packWeight, values.length-1, memoMap);
		int result_2 =  knapSackWithMemo(weights, values, packWeight, values.length-1);
		logger.info( "memoMap:{},  memorize:{}",result_1, result_2 );
		
		return result_2;
		
		
	}

}
