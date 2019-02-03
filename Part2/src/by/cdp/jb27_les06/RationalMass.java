package by.cdp.jb27_les06;

import java.util.Scanner;

public class RationalMass {
	public static void main (String args[]) {
		int k;
		k = enterMasNum();
		String [] mas = new String [k];
		enterNumFromConsole(mas);
		
		int i=0; 
		while(i<mas.length) {
			System.out.println(mas[i]);
			i++;
		}
	}
	
	public static int enterMasNum() {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите количество дробей: ");
		while (!sc.hasNextInt()) {
			System.out.print("Ёто не число!");
			sc.next();
		}
		k = sc.nextInt();
		return k;
	}
	public static void enterNumFromConsole(String [] mas) {
		for (int i = 0; i < mas.length; i++) {
			Rationals r1 = new Rationals();
			mas[i] = r1.getNum()+"/"+r1.getDen();
		}
	}
	

}
