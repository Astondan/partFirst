package by.cdp.jb27_les04;
import java.util.Scanner;

public class Lesson4_Task2 {
	public static void main (String[] args) {
		int n;
		int sum;
		int k;
		n = enterMasNum();
		int [] mas = new int [n];
		enterArrayFromConsole(mas);
		k=kratFig();
		sum=divFigure(mas,k);
		printResult(sum);
	}
	
	public static int enterMasNum() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите количество €чеек массива: ");
		while (!sc.hasNextInt()) {
			System.out.print("Ёто не число!");
		sc.next();
		}
		n = sc.nextInt();
		return n;
	}
	
	public static void enterArrayFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
		System.out.print("¬ведите число "+ i+":");
		mas[i] = sc.nextInt();
		}
		}
	
	public static int kratFig() {
		int k;
		Scanner qw = new Scanner(System.in);
		System.out.print("¬ведите число кратного отбора: ");
		while (!qw.hasNextInt()) {
			System.out.print("Ёто не число!");
		qw.next();
		}
		k = qw.nextInt();
		return k;
		}
	
	public static int divFigure(int[] mas, int k) {
		int sum=0;
		for (int i = 0; i < mas.length; i++) {
		if (mas[i]% k ==0) {
			sum = sum +mas[i];
			}
		}
		if (sum==0) {
			System.out.println("Ќет подход€щеих чисел, сумму невозможно высчитать");
		}
		return sum;
	}
	
	public static void printResult(int sum) {
		System.out.println("«начение:"+sum);
	}
}