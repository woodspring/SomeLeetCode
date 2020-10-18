package woodspring.someleetcode.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazonInterview {
	private static final Logger logger = LoggerFactory.getLogger(AmazonInterview.class);
	
	private List<Integer> theList;
	private Integer theKey;
	
	public AmazonInterview( ) {}
	public List<PairObject> findPair(List<Integer> oneList, Integer theKey) {
		List<PairObject> retList = new ArrayList<PairObject>();
		Collections.sort(oneList);
		for ( int  indX = (oneList.size()-1); indX >= 0; indX--) {
			Integer value = oneList.get( indX);
			if ( !( value.compareTo( theKey) < 0)) continue;
			else {
				for (int indY = indX -1;  indY >=0; indY--) {
					Integer value2 = oneList.get( indY);
					if ( theKey == ( value + value2)) {
						PairObject po = new PairObject(value, value2);
						retList.add( po);
					}
				}
			}
			
		}
		logger.info( " theResult:{}", retList.toString());
		return retList;
		
	}
	
	
	
	
	public class PairObject {
		private Integer value1;
		private Integer value2;
		
		public PairObject( Integer v1, Integer v2) {
			this.value1 = v1;
			this.value2 = v2;
		}

		public Integer getValue1() {
			return value1;
		}

		public void setValue1(Integer value1) {
			this.value1 = value1;
		}

		public Integer getValue2() {
			return value2;
		}

		public void setValue2(Integer value2) {
			this.value2 = value2;
		}
		public String toString() {
			return "("+ value1+" , "+ value2+")";
		}
	}
	
	

}
