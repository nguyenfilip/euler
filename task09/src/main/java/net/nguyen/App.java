package net.nguyen;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		for (int a = 1; a < 1000; a++)
			for (int b = a + 1; b < 1000; b++)
				for (int c = b + 1; c < 1000; c++) {
					if (a + b + c == 1000)
						if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
							System.out.println(String.format("%d %d %d = %d",
									a, b, c, a * b * c));

				}

	}

}
