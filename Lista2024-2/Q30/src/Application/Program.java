package Application;

import Utilities.Static;

public class Program {

	public static void main(String[] args) {
		System.out.println("Maior de dois: " + Static.Max(3, 4));
		System.out.println("Maior de tres: " + Static.Max(3, 7, 1));
		System.out.println("Maior de quato: "+ Static.Max(3, 4, 8, 11));
		System.out.println("Maior de cinco: "+ Static.Max(3, 4, 90, 3, 111));
	}
}
