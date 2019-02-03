package by.cdp.jb27_les01.main;

public class Lesson1_Task4 {
	public static void main(String args[]) {
		double a; // первый катет
		double b; // второй катет
		double c=0; // гипотенуза
		double d; // площадь
		
		a=10; // ввод значения первого катета
		b=20; // ввод значения второго катета
		
		c = Math.sqrt(a * a + b * b); // рассчет гипотенузы
		d= a*b/2; // рассчет площади
		System.out.println("Площадь:"+d+"\nГипотенуза:"+c);
	}

}
