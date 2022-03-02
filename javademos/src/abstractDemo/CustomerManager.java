package abstractDemo;

public class CustomerManager {
	BaseDatabaseManager baseDatabaseManager;
	
	public CustomerManager(BaseDatabaseManager baseDatabaseManager) {
		super();
		this.baseDatabaseManager = baseDatabaseManager;
	}

	public void getCustomers() {
		baseDatabaseManager.getData();
	}
}
