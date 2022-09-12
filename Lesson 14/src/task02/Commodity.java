package task02;

import java.util.Objects;

public class Commodity {

	private String productName;
	private double productLength;
	private double productWidth;
	private double productWeight;

	public Commodity(String productName, double productLength, double productWidth, double productWeight) {
		super();
		this.productName = productName;
		this.productLength = productLength;
		this.productWidth = productWidth;
		this.productWeight = productWeight;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductLength() {
		return productLength;
	}

	public void setProductLength(double productLength) {
		this.productLength = productLength;
	}

	public double getProductWidth() {
		return productWidth;
	}

	public void setProductWidth(double productWidth) {
		this.productWidth = productWidth;
	}

	public double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productLength, productName, productWeight, productWidth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		return Double.doubleToLongBits(productLength) == Double.doubleToLongBits(other.productLength)
				&& Objects.equals(productName, other.productName)
				&& Double.doubleToLongBits(productWeight) == Double.doubleToLongBits(other.productWeight)
				&& Double.doubleToLongBits(productWidth) == Double.doubleToLongBits(other.productWidth);
	}

	@Override
	public String toString() {
		return "[productName=" + productName + ", productLength=" + productLength + ", productWidth="
				+ productWidth + ", productWeight=" + productWeight + "]";
	}
}