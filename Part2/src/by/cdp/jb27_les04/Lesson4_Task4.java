package by.cdp.jb27_les04;

import java.util.Scanner;

public class Lesson4_Task4 {
	public static void main(String[] args) {
		int n;
		n = enterMasNum();
		int[] mas = new int[n];
		enterNumFromConsole(mas);
		int[] num = calcZero(mas, n);
		
		
		int i=0; 
		while(i<num.length && num[i] != -1) {
			System.out.println(num[i]);
			i++;
		}
	}

	public static int enterMasNum() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите количество чисел: ");
		while (!sc.hasNextInt()) {
			System.out.print("Ёто не число!");
			sc.next();
		}
		n = sc.nextInt();
		return n;
	}

	public static void enterNumFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("¬ведите число " + i + ":");
			mas[i] = sc.nextInt();
		}
	}

	public static int[] calcZero(int[] mas, int n) {
		int[] num = new int[n];
		int y = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				num[y] = i;
				y++;
			}
		}
		
		if(y < num.length) {
			num[y] =-1;
		}
		
		return num;
		
	}
}