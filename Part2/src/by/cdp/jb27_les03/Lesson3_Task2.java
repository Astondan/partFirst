package by.cdp.jb27_les03;

import java.util.Scanner;

public class Lesson3_Task2 {
	public static void main (String[] args) {
		double a;
		double b;
		double h;
		double y;
		a=beginPointInput();
		b=endPointInput();
		h=stepInput();
		functionCalc(a,b,h);
	}
		
		public static double beginPointInput() {
			double a = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("¬ведите начало отрезка: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Ёто не число!");
			sc.next();
			}
			a = sc.nextDouble();
			return a;
		}
		
		public static double endPointInput() {
			double b = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("¬ведите конец отрезка: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Ёто не число!");
			sc.next();
			}
			b = sc.nextDouble();
			return b;
		}
		
		public static double stepInput() {
			double h = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("¬ведите шаг: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Ёто не число!");
			sc.next();
			}
			h = sc.nextDouble();
			return h;
		}
		
		public static void functionCalc(double a,double b, double h) {
			double y=0;
			for (;a<=b; a=a+h) {
				y = 2*Math.tan(a/2)+1;
				System.out.println("------------------------------");
				System.out.println("| " + a + " |"+ "| "+y+" |");
			}
		}
}