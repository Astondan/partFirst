package by.cdp.jb27_les02;

import java.util.Scanner;

public class Lesson2_Task2 {
	public static void main (String args[]) {
		double r = 0; // ���������� �������
		double c; // ���������� ����� ����������
		double s; // ���������� ������� �����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������:");
				while (!sc.hasNextDouble()) {
					System.out.println("����� ������ �� ����������");
					sc.next();
					System.out.println("������� ������:");
				} 
				r = sc.nextDouble();
				if (r<=0) {
					System.out.println("����� ������ �� ����������");
					
				}
				else {
			c=r*2*3.14;
			s=3.14*r*r;
			System.out.println("����� ����������:" + c);
			System.out.println("������� �����:" + s);			
				}
	}
}
