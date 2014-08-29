package net.nguyen;

import java.util.Arrays;

public class PowerOfTwo {
	private int[] num;
	
	public PowerOfTwo(int maxLen){
		num=new int[maxLen];
		Arrays.fill(num, -1);
		num[maxLen-1]=1;
	}
		
	public long sum(){
		long sum =0 ;
		for (int i = num.length-1;num[i]!=-1;i--)
			sum+=num[i];
		return sum;
	}
	
	public void createNextPower(){
		int add=0;
		int res =0;
		int i= num.length-1;
		for (i = num.length-1;num[i]!=-1;i--) {
			res=  (num[i]*2);
			num[i]=res%10+add;
			add=res/10;
		}
		if (add == 1)
			num[i]=1;
	}

	public void pow(int i) {
		for (int k=0;k<i;k++)
			createNextPower();
	}
}
