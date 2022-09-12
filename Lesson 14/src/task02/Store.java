package task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Store {

	ArrayList<Commodity> store = new ArrayList<Commodity>();

	public void addCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of product");
		String productName = scanner.next();
		System.out.println("Enter length of product");
		scanner = new Scanner(System.in);
		double productLength = scanner.nextDouble();
		System.out.println("Enter width of product");
		scanner = new Scanner(System.in);
		double productWidth = scanner.nextDouble();
		System.out.println("Enter weight of product");
		scanner = new Scanner(System.in);
		double productWeight = scanner.nextDouble();

		Commodity commodity = new Commodity(productName, productLength, productWidth, productWeight);
		store.add(commodity);
		System.out.println("Commodity" + commodity.toString() + "successfully added.");
	}

	public void showAllCommodity() {
		Iterator<Commodity> iterator = store.iterator();
		System.out.println("All commodities in the store: ");
		while (iterator.hasNext()) {
			if (iterator.hasNext()) {
				Commodity next = iterator.next();
				System.out.println(next.toString());
			} else if (!iterator.hasNext()) {
				System.out.println("There is no commodities.");
			}
		}
	}

	public void removeCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of product");
		String productName = scanner.next();
		System.out.println("Enter length of product");
		scanner = new Scanner(System.in);
		double productLength = scanner.nextDouble();
		System.out.println("Enter width of product");
		scanner = new Scanner(System.in);
		double productWidth = scanner.nextDouble();
		System.out.println("Enter weight of product");
		scanner = new Scanner(System.in);
		double productWeight = scanner.nextDouble();

		boolean flag = isCommodityExist(store, productName, productLength, productWidth, productWeight);

		if (flag) {
			Iterator<Commodity> iterator = store.iterator();

			while (iterator.hasNext()) {
				Commodity next = iterator.next();
				if (next.getProductName().equalsIgnoreCase(productName) && next.getProductLength() == productLength
						&& next.getProductWidth() == productWidth && next.getProductWeight() == productWeight) {
					iterator.remove();
					System.out.println("Commodity" + next.toString() + " successfully removed.");
				}
			}
		} else {
			System.out.println("There is no commodity with that name.");
		}

	}

	public void replaceCommodity() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of product");
		String productName = scanner.next();
		System.out.println("Enter length of product");
		scanner = new Scanner(System.in);
		double productLength = scanner.nextDouble();
		System.out.println("Enter width of product");
		scanner = new Scanner(System.in);
		double productWidth = scanner.nextDouble();
		System.out.println("Enter weight of product");
		scanner = new Scanner(System.in);
		double productWeight = scanner.nextDouble();

		boolean flag = isCommodityExist(store, productName, productLength, productWidth, productWeight);

		if (flag) {
			Iterator<Commodity> iterator = store.iterator();

			while (iterator.hasNext()) {
				Commodity next = iterator.next();
				if (next.getProductName().equalsIgnoreCase(productName) && next.getProductLength() == productLength
						&& next.getProductWidth() == productWidth && next.getProductWeight() == productWeight) {
					System.out.println("Enter name of new product");
					scanner = new Scanner(System.in);
					String newProductName = scanner.next();
					System.out.println("Enter length of new product");
					scanner = new Scanner(System.in);
					double newProductLength = scanner.nextDouble();
					System.out.println("Enter width of new product");
					scanner = new Scanner(System.in);
					double newProductWidth = scanner.nextDouble();
					System.out.println("Enter weight of new product");
					scanner = new Scanner(System.in);
					double newProductWeight = scanner.nextDouble();
					next.setProductName(newProductName);
					next.setProductLength(newProductLength);
					next.setProductWidth(newProductWidth);
					next.setProductWeight(newProductWeight);
					System.out.println("Entered commodity successfully replaced by " + next.toString());
				}
			}
		} else {
			System.out.println("There is no commodity with that name.");
		}
	}

	public void sortByName() {
		System.out.println("Before sorting:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}

		Collections.sort(store, new CommodityNameComparator());
		System.out.println("After sorting by name:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}
	}

	public void sortByLength() {
		System.out.println("Before sorting:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}

		Collections.sort(store, new CommodityLengthComparator());
		System.out.println("After sorting by length:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}
	}

	public void sortByWidth() {
		System.out.println("Before sorting:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}

		Collections.sort(store, new CommodityWidthComparator());
		System.out.println("After sorting by width:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}
	}

	public void sortByWeight() {
		System.out.println("Before sorting:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}

		Collections.sort(store, new CommodityWeightComparator());
		System.out.println("After sorting by weight:");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}
	}

	public void getSpecificCommodity() {
		System.out.println("Enter id of commodity");
		Scanner scanner = new Scanner(System.in);
		int ordinal = scanner.nextInt();

		if (ordinal < 0 || ordinal > (store.size() - 1)) {
			System.out.println("There is no commodity with this id");
		} else {
			System.out.println(ordinal + " is id of the" + store.get(ordinal).toString());
		}
	}

	private static boolean isCommodityExist(ArrayList<Commodity> store, String productName, double productLength,
			double productWidth, double productWeight) {
		boolean flag = false;
		for (Commodity commodity : store) {
			if (commodity.getProductName().equalsIgnoreCase(productName)
					&& commodity.getProductLength() == productLength && commodity.getProductWidth() == productWidth
					&& commodity.getProductWeight() == productWeight) {

				flag = true;
			}
		}
		return flag;
	}
}