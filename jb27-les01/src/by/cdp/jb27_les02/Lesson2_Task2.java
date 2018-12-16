package by.cdp.jb27_les02;

import java.util.Scanner;

public class Lesson2_Task2 {
	public static void main (String args[]) {
		double r = 0; // объ€вление радиуса
		double c; // объ€вление длины окружности
		double s; // объ€вление площади круга
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите радиус:");
				while (!sc.hasNextDouble()) {
					System.out.println("“ака€ фигура не существует");
					sc.next();
					System.out.println("¬ведите радиус:");
				} 
				r = sc.nextDouble();
				if (r<=0) {
					System.out.println("“ака€ фигура не существует");
					
				}
				else {
			c=r*2*3.14;
			s=3.14*r*r;
			System.out.println("ƒлина окружности:" + c);
			System.out.println("ѕлощадь круга:" + s);			
				}
	}
}
