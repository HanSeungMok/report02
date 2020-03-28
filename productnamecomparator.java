package report02;

import java.util.Comparator;

public class productnamecomparator implements Comparator<product> {

	@Override
	public int compare(product p1, product p2) {
		// TODO Auto-generated method stub
		String productName1 = p1.getProductName();
		String productName2 = p2.getProductName();
		
		return productName1.compareToIgnoreCase(productName2);
	}
	
}
