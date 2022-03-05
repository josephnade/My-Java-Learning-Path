package staticDemo;

public class ProductValidator {
	static{
		System.out.println("Static Constructor has been worked!!");
	}
	public static boolean isValid(Product product) {
		if (product.getPrice() > 0 && product.getName().isEmpty() == false) {
			return true;
		} else {
			return false;
		}
	}
	public static class SomethingElse{
		public static void delete() {
			System.out.println("Deleted!");
		}
	}
}
