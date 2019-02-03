package by.cdp.jb27_les11;

import java.util.Comparator;

class Book1PriceComparator implements Comparator<ProgrammerBook1> {

	@Override
		public int compare(ProgrammerBook1 o1, ProgrammerBook1 o2) {
			if(o1.getPrice()>o2.getPrice()) {
				return 1;
			}
			if (o1.getPrice()<o2.getPrice()) {
				return -1;
			}
			return 0;
		}


}
