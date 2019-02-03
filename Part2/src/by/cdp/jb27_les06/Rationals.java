package by.cdp.jb27_les06;

import java.util.Scanner;

public class Rationals {
	public int num, den;
	
	public void setNum(){
		int _num=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите делимое очередной дроби: ");
		if (sc.hasNextInt()) {
			_num=sc.nextInt();
			}
		if(_num == 0){
			System.out.println("Делитель не может быть равен нулю, делитель округлен до единицы");
			num=1;
			}else
		if (_num<0) {
			System.out.println("Делимое не может быть меньше нуля, делимое округлено до единицы");
			num=1;	
			}
		else num=_num;
	}
	public String getNum(){
		String strnum = String.valueOf(num);
		return strnum;
	}
	public void setDen(){
		int _den=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите делитель очередной дроби: ");
		if (sc.hasNextInt()) {
			_den=sc.nextInt();
			}
		if(_den == 0){
		System.out.println("Делитель не может быть равен нулю, делитель округлен до единицы");
		den=1;
		}else
		if (_den<0) {
		System.out.println("Делитель не может быть меньше нуля, делитель округлен до единицы");
		den=1;	
		}
		else den=_den;
		}
	public String getDen(){
		String strden = String.valueOf(den);
		return strden;
	}

}
