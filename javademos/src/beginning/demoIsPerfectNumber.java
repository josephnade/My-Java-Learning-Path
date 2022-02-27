package beginning;

public class demoIsPerfectNumber {
	public static void main(String[] args) {
		// 6 -> 1+2+3
		int number = 29;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum+=i;
			}
		}
		if(number == sum) {
			System.out.println(number + " is Perfect Number!");
		}
		else{
			System.out.println(number + " is not Perfect Number!");
		}
	}
}
