package net.nguyen;

import java.util.Arrays;

/**
 * Hello world!
 * 
 */
public class CopyOfApp {
	public static void main(String[] args) {
		
//		System.out.println(Arrays.toString(minus(new String[]{"aa","bb"},1)));
		
//		System.out.println(one("aaa","aba"));
		System.out.println(dist("aaa","bbb",new String[]{"aca","aba","abb"}));
	}

	public static int dist(String s, String e, String[] d){
		if (one(s,e))
			return 1;
		int min = 1000000;
		
		int i = 0;
		for (String w:d){
			if (one(s,w))
				min = Math.min(1+dist(w,e,minus(d,i)),min);
			i++;
		}
		return min;
	}

	private static String[] minus(String[] d, int i) {
		d[i] = d[0];
		return Arrays.copyOfRange(d, 1, d.length);
	}

	private static boolean one(String a, String b) {
		int i = 0;
		
		if (a.length() == b.length()) {
			for (int x = 0;x<a.length();x++){
				if (a.charAt(x)!= b.charAt(x))
					i++;
			}
		}
		return i==1;
	}
}
