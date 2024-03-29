package ar.edu.unq.po2.tp3;
import java.util.List;
import java.util.ArrayList;

public class Counter {
	
	private List<Integer> numbers = new ArrayList<Integer>();
	
	public void addNumber(int number) {
		numbers.add(number);
	}
	
	public List<Integer> getNumbers() {
		return numbers;
	}
	
	public int calculateEvenNumbers() {
		int evenNumbers = 0;
		for(int number : numbers) {
			if(number % 2 == 0) {
				evenNumbers++;
			}
		}
	return evenNumbers;
	}
	
	public int calculateOddNumbers(){
		int oddNumbers = 0;
		for(int number : numbers) {
			if(number % 2 != 0) {
				oddNumbers++;
			}
		}
	return oddNumbers;
	}
	
	public int calculateMultipliesOf(int number){
		int multiplies = 0;
		for(int myNumber : numbers) {
			if(myNumber % number == 0 ) {
				multiplies++;
			}
		}
	return multiplies;
	}
}
