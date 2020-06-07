package woodspring.someleetcode.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StatisticsOfList {
	 public List<Float> onProcess(List<Integer> count) {
		 List<Float> retList = new ArrayList<>();
		 long numOfSample =0 ; //count.stream().c.count();
		 for ( int ind=1; ind < count.size(); ind++) {
			 numOfSample += count.get(ind);
		 }
		 long medianIndex = numOfSample / 2;
		 if ( (medianIndex % 2) == 1) {
			 medianIndex += 1;
		 }
		 long median =0;
		 long sum = 0;
		 Integer min= 1, max = 0;
		 float globalSum = (float) 0.0;
		 int iMod = 0, iNum=0;
		 boolean isLow = false;
		 int low =0, high=0;
		 for ( int ind=1; ind < count.size(); ind++) {
			 if (count.get( ind) > 0) {
				 int num = count.get(ind);
				
				 if (ind < min  ) min = ind;
				 max = ind;

				 float localSum = num * ind;
				 globalSum += localSum;
				 
				 
				 System.out.println(" ind:"+ind+" num:"+num+" medianIndex:"+medianIndex+ " isLow:"+ isLow+" low:"+low+" high:"+high);
				 if ( isLow) {
					 isLow = false;
					 high = ind;
				 }

				 if (!(medianIndex > 0)) {}
				 else if ( num == medianIndex ) {
					 medianIndex -= num;
					 isLow = true;
					 low = ind;
				 } else  if (  num < medianIndex) {
					 medianIndex -= num;
					 low = ind;
					 if (medianIndex == 1) {
						 isLow = true;
						 
					 } else {
						 high = ind;
					 }
				 } else {
					 medianIndex -= num;
					 low = high = ind;					 
				 }
				 
				 if ( iMod < num) {
					 iMod = num;
					 iNum = ind;
				 }
				 
			 }
		 }
		 System.out.println("low:"+ low+" high:"+ high);
		 retList.add( Float.valueOf( Integer.valueOf( min).longValue()) );
		 retList.add( Float.valueOf( Integer.valueOf( max).longValue()) );
		 retList.add( Float.valueOf(  globalSum /numOfSample) );
		 retList.add( Float.valueOf( (float)( (low + high)/2.0) )) ;
		 retList.add( Float.valueOf( Integer.valueOf( iNum).longValue()) );
		 
		 retList.stream().forEach(item -> System.out.println("value:" + item));
		 
		 return retList;
		 
	 }

}
