package staticDemo;

public class DatabaseHelper {
	public static class Crud{
		public static void create() {
			System.out.println("Created");
		}
		public static void read() {
			System.out.println("readed");
		}
		public static void update() {
			System.out.println("updated");
		}
		public static void delete() {
			System.out.println("deleted");
		}
	}
	public static class Connection{
		public static void createConnection() {
			System.out.println("Connection has been cretaed!");
		}
		public static void closeConnection() {
			System.out.println("Connection has been closed!");
		}
	}
}
