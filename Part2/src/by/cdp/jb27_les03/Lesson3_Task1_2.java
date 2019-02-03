package by.cdp.jb27_les03;

import java.util.Scanner;

public class Lesson3_Task1_2 {
	
	public static void main(String[] args) {
		int number = 0;
		int poslZifraKv;
		
		number = figureInput();
		poslZifraKv= figureCalc(number);
		printResult(number, poslZifraKv);
	}
		
		
		public static int figureInput() {
			int number = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("¬ведите число: ");
			while (!sc.hasNextInt()) {
				System.out.print("Ёто не число!");
			sc.next();
			}
			number = sc.nextInt();
			return number;
		}
		
		
		public static int figureCalc(int number) {
		int poslZifra;
		int poslZifraKv=0;
	
		poslZifra = number % 10;
		switch (poslZifra) {
		case 0:
		poslZifraKv = 0;
		break;
		case 1:
		poslZifraKv = 1;
		break;
		case 2:
		poslZifraKv = 4;
		break;
		case 3:
		poslZifraKv = 9;
		break;
		case 4:
		poslZifraKv = 6;
		break;
		case 5:
		poslZifraKv = 5;
		break;
		case 6:
		poslZifraKv = 6;
		break;
		case 7:
		poslZifraKv = 9;
		break;
		case 8:
		poslZifraKv = 4;
		break;
		case 9:
		poslZifraKv = 1;
		break;
		}				
		return poslZifraKv; 
		}
		
		public static void printResult(int number, int poslZifraKv){
			System.out.println(" вадрат числа " + number + " равн€етс€ " + poslZifraKv);
		}
			
}
