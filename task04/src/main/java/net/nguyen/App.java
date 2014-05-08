package net.nguyen;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		for (Integer palindrom : new PalindromGenerator(999 * 999, 100 * 100)) {
			for (int i = 999; i >= 100; i--) {
				if (palindrom % i == 0) {
					if (i < 999 && palindrom / i < 999) {
						System.out.println(String.format("%d x %d = %d", i,
								palindrom / i, palindrom));
						return;
					}
				}

			}

		}
	}

}
