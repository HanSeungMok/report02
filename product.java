package report02;

public class product implements Comparable<product>{

	private String productName;
	private int productNum;
	
	public product(String productName, int productNum) {
		this.productName = productName;
		this.productNum = productNum;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int getProductNum() {
		return productNum;
	}
	
	@Override
	public int compareTo(product compareProduct) {
		// TODO Auto-generated method stub
		return this.productNum - compareProduct.productNum;
	}
	public String toString() {
		return "productName: " + productName + "productNum: " + productNum;
	}
}
