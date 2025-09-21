package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13

		int a = 0;
		int b = 1;
		int c;

		int range = 8;

		for (int i = 0; i < range; i++) {
			System.out.print(a + " ");
			c = a + b;

			a = b;
			b = c;
			
		}}}