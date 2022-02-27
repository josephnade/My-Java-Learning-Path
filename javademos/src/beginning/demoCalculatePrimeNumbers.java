package beginning;

public class demoCalculatePrimeNumbers {
	public static void main(String[] args) {
		int number = 2;
		boolean isPrime = true;
		for(int i= 2; i<(number/2)+1;i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime == true) {
			System.out.println(number+" is Prime!!!");
		}
		else {
			System.out.println(number+ " is not Prime!!!");
		}
	}
}
