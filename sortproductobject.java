package report02;

import java.util.Arrays;

public class sortproductobject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product[] product = new product[3];
		product[0] = new product("a", 11);
		product[1] = new product("z", 13);
		product[2] = new product("x", 10);
		
		System.out.println("[compareTo sort productNum");
		Arrays.sort(product);
		printproduct(product);
		
		System.out.println("[compareTo sort productName");
		Arrays.sort(product, new productnamecomparator());
		printproduct(product);
	}
		public static void printproduct(product[] product) {
			for(product i : product) {
				System.out.println(i);
			}
		}
}
