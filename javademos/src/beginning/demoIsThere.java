package beginning;

public class demoIsThere {
	public static void main(String[] args) {
		int[] numbers = {1,2,4,7,8,9,0};
		int wanted = 5;
		boolean isThere = false;
		for(int number: numbers) {
			if(number == wanted) {
				isThere = true;
			}
		}
		if(isThere == true) {
			System.out.println("There is.");
		}
		else {
			System.out.println("There is not.");
		}
	}
}
