package by.cdp.jb27_les04;

import java.util.Scanner;

public class Lesson4_Task3 {
	public static void main(String[] args) {
		int n;
		boolean answer;
		n = enterMasNum();
		int[] mas = new int[n];
		enterNumFromConsole(mas);
		answer = calcIncrease(mas);
		printResult(answer);
	}

	public static int enterMasNum() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество чисел: ");
		while (!sc.hasNextInt()) {
			System.out.print("Это не число!");
			sc.next();
		}
		n = sc.nextInt();
		return n;
	}

	public static void enterNumFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("Введите число " + i + ":");
			mas[i] = sc.nextInt();
		}
	}

	public static boolean calcIncrease(int[] mas) {
		boolean answer = true;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] <= mas[i - 1]) {
				answer = false;
			}
		}
		return answer;
	}

	public static void printResult(boolean answer) {
		if (answer == false) {
			System.out.println("Последовательность не возрастающая");
		} else {
			System.out.println("Последовательность возрастающая");
		}
	}
}