package by.cdp.jb27_les02;

import java.util.Scanner;

public class Lesson2_Task1 {
	public static void main (String args[]) {
		double a; // объ€вление первой неизвестной
		double b; // объ€вление второй неизвестной
		double c; // объ€вление третьей неизвестной
		double sq; // объ€вление значени€ корн€
		double undsq; // объ€вление значени€ внутри корн€
		double chis; // объ€вление числител€
		double znam; // объ€вление знаменател€
		double otv; // результат
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите переменную a:");
				while (!sc.hasNextDouble()) {
					System.out.println("Ёто не число");
					sc.next();
				} 
				a = sc.nextDouble();
				
		System.out.println("¬ведите переменную b:");
		while (!sc.hasNextDouble()) {
			System.out.println("Ёто не число");
			sc.next();
		} 
		b = sc.nextDouble();
		
		System.out.println("¬ведите переменную c:");
		while (!sc.hasNextDouble()) {
			System.out.println("Ёто не число");
			sc.next();
		} 
		c = sc.nextDouble();
		undsq=b*b+4*a*c;
		if (undsq<0) {
			System.out.println("Ќельз€ извлечь корень из отрицательного числа");
			otv= Double.NaN;
			}
		sq=Math.sqrt(undsq);
		chis=b+sq;
		znam=2*a;
		if (znam==0) {
			System.out.println("Ќельз€ делить на ноль");
			otv= Double.NaN;
		}
		otv=(chis/znam)-(a*a*a*c) +b;
		System.out.println("ќтвет:"+otv);
	}

}
