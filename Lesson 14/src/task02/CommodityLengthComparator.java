package task02;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {

		return (int) (o1.getProductLength() - o2.getProductLength());
	}
}