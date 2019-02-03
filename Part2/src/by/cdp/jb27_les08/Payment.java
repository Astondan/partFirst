package by.cdp.jb27_les08;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	private static List<Good> goods = new ArrayList<Good>();

	public Payment() {
	}

	public static List<Good> getGoods() {
		return goods;
	}

	public void add(Good good) {
		goods.add(good);

	}

}
