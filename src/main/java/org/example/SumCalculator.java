package org.example;

public class SumCalculator {
	public int sum(int number){

		if (number == 0){
			throw new IllegalArgumentException("Can't sum 0");
		}

		if (number  == 1){
			return 1;
		}

		int result = 0;
		for (int i = 0; i <= number ; i++) {
			result += i;
		}
		return result;
	}
}
