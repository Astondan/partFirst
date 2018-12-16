package by.cdp.jb27_les03;

import java.util.Scanner;

public class Lesson3_Task3 {
	public static void main (String[] args) {
		double x;
		double y;
		x=xInput();
		y=functionCalc(x);
		printResult(y);
	}
		
		public static double xInput() {
			double x = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите x: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Это не число!");
			sc.next();
			}
			x = sc.nextDouble();
			return x;
		}
		
		
		public static double functionCalc(double x) {
			double y=0;
			if (x<=-3) {
				y=9;
				return y;
			} if (x>3) {
				y= 1/(x*x+1);
				return y;
			}
			else {
				System.out.println("При этом значении x функия прерывется");
				y=Double.NaN;
				return y;
			}
			}
			
			
		public static void printResult(double y) {
			System.out.println("Значение:"+y);
		}
}
