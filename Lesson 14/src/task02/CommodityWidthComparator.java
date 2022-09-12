package task02;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return (int)(o1.getProductWidth()-o2.getProductWidth());
	}
}