package staticDemo;


public class ProductManager {
	
	public void add(Product product) {
		if(ProductValidator.isValid(product) == true) {
			System.out.println("Product has been added!");
		}
		else {
			System.out.println("Product has not been added!!!");
		}
	}
}
