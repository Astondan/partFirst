package by.cdp.jb27_les08;

import java.util.List;

public class PaymentStart {
	public static void main(String[] args) {
		Payment Payment1 = new Payment();
		Payment1.add(new Good("item1", 23));
		Payment1.add(new Good("item2", 245));
		Payment1.add(new Good("item3", 64896));

		print(Payment1);
	}

	public static void print(Payment Payment1) {
		List<Good> printGoods = Payment.getGoods();
		System.out.println("Payment: ");
		for (int i = 0; i < printGoods.size(); i++) {
			Good good = printGoods.get(i);
			print(good);
		}
	}

	public static void print(Good good) {
		System.out.println("Good : " + good.getName() + ", price:" + good.getGoodPrice());
	}

}
