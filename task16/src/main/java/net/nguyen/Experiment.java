package net.nguyen;

public class Experiment {

	public static void main(String[] args) {
		
		for (Integer i = init();i<condition();i=increment(i)){
			System.out.println(i);
		}
	}

	private static Integer increment(Integer i) {
		System.out.println("Incrementing");
		return ++i;
	}

	private static int condition() {
		System.out.println("Condition is being checked");
		return 10;
	}

	private static int init() {
		System.out.println("initing");
		return 0;
	}
}
