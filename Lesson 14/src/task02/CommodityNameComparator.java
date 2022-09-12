package task02;

import java.util.Comparator;

public class CommodityNameComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {

		return o1.getProductName().compareToIgnoreCase(o2.getProductName());
	}
}