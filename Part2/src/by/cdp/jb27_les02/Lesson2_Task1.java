package by.cdp.jb27_les02;

import java.util.Scanner;

public class Lesson2_Task1 {
	public static void main (String args[]) {
		double a; // ���������� ������ �����������
		double b; // ���������� ������ �����������
		double c; // ���������� ������� �����������
		double sq; // ���������� �������� �����
		double undsq; // ���������� �������� ������ �����
		double chis; // ���������� ���������
		double znam; // ���������� �����������
		double otv; // ���������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� a:");
				while (!sc.hasNextDouble()) {
					System.out.println("��� �� �����");
					sc.next();
				} 
				a = sc.nextDouble();
				
		System.out.println("������� ���������� b:");
		while (!sc.hasNextDouble()) {
			System.out.println("��� �� �����");
			sc.next();
		} 
		b = sc.nextDouble();
		
		System.out.println("������� ���������� c:");
		while (!sc.hasNextDouble()) {
			System.out.println("��� �� �����");
			sc.next();
		} 
		c = sc.nextDouble();
		undsq=b*b+4*a*c;
		if (undsq<0) {
			System.out.println("������ ������� ������ �� �������������� �����");
			otv= Double.NaN;
			}
		sq=Math.sqrt(undsq);
		chis=b+sq;
		znam=2*a;
		if (znam==0) {
			System.out.println("������ ������ �� ����");
			otv= Double.NaN;
		}
		otv=(chis/znam)-(a*a*a*c) +b;
		System.out.println("�����:"+otv);
	}

}
