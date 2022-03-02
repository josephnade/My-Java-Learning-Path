package abstractDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//or you can do if you do not create constructor in CustomerManager
		//CustomerManager customerManager = new CustomerManager();
		//customerManager.BasedatabaseManager = new OracleDatabaseManager();
		CustomerManager customerManager = new CustomerManager(new MySqlDatabaseManager());
		customerManager.getCustomers();
	}

}
