package ar.edu.unq.po2.tp3;

public class NumberDisarmer {
	
	private int[] numbers;
	
	public NumberDisarmer(int[] numbers) {
		this.numbers = numbers;
	}
	
	public int getNumberWithMostEvenDigits() {
		int maxEvenDigits = 0;
		int numberWithMaxEvenDigits = 0;
		for(int number : numbers) {
			int evenDigits = countDigits(number);
			if(evenDigits > maxEvenDigits) {
				maxEvenDigits = evenDigits;
				numberWithMaxEvenDigits = number;
			}
		}
		return numberWithMaxEvenDigits;
	}

	private int countDigits(int number) {
		int amountOfDigits = 0;
		while(number != 0) {
			int digit = number % 10;
			if(digit % 2 == 0) {
				amountOfDigits++;
			}
			number /= 10;
		}
		return amountOfDigits;
	}
}
