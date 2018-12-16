package by.cdp.jb27_les03;

import java.util.Scanner;

public class Lesson3_Task1_3 {
	public static void main(String[] args) {
		int year, month, col_day;
		year = yearInput();
		month = monthInput();
		col_day = dayCalc(year, month);
		printResult(col_day);
	}

	public static int yearInput() {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		System.out.print("Введите год: ");
		if (sc.hasNextInt()) {
			year = sc.nextInt();
		}
		return year;

	}

	public static int monthInput() {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите номер месяца: ");
		if (sc.hasNextInt()) {
			month = sc.nextInt();
		}
		return month;
	}

	public static int dayCalc(int year, int month) {
		int col_day = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		return col_day;
	}

	public static void printResult(int col_day) {
		System.out.println("Количество дней равно - " + col_day);
	}

}