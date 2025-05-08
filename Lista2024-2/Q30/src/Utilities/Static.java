package Utilities;

public class Static {

	public static int Max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int Max(int a, int b, int c) {
		return Max(Max(a, b), c);
	}
	
	public static int Max(int a, int b, int c, int d) {
		return Max(Max(a, b, c), d);
	}
	
	public static int Max(int a, int b, int c, int d, int e) {
		return Max(Max(a, b, c, d), e);
	}
}
