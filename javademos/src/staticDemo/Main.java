package staticDemo;

import staticDemo.ProductValidator.SomethingElse;

public class Main {
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		SomethingElse.delete();
		Product product = new Product(1, "Mouse", 250);
		manager.add(product);
		//Static fonksiyonlar çalýþtýðýnda constructorlar çalýþmaz fakat çalýþtýrmak istiyorsak static diye tekrar bi constructor kurmak gerekir.
		//inner classlar genelde bir class ý bölümlere ayýrmak için kullanýlýr!
		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.create();
		DatabaseHelper.Connection.closeConnection();
	}

}
