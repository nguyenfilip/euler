package net.nguyen;

import java.util.Collections;

public class ProperDivisorSumCache {
	private Integer [] sumByNum = null;
	
	public ProperDivisorSumCache(int maxNum){
		sumByNum= Collections.nCopies(maxNum+1, 0).toArray(new Integer[]{});
		for (int i = 1, position=2;i <= maxNum/2;i++,position=i+i){
			while (position <= maxNum) {
				sumByNum[position]= sumByNum[position]+i;
				position+=i;
			}
		}
	}
	
	public Integer getDivisorSumOf(Integer inte){
		return sumByNum[inte];
	}
}
