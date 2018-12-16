package by.cdp.jb27_les03;

import java.util.Scanner;

public class Lesson3_Task1_1 {
	
		public static void main(String[] args) {
		int n=10;
		String [] mas = new String [10];		
		String max = "", min = "";
		readArrayFromConsole(mas);
		min = getMin(mas,n);
		max = getMax(mas,n);
		printResult(min,max);
		}		
		
		public static void readArrayFromConsole(String [] mas) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < mas.length; i++) {
				System.out.print("¬ведите новую строку> ");
				if (sc.hasNextLine()) {
			mas[i] = sc.nextLine();
			}
		}
		}
		
		public static String getMin(String[] mas, int n) {
			String  min = "", str = "";
			for (int i = 0; i < n; i++) {
			if (i == 0) {
				min = mas[i];
				} else if (mas[i].length()< min.length()) {
				min = mas[i];
				}
			}
			return min;
		}
		
		public static String getMax(String[] mas, int n) {
			String  max = "", str = "";
			for (int i = 0; i < n; i++) {
			if (i == 0) {
				max = mas[i];
				} else if (mas[i].length()> max.length()) {
				max = mas[i];
				}
			}
			return max;
		}
		
					
		public static void printResult(String min, String max){
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
		}

}
