package main;

import java.util.Scanner;

public class Zav12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Input a");
		a = sc.nextDouble();
		double b;
		System.out.println("Input b");
		b = sc.nextDouble();
		double c;
		System.out.println("Input c");
		c = sc.nextDouble();

		if (a + b > c & a + c > b & b + c > a) {
			Triangle ex = new Triangle(a, b, c);
			System.out.println("Squere= " + ex.square(ex.getA(), ex.getB(), ex.getC()));
		} else {
			System.out.println("The triangle is wrong!");
		}
		sc.close();

	}

}
